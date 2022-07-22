package code.font.test;

import code.font.model.Bootcamp;
import code.font.model.Curso;
import code.font.model.Dev;
import code.font.model.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Curso Java", "POO",2);
        Curso curso2 = new Curso("Curso JavaScript", "Estrutural", 3);
        Curso curso3 = new Curso("Curso React", "Estrutural", 3);

        Mentoria mentoria = new Mentoria("Mentoria em Java", "Java", LocalDate.now());
//        System.out.println(curso+"\n"+curso2+"\n"+mentoria);

        //Bootcamp(s)
        Bootcamp boot = new Bootcamp();
        boot.setNome("Bootcamp Java Developer");
        boot.setDescricao("Descrição Bootcamp Java Developer");
        boot.getConteudos().add(curso);
        boot.getConteudos().add(curso2);
        boot.getConteudos().add(curso3);
        boot.getConteudos().add(mentoria);

        //Devs
        Dev dev = new Dev();
        dev.inscreverBootcamp(boot);
        dev.setNome("Bruna");
        System.out.println("**Bruna\nInscritos: "+dev.getConteudosInscritos());
        System.out.println("Concluidos: "+dev.getConteudosConcluidos());
        dev.progredir();
        System.out.println("Inscritos: "+dev.getConteudosInscritos());
        System.out.println("Concluidos: "+dev.getConteudosConcluidos()+"\n------------\n");
        System.out.println("XP: "+dev.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("Lara");
        dev2.inscreverBootcamp(boot);
        System.out.println("**Lara\nInscritos: "+dev2.getConteudosInscritos());
        System.out.println("Concluidos: "+dev2.getConteudosConcluidos());
        dev2.progredir();
        dev2.progredir();
        System.out.println("Inscritos: "+dev2.getConteudosInscritos());
        System.out.println("Concluidos: "+dev2.getConteudosConcluidos()+"\n------------\n");
        System.out.println("XP: "+dev2.calcularTotalXp());

        Dev dev3 = new Dev();
        dev3.setNome("Luiza");
        dev3.inscreverBootcamp(boot);
        System.out.println("**Luiza\nInscritos: "+dev3.getConteudosInscritos());
        System.out.println("Inscritos: "+dev3.getConteudosConcluidos());
        dev3.progredir();
        dev3.progredir();
        dev3.progredir();
        System.out.println("Inscritos: "+dev3.getConteudosInscritos());
        System.out.println("Concluidos: "+dev3.getConteudosConcluidos());
        System.out.println("XP: "+dev3.calcularTotalXp());


    }
}
