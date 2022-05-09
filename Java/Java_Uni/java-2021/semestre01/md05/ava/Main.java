package semestre01.md05.ava;

public class Main {
    public static void main(String[] args) {
        LanHouse lh = new LanHouse();

        // Computer's Object
        Computador c2 = new Computador(2, 0, "A2", 310.00, "X-Force", "I9");
        Computador c3 = new Computador(3, 0, "A3", 420.00, "X-Force", "I3");
        Computador c4 = new Computador();

        // Add Computers
        lh.adicione(new Computador(1, 0, "A1", 256.00, "X-Force", "I7"));
        lh.adicione(c2);
        lh.adicione(c3);

        // Method 01 - Nomeado em .listaPC()
        System.out.println("\n---> MÉTODO 01 <---");
        lh.listaPc();  // Método

        // Method 02 - Nomeado em .adicione(Computador computador)
        System.out.println("\n\n---> MÉTODO 02 <---");
        System.out.println("\nAntes : *** Lista de Computadores ***");
        lh.computadorSet.forEach(System.out::println);
        lh.adicione(c4); // Método
        System.out.println("\nDepois : *** Lista de Computadores ***");
        lh.computadorSet.forEach(System.out::println);

        // Method 03 - Nomeado em .remove(Computador computador)
        System.out.println("\n\n---> MÉTODO 03 <---");
        System.out.println("\nAntes : *** Lista de Computadores ***");
        lh.computadorSet.forEach(System.out::println);
        lh.remove(c4); // Método
        System.out.println("\nDepois : *** Lista de Computadores ***");
        lh.computadorSet.forEach(System.out::println);

        // Method 04 - Nomeado em .aluga(Computador computador)
        System.out.println("\n\n---> MÉTODO 04 <---");
        lh.alugar(c2); // Método
        System.out.println("\n*** Lista de Computadores ***");
        lh.computadorSet.forEach(System.out::println);

        // Method 05 - Nomeado em .defeito(Computador computador, Defeito defeito)
        System.out.println("\n\n---> MÉTODO 05 <---");
        lh.defeitoSet.forEach(System.out::println);
        lh.defeito(c3, "25/06/2021", "Teclado estragado.");// Método
        System.out.println("\n*** Lista de Computadores ***");
        lh.computadorSet.forEach(System.out::println);
        System.out.println("\n*** Lista de Defeitos ***");
        lh.defeitoSet.forEach(System.out::println);

    }
}
