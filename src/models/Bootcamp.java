package models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private static int SEQUENCIAL = 1;
    private int id;
    private String nome;
    private String descricao;
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private Set<Conteudo> conteudo;

    public Bootcamp(String nome, String descricao) {
        this.id = SEQUENCIAL++;
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicial = LocalDate.now();
        this.dataFinal = LocalDate.now().plusDays(90);
        this.conteudo = new HashSet<>();
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public String getDataInicialFormatada() {
        return dataInicial.format(formatador);
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public String getDataFinalFormatada() {
        return dataFinal.format(formatador);
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Set<Conteudo> getConteudo() {
        return conteudo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return id == bootcamp.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return String.format("Bootcamp: {" +
                        "Id: %d, " +
                        "Nome: %s, " +
                        "Data Inicial: %s, " +
                        "Data Final: %s, " +
                        "Descrição: %s," +
                        "Conteúdo:  %s" +
                        "}",
                this.id,
                this.nome,
                getDataInicialFormatada(),
                getDataFinalFormatada(),
                this.descricao,
                this.conteudo
        );
    }
}
