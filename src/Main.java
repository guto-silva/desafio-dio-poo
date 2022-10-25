import br.dev.guto.desafio.dominio.Curso;
import br.dev.guto.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("JAVA");
        curso1.setCargaHoraria(30);
        curso1.setDescricao("Aprendendo a programar com Java");

        Curso curso2 = new Curso();

        curso2.setDescricao("POO com Java");
        curso2.setCargaHoraria(40);
        curso2.setDescricao("Aprenda Orientação a Objetos com Java");

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de Carreira");
        mentoria.setDescricao("Desenvolva sua carreira profissional com ajuda de especialistas");
        mentoria.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}