package md03.enc03.atv02;

import javax.swing.JOptionPane;

public class Jogo {
	
	public void start() {
		String text = "Escolha o jogo digitando:\n1 - para Cara e Coroa\n2 - para Maior e Menor"+
					"\nE para sair do jogo digite 10!";
		int a = -1;
		while (a != 10) {
			a = Integer.parseInt(JOptionPane.showInputDialog(text));
			if (a == 1) {
				CaraCoroa cc = new CaraCoroa();
				cc.Placarjogar();
			}
			else if (a == 2) {
				MenorMaior mm = new MenorMaior();
				mm.Placarjogar();
			}
		}
	}
}
