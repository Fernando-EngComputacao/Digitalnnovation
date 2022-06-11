package md03.enc04.va;

public class Veiculo implements VeiculoInterface {
	private double combustivel;
	private double limiteCombustivel;
	private double gastoKM;
	private String tipo;
	
	
	// Methods
	public Veiculo(String tipo, double combustivel, double limiteCombustivel, double gastoKM) {
		this.combustivel = combustivel;
		this.limiteCombustivel = limiteCombustivel;
		this.gastoKM = gastoKM;
		this.tipo = tipo;
	}
	public void dirigir(double distanciaKM) {
		double aux = this.getCombustivel()-((distanciaKM)/(this.getGastoKM()));
		try {
			if (aux < 0) {
				throw new CombustivelException("Distância percorrida incompatível com o combustível atual no tanque!");
			}
			else
				this.setCombustivel(aux);
		} catch (CombustivelException e) {
			System.out.println(e.getMessage());;
		}
	}
	public void abastecer(String tipoCombustivel, double qntL) {}
	
	public String toPrint() {
		return ""+this.getCombustivel()+"/"+this.getLimiteCombustivel()+" - "
				+this.getTipo()+" ("+this.getGastoKM()+" l/Km)";
	}
	
	// Getters and Setters
	public double getCombustivel() {
		return combustivel;
	}
	
	public void setCombustivel(double combustivel) {
		this.combustivel = combustivel;
	}
	public double getLimiteCombustivel() {
		return limiteCombustivel;
	}
	public void setLimiteCombustivel(double limiteCombustivel) {
		this.limiteCombustivel = limiteCombustivel;
	}
	public double getGastoKM() {
		return gastoKM;
	}
	public void setGastoKM(double gastoKM) {
		this.gastoKM = gastoKM;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}