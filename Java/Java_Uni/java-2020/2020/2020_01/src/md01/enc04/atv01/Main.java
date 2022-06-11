package md01.enc04.atv01;

public class Main {
	public static void main(String[] args) {
		
		IngressoVIP fer = new IngressoVIP(10);
		System.out.println(fer.toString());
		fer.setValorAdic(2);
		System.out.println(fer.toString());
		fer.setValor(2);
		System.out.println(fer.toString());
		
	}
}
