package semestre02.M02.CodigoFonte.ArrayList;

import java.util.ArrayList;

public class Aula12_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("A");
        al.add("C");

        System.out.println(al);

        al.add(1, "B");

        System.out.println(al);

        boolean exite = al.contains("A");
        String aux = "";
        if (exite){
            aux = "Elemento existe no Array.";
        } else
            aux = "Elemento não existe no Array.";

        System.out.println(aux);

    }
}
