import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso  curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devMarcio = new Dev();
        devMarcio.setNome("Marcio");
        devMarcio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Marcio" + devMarcio.getConteudosIncritos());
        devMarcio.progredir();
        System.out.println("Conteúdos Incritos Marcio" + devMarcio.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos Marcio" + devMarcio.getConteudosConcluidos());
        System.out.println("XP: " + devMarcio.calcularTotalXP());

        System.out.println("|<--------------------------->|");

        Dev  devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Camila" + devCamila.getConteudosIncritos());
        devCamila.progredir();
        System.out.println("Conteúdos Incritos Camila" + devCamila.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP " + devCamila.calcularTotalXP());


    }
}
