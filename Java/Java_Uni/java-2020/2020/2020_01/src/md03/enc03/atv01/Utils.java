package md03.enc03.atv01;

public class Utils {
	private double temperaturaConvertida = 0.0;
	
	public double getTemperaturaConvertida() {
		return temperaturaConvertida;
	}
	public void setTemperaturaConvertida(double temperaturaConvertida) {
		this.temperaturaConvertida = temperaturaConvertida;
	}


	public void toCelsius(double temperatura) throws FahrenheitException {
		if (temperatura  < (-459.67)) 
			throw new FahrenheitException("A temperatura inserida é menor que o zero absoluto!");
		this.setTemperaturaConvertida((5.0*(temperatura-32.0))/9.0);
	}
}
