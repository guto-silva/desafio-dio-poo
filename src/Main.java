import br.dev.guto.desafio.dominio.Bootcamp;
import br.dev.guto.desafio.dominio.Curso;
import br.dev.guto.desafio.dominio.Dev;
import br.dev.guto.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("JAVA");
        curso1.setCargaHoraria(30);
        curso1.setDescricao("Aprendendo a programar com Java");

        Curso curso2 = new Curso();

        curso2.setTitulo("POO com Java");
        curso2.setCargaHoraria(40);
        curso2.setDescricao("Aprenda Orientação a Objetos com Java");

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de Carreira");
        mentoria.setDescricao("Desenvolva sua carreira profissional com ajuda de especialistas");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Formação profissional para desenvolvedores Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev pernalonga = new Dev();
        pernalonga.setNome("Pernalonga");
        pernalonga.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + pernalonga.getConteudosInscritos());
        pernalonga.progredir();
        System.out.println("Conteúdos Concluídos: " + pernalonga.getConteudosConcluidos());
        System.out.println("XP: " + pernalonga.calcularTotalXp());

        System.out.println("--------------------------------------------------------------------------------");

        Dev patolino = new Dev();
        patolino.setNome("Patolino");
        patolino.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + patolino.getConteudosInscritos());
        patolino.progredir();
        System.out.println("Conteúdos Concluídos: " + patolino.getConteudosConcluidos());
        System.out.println("XP: " + patolino.calcularTotalXp());
    }
}