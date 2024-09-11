import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição de javinha");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso javaScript");
        curso2.setDescricao("Descrição de javin.. Eca");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Python");
        mentoria.setDescricao("Descricionando Python");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Transformando você em um dev LEGÍTMO");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGui = new Dev();
        devGui.setNome("Guilherme");
        devGui.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Guilherme: " + devGui.getConteudosInscritos());

        devGui.progredir();
        devGui.progredir();

        System.out.println("Conteúdos Inscritos Guilherme: " + devGui.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Guilherme: " + devGui.getConteudosConcluidos());
        System.out.println("XP:" + devGui.calcularTotalXp());

        System.out.println("------------");

        Dev devCamilla = new Dev();
        devCamilla.setNome("CamillaDio");
        devCamilla.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camilla: " + devCamilla.getConteudosInscritos());

        devCamilla.progredir();
        devCamilla.progredir();
        devCamilla.progredir();

        System.out.println("Conteúdos Inscritos Camilla: " + devCamilla.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camilla: " + devCamilla.getConteudosConcluidos());
        System.out.println("XP:" + devCamilla.calcularTotalXp());

    }
}