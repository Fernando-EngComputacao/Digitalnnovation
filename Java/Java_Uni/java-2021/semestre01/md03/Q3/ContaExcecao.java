package semestre01.md03.Q3;

public class ContaExcecao extends Exception{

	@Override
	public String toString() {
		return "O valor informado � maior que o dispon�vel para saque!";
	}	
}
