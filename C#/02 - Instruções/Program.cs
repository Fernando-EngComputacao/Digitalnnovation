using System;

namespace _02___Instruções {
    class Program {
        public static void Main(string[] args) {

            // Declaracoes();
            InstrucaoUsing();
        }

        public static void Declaracoes(){
            int a,b,c;
            a = 1; b = 2; c = 3;
            const int d = 4;

            Console.WriteLine("O resultado é: {0}.", (a+b+c+d));
        }

        static void InstrucaoSwitch(string[] args){
            int numeroDeArgumentos = args.Length;
            switch (numeroDeArgumentos)
            {
                case 0:
                    Console.WriteLine("Nenhum argumento!");
                    break;

                case 1:
                    Console.WriteLine("Um argumento!");
                    break;

                default:
                    Console.WriteLine($"{numeroDeArgumentos} argumentos!");
                    break;

            }
        }

        static void InstrucaoIf(string[] args){
            if (args.Length <=0) {
                Console.WriteLine("Nenhum argumento!");
            }
            else if (args.Length == 1) {
                Console.WriteLine("Um argumento!");
            }
            else{
                Console.WriteLine($"{args.Length} argumentos!");
            }
        }

        static void InstrucaoWhile(string[] args){
            int i = 0;

            while (i < args.Length)
            {
                Console.WriteLine(args[i]);
                i++;
            }
        }

        static void InstrucaoDo(string[] args){
            string text;
            do
            {
                text = Console.ReadLine();
                Console.WriteLine(text);
            } while (!string.IsNullOrEmpty(text));
        }

        static void InstrucaoFor(string[] args){
            for (int i = 0; i < args.Length; i++)
            {
                Console.WriteLine(args[i]);
            }
        }
        
        static void InstrucaoForEach(string[] args){
            foreach (string s in args)
            {
                    Console.WriteLine(s);
            }
        }

        static void InstrucaoBreak(string[] args){
            while (true)
            {
                 string s = Console.ReadLine();

                 if (string.IsNullOrEmpty(s))
                 {
                     break;
                 }
                 Console.WriteLine(s);
            }
        }

        static void InstrucaoContinue(string[] args){

            for (int i = 0; i < args.Length; i++)
            {
                if (args[i].StartsWith("/"))
                {
                    continue;
                } 
                Console.WriteLine(args[i]);
                
                
            }
        }

        static void InstrucaoReturn(){
            
            int Somar(int a, int b)
            {
                return a+b;
            }

            Console.WriteLine(Somar(1,2));
            Console.WriteLine(Somar(3,4));
            Console.WriteLine(Somar(5,6));
            // Quando aparece um RETURN o método para de ler as linhas.
            // Logo, após o RETURN as linhas seguintes não serão lidas pelo software.
            return;
        }

        static void InstrucaoTryCatchFinally(string[] args){
            
            double Dividir(double x, double y)
            {
                if (y == 0)
                    throw new DivideByZeroException();

                return x / y;

                try
                {
                    if (args.Length != 2)
                    {
                        throw new InvalidOperationException("Informe 2 números!");
                    }

                    double a = double.Parse(args[0]);
                    double b = double.Parse(args[1]);
                    Console.WriteLine(Dividir(a,b));
                }
                catch (InvalidOperationException e)
                {
                    Console.WriteLine(e.Message);
                }
                catch (Exception e)
                {
                    Console.WriteLine($"Erro genérico: {e.Message}");
                }
                finally
                {
                    Console.WriteLine("Até logo!");
                }
            }
        }

        static void InstrucaoUsing(){


                using (System.IO.TextWriter w = System.IO.File.CreateText("teste.txt"))
            {
                w.WriteLine("Line 1");
                w.WriteLine("Line 2");
                w.WriteLine("Line 3");
            }


            // OU


            // System.IO.TextWriter w;
            // w = System.IO.File.CreateText("teste.txt");
            
            // w.WriteLine("Line 1");
            // w.WriteLine("Line 2");
            // w.WriteLine("Line 3");

            // w.Dispose();
           
        }
    }
}
