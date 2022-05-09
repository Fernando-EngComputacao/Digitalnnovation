package semestre01.file.q2;

public class CamaroteSuperior extends Vip {
    private Double valorAddC;

    //Construtor
    public CamaroteSuperior(Double valor, Double valorAddVip, Double valorAddVipC){
        super(valor, valorAddVip);
        this.valorAddC = valorAddVipC;
    }
    public CamaroteSuperior(){
        super();
    }

    //Método
    public String imprimeValor() {
        return "Valor do Ingresso VIP no Camarote Superior: R$ " + (this.getValorAdd() + this.getValor() + this.valorAddC);
    }
}
