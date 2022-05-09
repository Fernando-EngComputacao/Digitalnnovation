package md03.enc01.atv02;

public class Car implements CarbonFootPrint{
	private String combustivel;
	private double cilindrada;
	
	// Getters and Setters \\
	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	@Override
	public String getCarbonFootPrint() {
		return "Calculando a pegada de carbono em Car";
	}

	
	
}
