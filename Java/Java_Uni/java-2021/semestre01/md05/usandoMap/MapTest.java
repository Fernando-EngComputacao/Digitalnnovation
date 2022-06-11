package semestre01.md05.usandoMap;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        // Map<Chave, Valor>
        Map<String, String> map = new HashMap<>();
        map.put("fernando", "Fernando");
        map.put("furtado", "Furtado");

        // map.keySet() -> Pegar as chaves do Map
        // map.values() -> Pegar os valores do Map

        // Para apresentar apenas as chaves ou os valores
        for (String key : map.keySet()){
            System.out.println(key);
        }

        // Para apresentar apenas as chaves e os valores
        for (Map.Entry<String, String>  entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
