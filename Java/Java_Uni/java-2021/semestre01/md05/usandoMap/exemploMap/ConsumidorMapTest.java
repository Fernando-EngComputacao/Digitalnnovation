package semestre01.md05.usandoMap.exemploMap;

import java.util.HashMap;
import java.util.Map;

import semestre01.md05.usandoSet.Produto;

public class ConsumidorMapTest {
    public static void main(String[] args) {
        // Object Consumidor
        Consumidor consumidor = new Consumidor("Deborah", "523.456.896-23");
        Consumidor consumidor2 = new Consumidor("Deborah2", "823.456.896-23");

        // Object Produto
        Produto p1 = new Produto("Sorvete", 5.00);
        Produto p2 = new Produto("HandSet", 0.00);
        Produto p3 = new Produto("Star", 1.00);
        Produto p4 = new Produto("Moon", 2.00);

        // Map
        Map<Consumidor, Produto> map = new HashMap<>();
        map.put(consumidor, p1);
        map.put(consumidor, p2);
        map.put(consumidor2, p3);
        map.put(consumidor2, p4);

        // For
        for (Map.Entry<Consumidor, Produto> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
