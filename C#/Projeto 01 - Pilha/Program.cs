using System;

namespace Projeto01 {
    class Program {

        static void Main(string[] args) {
            Pilha pilha = new Pilha();

            pilha.Empilha(1);
            pilha.Empilha(2);
            pilha.Empilha(3);

            Console.WriteLine(pilha.Desempilha());
            Console.WriteLine(pilha.Desempilha());
            Console.WriteLine(pilha.Desempilha());

            //int n = 5;
            //for (int i = 0; i < 5; i++) {
            //    Console.WriteLine($"Seu endereço ID é: {i}");
            //}

        }
    }
}
