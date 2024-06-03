package models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo {
    private DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate data = LocalDate.now();

    public Mentoria(String titulo, String descricao) {
        super(titulo, descricao);
    }

    @Override
    public double calcularXp() {
        return 0;
    }

    public LocalDate getData() {
        return data;
    }

    public String getDataFormatada() {
        return data.format(formatador);
    }

    @Override
    public String toString() {
        String dataFormatada = data.format(formatador);

        return String.format("Mentoria: {" +
                "Id: %d, " +
                "Título: %s, " +
                "Descrição: %s, " +
                "Data: %s" +
                "}",
                getId(),
                getTitulo(),
                getDescricao(),
                dataFormatada
                );
    }
}
