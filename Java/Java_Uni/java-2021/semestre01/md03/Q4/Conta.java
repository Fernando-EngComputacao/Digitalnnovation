package semestre01.md03.Q4;

public class Conta {
    private double saldo = 0.0;
    private double limite = 0.0;


    public void saca(double v) throws ContaExcecao {
        if (v > (this.saldo+this.limite)){
            throw new ContaExcecao(this.saldo);
        } else {
            this.saldo -= v;
        }
    }
    public void setLimite(double v){
        this.limite += v;
    }

    public void deposita(double v){
        this.saldo += v;
    }
    public double getSaldo(){
        return this.saldo;
    }
}
