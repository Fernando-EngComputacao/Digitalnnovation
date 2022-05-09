package md01.enc02.atv01;

public class Main {
	public static void main(String[] args) {
		Data v = new Data();
		v.toString();
		v.calcDias(15);
		v.setMes(12);
		v.imprimirNaTela();
		
		v.setDia(31);
		v.setAno(2000);
//		System.out.println(v.toString());
		v.imprimirNaTela();

	}
}
