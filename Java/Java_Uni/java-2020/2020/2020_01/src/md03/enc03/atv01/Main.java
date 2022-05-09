package md03.enc03.atv01;

public class Main {
	public static void main(String[] args) {
		Utils t = new Utils();
		
		try {
			t.toCelsius(-459.68);
			System.out.println(t.getTemperaturaConvertida());
		} catch(FahrenheitException e) {
			System.out.println(e.getMessage());
		}
		
		
		// O Utils não cria um objeto e trata o toCelsius | Este o erro
//		try {
//			 double c = Utils.toCelsius(-500.0);
//			 System.out.println(c);
//			} catch (TemperatureException e) {
//			 System.out.println(“Erro 1”);
//			} catch (FahrenheitException e) {
//			 System.out.println(“Erro 2”);
//			} 
	}
}
