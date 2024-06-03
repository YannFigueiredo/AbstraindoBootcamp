package models;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private static int SEQUENCIAL = 1;
    private int id;
    private String nome;
    private String cpf;
    private Set<Conteudo> conteudosInscritos;
    private Set<Conteudo> conteudosConcluidos;

    public Dev(String nome, String cpf) {
        this.id = SEQUENCIAL++;
        this.nome = nome;
        this.cpf = cpf;
        this.conteudosInscritos = new LinkedHashSet<>();
        this.conteudosConcluidos = new LinkedHashSet<>();
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        if(!bootcamp.getConteudo().isEmpty()) {
            this.conteudosInscritos.addAll(bootcamp.getConteudo());
        } else {
            System.out.println("O Bootcamp não têm conteúdo cadastrado!");
        }
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();

        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }
    }

    public double totalXp() {
        return (
            !this.conteudosConcluidos.isEmpty() ?
            this.conteudosConcluidos.stream().map(c -> c.calcularXp()).mapToDouble(c -> c).sum() : 0
        );
    }

    public void exibirCursos() {
        System.out.println("\n=== CONTEÚDOS INSCRITOS ===\n");

        this.conteudosInscritos.forEach(c -> c.exibirConteudo());

        System.out.println("\n=== CONTEÚDOS CONCLUÍDOS ===\n");

        this.conteudosConcluidos.forEach(c -> c.exibirConteudo());
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return id == dev.id && Objects.equals(cpf, dev.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cpf);
    }

    @Override
    public String toString() {
        return "Dev{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", conteudosInscritos=" + conteudosInscritos +
                ", conteudosConcluidos=" + conteudosConcluidos +
                '}';
    }
}
