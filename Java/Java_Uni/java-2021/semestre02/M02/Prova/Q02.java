package semestre02.M02.Prova;

import java.util.ArrayList;

public class Q02 {
    private ArrayList<String> lista = new ArrayList<String>();
    private String resul = "Correto!";


    public Q02(String text) {
        this.adicionaTexto(text);
    }

    public Q02() {
    }

    public void adicionaTexto(String text) {
        int tmh = text.length();

        for (int i = 1; i < tmh + 1; i++) {
            this.lista.add(text.substring(i - 1, i));
        }
    }

    public String verifica() {
        if (this.condicao())
            this.condicao2();

        return this.resul;
    }

    public boolean condicao() {
        int p, p2;
        p = p2 = 0;

        for (int i = 0; i < this.lista.size(); i++) {
            if ("(".equals(lista.get(i))) {
                p++;

            }
            if (")".equals(lista.get(i))) {
                p2++;
            }
        }


        if (p != p2) {
            this.resul = "-> Viola a Condição 01.";
            System.out.println(this.lista);
            return false;
        } else
            return true;
    }

    public void condicao2() {
        ArrayList<String> aux = new ArrayList<String>();

        for (int i = 0; i < this.lista.size(); i++) {
            if (this.lista.get(i).equals("(") || this.lista.get(i).equals(")"))
                aux.add(this.lista.get(i));
        }

        System.out.println(aux);
        for (int l=0; l < aux.size(); l++){
            for (int c=0; c < aux.size(); c++){

                if ((aux.get(l).equals("(")) && aux.get(c).equals(")")){
                    aux.set(l,"@");
                    aux.set(c,"@");
                    break;
                }
            }

            if (aux.get(l).equals(")")){
                aux.set(l, ".");
            }

            if (aux.contains(".")){
                this.resul = "-> Viola a condição 2.";
            }
        }

    }
}

