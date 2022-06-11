package semestre02.M02.Saida;

import semestre02.M02.CodigoFonte.Pilha.Pilha;

public class Aula17_DesemplilharPilha {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);
        pilha.empilha(4);
        pilha.empilha(5);

        System.out.println(pilha);

        for (int i=4; i>=0; i--){
            System.out.println("Desempilhando elementos " + pilha.desempilha());
            System.out.println(pilha);
        }
    }
}
