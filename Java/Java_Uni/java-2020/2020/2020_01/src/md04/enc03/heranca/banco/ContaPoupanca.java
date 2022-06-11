package md04.enc03.heranca.banco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca() {
		super();
	}
	
	@Override
	public void atualiza(double taxa) {
		super.atualiza(taxa*3);
	}
}
