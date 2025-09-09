import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("curso C#");
        curso3.setDescricao("descrição curso C#");
        curso3.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setDate(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp C# Developer");
        bootcamp2.setDescricao("Descrição Bootcamp C# Developer");
        bootcamp2.getConteudos().add(curso3);




        Dev devCamila = new Dev();
        System.out.println(devCamila.getConteudosInscritos());
        devCamila.inscreverBootcamp(bootcamp2);
        System.out.println(devCamila.getConteudosInscritos());
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println(devCamila.getConteudosInscritos());
        System.out.println(devCamila.calcularTotalXp());
        System.out.println(devCamila.getConteudosConcluidos());
        System.out.println(devCamila.getConteudosInscritos());
        System.out.println(devCamila.calcularTotalXp());
        System.out.println(devCamila.getConteudosConcluidos());
        devCamila.verificarBootcampConcluidos();
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        devCamila.verificarBootcampConcluidos();



    }
}