package semestre01.md05.usandoSet;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;

public class SetTest {
    public static void main(String[] args) {
        Produto p1 = new Produto("Sorvete", 5.00);
        Produto p2 = new Produto("HandSet", 0.00);
        Produto p3 = new Produto("Star", 1.00);
        Produto p4 = new Produto("Moon", 2.00);

        //Set em HashSet
        Set<Produto> produtoSet = new HashSet<>();
        produtoSet.add(p1); produtoSet.add(p2);
        produtoSet.add(p3); produtoSet.add(p4);
        produtoSet.forEach(System.out::println);
        System.out.println();

        //Set em HashSet
        Set<Produto> produtoSet2 = new LinkedHashSet<>();
        produtoSet2.add(p1); produtoSet2.add(p2);
        produtoSet2.add(p3); produtoSet2.add(p4);
        produtoSet2.forEach(System.out::println);
    }
}
