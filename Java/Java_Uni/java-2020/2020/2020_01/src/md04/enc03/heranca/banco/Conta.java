package md04.enc03.heranca.banco;

public class Conta {
	private double saldo = 0.0;
	
	public double getSaldo() {
		return this.saldo;
	}
	public void deposita(double valor) {
		this.saldo += valor;
	}
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	public void atualiza(double taxa) {
		this.saldo = this.saldo - taxa;
	}
}
