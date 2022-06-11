package md01.enc04.atv01;

public class IngressoVIP extends Ingresso{
	private double valorAdic;

	public IngressoVIP(double valor) {
		super(valor);
	}
	public IngressoVIP() {
		super();
	}

    // Getters & Setters \\
	public double getValorAdic() {
		return valorAdic;
	}
	public void setValorAdic(double valorAdic) {
		this.valorAdic = valorAdic;
	}
	
	// toString() \\
	public String toString() {
		return "IngressoVIP [valor=" + (this.getValor() + this.valorAdic)+ "]";
	}
	
}
