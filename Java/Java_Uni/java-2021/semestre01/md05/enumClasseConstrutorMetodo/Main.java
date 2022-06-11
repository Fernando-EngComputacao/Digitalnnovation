package semestre01.md05.enumClasseConstrutorMetodo;

public class Main {
    public static void main(String[] args){
        DiaSemana dia = DiaSemana.DOMINGO;

        System.out.println(dia.toString() + " - " + dia.getValor());

        Data data = new Data(28,11,2000, DiaSemana.SEXTA);
    }
}
