package semestre02.M02.Saida;

import semestre02.M02.CodigoFonte.Pilha.Pilha;

public class Aula15_VerificarPilhaVazia {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println(pilha.estaVazia());

        pilha.empilha(1);

        System.out.println(pilha.estaVazia());

    }
}
