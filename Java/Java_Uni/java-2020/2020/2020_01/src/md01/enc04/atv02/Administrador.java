package md01.enc04.atv02;

public class Administrador extends Empregado {
	private double ajudaDeCusto;
	
	// Construtores \\
	public Administrador() {
		super();
	}
	public Administrador(String nome, double ajudaDeCusto) {
		super(nome);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	public Administrador(String nome, String telefone, double salarioBase, double imposto, double ajudaDeCusto) {
		super(nome, telefone, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	
	// Métodos \\
//	@Override
	public double calculaSalario() {
		return (super.calculaSalario() + this.ajudaDeCusto);
	}
	
	// Getters e Setters \\
	public double getAjudaDeCusto() {
		return this.ajudaDeCusto;
	}
	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	
	// toString() \\
	public String toString() {
		return ("********* Administrador *********\nNome: "+ super.getNome() +"\nTelefone: "+ super.getTelefone()+
				"\nSalário Base: "+ super.getSalarioBase() +"\nImposto: "+super.getImposto()+"\nAjuda de Custo: "+ 
				getAjudaDeCusto());
	}
	
	
}
