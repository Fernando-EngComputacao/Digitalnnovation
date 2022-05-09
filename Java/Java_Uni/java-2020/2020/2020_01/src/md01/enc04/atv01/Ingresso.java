package md01.enc04.atv01;

public class Ingresso {
	private double valor;
	
	public Ingresso(double valor) {
		this.valor = valor;		
	}
	public Ingresso() {
		this.valor = 0;
	}
	
	// Getters & Setters \\
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	// toString() \\
	@Override
	public String toString() {
		return "Ingresso [valor=" + valor + "]";
	}

}
