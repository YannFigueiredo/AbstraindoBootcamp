import models.*;

public class Main {
    public static void main(String[] args) {
        Conteudo mentoria = new Mentoria("Mentoria Java", "Descrição da mentoria");
        Conteudo curso = new Curso("Curso Java", "Descrição do curso", 80);
        Conteudo curso2 = new Curso("Curso Spring Boot", "Descrição de Spring Boot", 120);
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java", "Descrição do bootcamp");
        bootcamp.getConteudo().add(mentoria);
        bootcamp.getConteudo().add(curso);
        bootcamp.getConteudo().add(curso2);

        mentoria.exibirConteudo();
        curso.exibirConteudo();
        curso2.exibirConteudo();
        System.out.println(bootcamp);

        Dev yannDev = new Dev("Yann Figueireoo", "12345678925");
        yannDev.inscreverBootcamp(bootcamp);
        System.out.println(yannDev);
        yannDev.exibirCursos();
        yannDev.progredir();
        yannDev.progredir();
        System.out.println(yannDev);
        System.out.println("Total XP: " + yannDev.totalXp());
        yannDev.exibirCursos();
    }
}