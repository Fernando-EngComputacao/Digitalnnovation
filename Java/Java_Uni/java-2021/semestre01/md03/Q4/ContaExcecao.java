package semestre01.md03.Q4;

public class ContaExcecao extends Exception{

    public ContaExcecao(double v){
        super("\nSaldo insuficiente para o saque solicitado!\nValor em conta de R$"+v+" reais.");
    }
}
