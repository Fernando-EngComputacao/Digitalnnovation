package semestre01.md05.usandoMap.usandoTreeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("C", "Letra C");
        map.put("B", "Letra B");
        map.put("D", "Letra D");

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
