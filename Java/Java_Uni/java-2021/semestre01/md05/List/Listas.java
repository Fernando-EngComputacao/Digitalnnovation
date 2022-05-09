package semestre01.md05.List;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Fernando");
        nomes.add("Furtado");

//        for (Object nome: nomes) {
//            System.out.println(nome);
//        }
        // ou

        nomes.forEach(System.out::println);
    }

}
