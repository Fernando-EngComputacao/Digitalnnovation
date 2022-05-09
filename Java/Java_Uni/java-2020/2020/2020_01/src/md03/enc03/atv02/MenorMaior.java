package md03.enc03.atv02;

import javax.swing.JOptionPane;

public class MenorMaior implements JogoInterface {
	private int sorteio;
	private int n = -1;
	private boolean win = true;
	
	// Construtor
	public MenorMaior() {
		this.sorteio = (1 + (int)(Math.random()*100));		
	}
	
	public Placar jogar() {
		String aux = "";
		int i = 0;
		while (this.getN() != this.getSorteio()) {
			i++;
			this.setN(Integer.parseInt(JOptionPane.showInputDialog("Insira um valor "+aux+" | "+i+"° tentativa")));
			if (n > this.getSorteio()) 
				aux = "MENOR";
			else
				aux = "MAIOR";
			if (this.getN() == 0) {
				i--;
				abortar();
			}
		}
		return new Placar(i, this.getSorteio(), this.getWin());
	}
	
	//Getters and Setters
	public int getSorteio() {
		return sorteio;
	}
	public void setSorteio(int sorteio) {
		this.sorteio = sorteio;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public boolean getWin() {
		return win;
	}
	public void isWin(boolean win) {
		this.win = win;
	}
	
	// Interface
	@Override
	public void JogoInterface(String aux) {
	}
	@Override
	public void resetar() {
		this.setSorteio((1 + (int)(Math.random()*100)));
	}
	@Override
	public void Placarjogar() {
		MenorMaior a = new MenorMaior();
		Placar p = a.jogar();
		System.out.println(p.toString());
	}
	@Override
	public void abortar() {
		this.isWin(false);
		this.setN(this.getSorteio());
	}
	
}
