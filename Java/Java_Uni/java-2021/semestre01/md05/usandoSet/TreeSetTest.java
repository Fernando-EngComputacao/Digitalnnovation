package semestre01.md05.usandoSet;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Produto p1 = new Produto("Sorvete", 5.00);
        Produto p2 = new Produto("HandSet", 0.00);
        Produto p3 = new Produto("Star", 1.00);
        Produto p4 = new Produto("Moon", 2.00);

        class ProdutoNomeComparator implements Comparator<Produto> {
            @Override
            public int compare(Produto p1, Produto p2){
                return p1.getNome().compareTo(p2.getNome());
            }
        }

        NavigableSet<Produto> produtoNavigableSet = new TreeSet<>(new ProdutoNomeComparator());
        produtoNavigableSet.add(p1); produtoNavigableSet.add(p2);
        produtoNavigableSet.add(p3); produtoNavigableSet.add(p4);
        produtoNavigableSet.forEach(System.out::println);

        System.out.println("-----------------");

        // Método Lower < (retorno o menor produto anterior ao produto passado como parâmetro)
        System.out.println("Lower\n" + produtoNavigableSet.lower(p3) + "\n");

        // Método Floor <=
        System.out.println("Floor\n" + produtoNavigableSet.floor(p3) + "\n");

        // Método Higher >
        System.out.println("Higher\n" + produtoNavigableSet.higher(p1) + "\n");

        // Método Ceiling >=
        System.out.println("Ceiling\n" + produtoNavigableSet.ceiling(p3) + "\n");

        // Método PollFirst (retorno o primeiro objeto e o remove)
        System.out.println("PollFirst\n" + produtoNavigableSet.pollFirst() + "\n");

        // Método PollLas (retorno o primeiro objeto e o remove)
        System.out.println("PollLast\n" + produtoNavigableSet.pollLast() + "\n");


    }
}
