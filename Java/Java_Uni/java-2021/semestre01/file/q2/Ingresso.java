package semestre01.file.q2;

public class Ingresso {
    private Double valor;

    //Construtor
    public Ingresso(Double valor){
        this.valor = valor;
    }
    public Ingresso(){}

    //Get
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

    //Método
    public String imprimeValor(){
        return "Valor do Ingresso: RS " + this.valor + " reais.";
    }
}
