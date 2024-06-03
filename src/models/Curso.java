package models;

public class Curso extends Conteudo {
    private double cargaHoraria;

    public Curso(String titulo, String descricao, double cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return 7 * this.cargaHoraria;
    }

    @Override
    public void exibirConteudo() {
        System.out.printf("\nId: %d", getId());
        System.out.printf("\nTítulo: %s", getTitulo());
        System.out.printf("\nDescrição: %s", getDescricao());
        System.out.printf("\nCarga Horária: %.2fh\n", this.cargaHoraria);
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return String.format("Curso: {" +
                        "Id: %d, " +
                        "Título: %s, " +
                        "Descrição: %s, " +
                        "Carga Horária: %.2fh" +
                        "}",
                getId(),
                getTitulo(),
                getDescricao(),
                this.cargaHoraria
        );
    }
}
