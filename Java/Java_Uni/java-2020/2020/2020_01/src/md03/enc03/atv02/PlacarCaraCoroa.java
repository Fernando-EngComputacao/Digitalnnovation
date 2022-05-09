package md03.enc03.atv02;

public class PlacarCaraCoroa {
	private int tentativas;
	private int sorteado;
	private boolean win;
	
	public boolean getWin() {
		return this.win;
	}
	
	public PlacarCaraCoroa(int tentativas, int sorteado, boolean win) {
		this.sorteado = sorteado;
		this.tentativas = tentativas;
		this.win = win;
	}

	public String toString() {
		String texto = "-> Você venceu!!!\n";
		String aux = "Coroa";
	
		if (this.getWin() == false) 
			texto = "-> Você Perdeu!\n";
		if (this.sorteado == 1)
			aux = "Cara";
		
		return "*************** PLACAR : CARA-COROA ***************\n"+texto+
				"N° de tentativas: "+tentativas+"\nLado sorteado: "+aux;
	}
}
