package semestre02.M01.vetorSaida;

import semestre02.M01.vetorArrayIntroducao.Vetor;

public class TesteRemovePosicao {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);
        vetor.adiciona("B");
        vetor.adiciona("G");
        vetor.adiciona("D");
        vetor.adiciona("E");
        vetor.adiciona("F");

        System.out.println(vetor);

        vetor.remove(1);

        System.out.println(vetor);

        int pos = vetor.busca("A");
        if (pos > -1){
            vetor.remove(pos);
            System.out.println(vetor);
        } else
            System.out.println("Posição não existe no Vetor!");
    }
}
