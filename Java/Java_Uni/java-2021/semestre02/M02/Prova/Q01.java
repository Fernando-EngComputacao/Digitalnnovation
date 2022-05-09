package semestre02.M02.Prova;

import java.util.ArrayList;

public class Q01 {
    private ArrayList<String> lista = new ArrayList<String>();
    private String resul = "Políndromo";

    public Q01(String text){
        this.adicionaTexto(text);
    }
    public Q01(){}

    public void adicionaTexto(String text){
        int tmh = text.length();

        for (int i=1; i < tmh+1; i++){
            this.lista.add(text.substring(i-1,i));
        }
    }

    public String verifica(){
        int tmh, pos;
        tmh = pos = lista.size();

        if (tmh % 2 == 1) {
            lista.remove((tmh / 2));
            pos = (tmh-1);
        }

        for (int i=0; i < tmh/2; i++){
            pos--;
            if (!(lista.get(i).equals(lista.get(pos))))
                this.resul = "Não Políndromo";

        }
        return this.resul;
    }
}
