package semestre02.M02.Saida;

import semestre02.M02.CodigoFonte.Pilha.Pilha;

import java.util.Stack;

public class Aula18_Stack {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();
        Stack<Integer> stack = new Stack<Integer>();

        System.out.println(stack);
        System.out.println(stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);
        System.out.println(stack.isEmpty());

        System.out.println(stack);
        System.out.println(stack.size());

        //Espiar
        System.out.println(stack);
        System.out.println(stack.peek());

        // Remove a última posição
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);

    }
}
