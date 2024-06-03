package models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo {
    private DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate data;

    public Mentoria(String titulo, String descricao) {
        super(titulo, descricao);
        this.data = LocalDate.now();
    }

    @Override
    public double calcularXp() {
        return 500.0;
    }

    @Override
    public void exibirConteudo() {
        System.out.printf("\nId: %d", getId());
        System.out.printf("\nTítulo: %s", getTitulo());
        System.out.printf("\nDescrição: %s", getDescricao());
        System.out.printf("\nData: %s\n", getDataFormatada());
    }

    public LocalDate getData() {
        return data;
    }

    public String getDataFormatada() {
        return data.format(formatador);
    }

    @Override
    public String toString() {
        return String.format("Mentoria: {" +
                "Id: %d, " +
                "Título: %s, " +
                "Descrição: %s, " +
                "Data: %s" +
                "}",
                getId(),
                getTitulo(),
                getDescricao(),
                getDataFormatada()
        );
    }
}
