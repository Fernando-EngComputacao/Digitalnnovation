package semestre01.md05.ava;

import java.util.LinkedHashSet;
import java.util.Set;

public class LanHouse {
    Set<Computador> computadorSet = new LinkedHashSet<>();
    Set<Defeito> defeitoSet = new LinkedHashSet<>();

    // Methods
    // N 1
    public void listaPc() {
        computadorSet.forEach(computador -> System.out.println("Computador " + computador.getNumero() + " | " + computador.getCapacidadeMemoria() + "Gb"));
    }


    // N 2
    public void adicione(Computador computador) {
        computadorSet.add(computador);
    }

    // N 3
    public void remove(Computador computador) {
        computadorSet.remove(computador);
    }

    // N 4
    public enum Status {
        ALUGADO(1), DISPONÍVEL(0), DEFEITO(2);

        private int valor;

        private Status(int valor) {
            this.valor = valor;
        }

        public int getValor() {
            return valor;
        }
    }

    public void alugar(Computador computador) {
        Status s = Status.ALUGADO;
        computador.setStatus(s.getValor());
    }

    // N 5
    public void defeito(Computador computador, String data, String defeito){
        Status s = Status.DEFEITO;
        computador.setStatus(s.getValor());
        defeitoSet.add(new Defeito(data, "Computador " + computador.getNumero() + " - " + defeito));

    }
}
