import models.Conteudo;
import models.Mentoria;

public class Main {
    public static void main(String[] args) {
        Conteudo mentoria = new Mentoria("Mentoria Java", "Descrição da mentoria");

        System.out.println(mentoria);
    }
}