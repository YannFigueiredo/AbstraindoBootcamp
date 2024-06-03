package models;

import java.util.Objects;

public abstract class Conteudo {
    private static int SEQUENCIAL = 1;
    private int id;
    private String titulo;
    private String descricao;

    public Conteudo(String titulo, String descricao) {
        this.id = SEQUENCIAL++;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public abstract double calcularXp();

    public abstract void exibirConteudo();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conteudo conteudo = (Conteudo) o;
        return id == conteudo.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
