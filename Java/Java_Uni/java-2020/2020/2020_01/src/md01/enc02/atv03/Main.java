package md01.enc02.atv03;

public class Main {
	public static void main(String[] args) {
		Estacionamento a = new Estacionamento();
//		a.setHoraE(0,0,5);
		a.setHoraS(10,10,51);
//		a.print();
		a.imprimirDados();
		a.alterarHoraEntrada(1, 2, 8);	
		a.imprimirDados();
		a.alterarHoraSaida(0, 0, 0);
		a.imprimirDados();
	}
}
