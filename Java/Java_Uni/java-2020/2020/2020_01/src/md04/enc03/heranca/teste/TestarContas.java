package md04.enc03.heranca.teste;
import md04.enc03.heranca.banco.*;

public class TestarContas {
	public static void main(String[] args) {
		Conta c = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		// Conta
		System.out.println(c.getSaldo());
		c.deposita(80);
		System.out.println(c.getSaldo());
		c.atualiza(0.5);
		System.out.println(c.getSaldo());
		c.sacar(20);
		System.out.println(c.getSaldo()+"\n");
		
		// Conta Corrente
		System.out.println(cc.getSaldo());
		cc.deposita(80);
		System.out.println(cc.getSaldo());
		cc.deposita(0.2);
		System.out.println(cc.getSaldo());
		cc.atualiza(0.5);
		System.out.println(cc.getSaldo());
		cc.sacar(20);
		System.out.println(cc.getSaldo()+"\n");
		
		// Conta Poupança
		System.out.println(cp.getSaldo());
		cp.deposita(80);
		System.out.println(cp.getSaldo());
		cp.atualiza(0.5);
		System.out.println(cp.getSaldo());
		cp.sacar(20);
		System.out.println(cp.getSaldo());
	}

}
