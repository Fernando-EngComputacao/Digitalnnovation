package semestre02.M02.Saida;

import semestre02.M02.CodigoFonte.Pilha.Pilha;

public class Aula16_VerificarElementoDoTopoPilha {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println(pilha);
        System.out.println(pilha.topo());

        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);

        System.out.println(pilha);
        System.out.println(pilha.topo());

    }
}
