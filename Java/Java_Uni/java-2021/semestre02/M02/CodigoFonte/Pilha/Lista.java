package semestre02.M02.CodigoFonte.Pilha;

import java.util.List;

public class Lista<T> extends EstruturaEstatica<T> {

    public Lista(){
        super();
    }

    public Lista(int capacidade){
        super(capacidade);
    }

    public boolean adiciona(T elemento){
        return super.adiciona(elemento);
    }

    public boolean adiciona(int posicao, T elemento){
        return super.adiciona(posicao, elemento);
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i=0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();
    }

}
