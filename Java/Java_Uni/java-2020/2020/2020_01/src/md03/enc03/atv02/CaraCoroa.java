package md03.enc03.atv02;

import javax.swing.JOptionPane;

public class CaraCoroa implements JogoInterface{
	private int posicao = -1;
	private boolean win = true;
	private int tentativa = 1;
	private int digitado = -1;
	
		
	@Override
	public void JogoInterface(String aux) {
	}

	public PlacarCaraCoroa jogar() {
		resetar();
		
		while (this.getPosicao() != this.getDigitado()) {
			String text = "Digite (1) para Cara\nDigite (2) para Coroa\n"+this.getPosicao()+"° tentativa";
			this.setDigitado(Integer.parseInt(JOptionPane.showInputDialog(text)));
			if (this.getDigitado() == 0) {
				this.isWin(false);
				this.setTentantiva(0);
				abortar();
			}
				
			if (this.getDigitado() != this.getPosicao()) {
				this.isWin(false);
				break;
			}
			else
				break;
				
		}
		return new PlacarCaraCoroa(this.getTentativa(), this.getPosicao(), this.getWin());		
	}
	@Override
	public void resetar() {
		this.setPosicao(1 + (int) (Math.random()*2));
	}

	@Override
	public void Placarjogar() {
		CaraCoroa a = new CaraCoroa();
		PlacarCaraCoroa pcc = a.jogar();
		System.out.println(pcc);
//		System.out.println(pcc.toString());
	}

	@Override
	public void abortar() {
		this.setDigitado(0);
	}

	public boolean getWin() {
		return this.win;
	}
	public void isWin(boolean win) {
		this.win = win;
	}
	public int getPosicao() {
		return this.posicao;
	}
	public void setPosicao(int estado) {
		this.posicao = estado;
	}
	public int getTentativa() {
		return this.tentativa;
	}
	public void setTentantiva(int tentativa) {
		this.tentativa = tentativa;
	}
	public int getDigitado() {
		return this.digitado;
	}
	public void setDigitado(int tentativa) {
		this.digitado = tentativa;
	}
}
