package md04.enc03.heranca.banco;

public class ContaCorrente extends Conta {
	
	public ContaCorrente() {
		super();
	}
	
	@Override
	public void atualiza(double taxa) {
		super.atualiza(taxa*2);
	}
	@Override
	public void deposita(double valor) {
		super.deposita(valor-0.1);
	}
}
