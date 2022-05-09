package semestre01.file.q2;

public class Vip extends Ingresso {
    private Double valorAdd;

    //Construtor
    public Vip(Double valor, Double valorAdd){
        super(valor);
        this.valorAdd = valorAdd;
    }
    public Vip(){}

    //Get
    public Double getValorAdd() {
        return valorAdd;
    }
    public void setValorAdd(Double valorAdd) {
        this.valorAdd = valorAdd;
    }

    //Método
    public String imprimeValor() {
        return "Valor do Ingresso VIP: R$ " + (this.valorAdd + this.getValor());
    }
}
