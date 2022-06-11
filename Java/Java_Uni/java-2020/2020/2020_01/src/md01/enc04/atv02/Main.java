package md01.enc04.atv02;

public class Main {
	public static void main(String[] args) { 
		Fornecedor a = new Fornecedor("Amanda", "Rua da Paz", "(62) 9 9632-9854", 1000, 102);
		Fornecedor b = new Fornecedor("Fernando", "Rua A", "+55 021 62 9 9563-6541");
		b.setValorCredito(450); b.setValorDivida(251.84);
		System.out.println(a.toString());	
		a.setNome("Fernando");
		System.out.println(b.toString());
		System.out.println(a.obterSaldo());
		
		Empregado c = new Empregado("Daniele", "Rua z", "62 9 8623-5478", 1, 5800, 120);
		System.out.println(c.toString());
		System.out.println("Cálculo do Salário:" +c.calculaSalario());
		
		Administrador d = new Administrador("André","9 99632-8547", 15000, 220, 650);
		d.setImposto(50);
		System.out.println(d.toString());
		System.out.println("Cálculo do Salário:" +d.calculaSalario());
		
		Operario e = new Operario("Eliel", "9 8456-3254", 18000, 125.32, 250, 5);
		System.out.println(e.toString());
		System.out.println("Cálculo do Salário:" +e.calculaSalario());
		
		Vendedor f = new Vendedor("Agnar", "64 9 8453-7251", 2150, 123.85, 500, 26.62);
		System.out.println(f.toString());
		System.out.println("Cálculo do Salário:" +f.calculaSalario());
	} 
}
