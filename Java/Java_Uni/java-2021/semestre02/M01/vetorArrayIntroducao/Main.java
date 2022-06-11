package semestre02.M01.vetorArrayIntroducao;

import semestre02.M01.vetorArrayIntroducao.Vetor;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(3);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");

        System.out.println(vetor);


        /*
        Vetor vetor = new Vetor(10);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");

        System.out.println(vetor);

        vetor.adiciona(0,"A");

        System.out.println(vetor);

         vetor.adiciona(3,"D");

        System.out.println(vetor);
        */

        /*
        try {
            vetor.adiciona("Elemento 01");
            vetor.adiciona("Elemento 02");
            vetor.adiciona("Elemento 03");
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(vetor.tamanho());

        System.out.println(vetor);

        System.out.println(vetor.busca(2));

        System.out.println(vetor.busca("Elemento 01"));
        System.out.println(vetor.busca("Elemento 05"));
    */
    }
}
