package semestre01.md03.Q4;

public class Q3 {
	public static void main(String[] args) throws ContaExcecao {
        Conta minhaConta = new Conta();
        minhaConta.deposita(100);
        minhaConta.setLimite(100);
        
        // Apresenta na tela o valor inicial dipon�vel na Conta
        System.out.println("Valor Inicial dispon�vel na conta: R$" + minhaConta.getSaldo());
        try {
            minhaConta.saca(1000);
        } catch (ContaExcecao e){
        	//System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
        // Apresenta na tela o valor final dipon�vel na Conta
        System.out.println("Valor Final dispon�vel na conta: R$" + minhaConta.getSaldo());

    }
}
