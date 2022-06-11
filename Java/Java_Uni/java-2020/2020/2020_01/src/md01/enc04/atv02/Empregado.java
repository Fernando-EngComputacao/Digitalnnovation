package md01.enc04.atv02;

public class Empregado extends Pessoa{
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	// Construtores \\
		 public Empregado() {
			 super(); 
		 }	 
		 public Empregado(String nome, String endereco, String telefone) {
			 super(nome, endereco, telefone);
		 }	 
		 public Empregado(String nome) {
			 super(nome);
		 }
		 public Empregado(String nome, String endereco, int telefone) {
			 super(nome, endereco, telefone);
		 }
		 
		 public Empregado(String nome, String telefone, double salarioBase, double imposto) {
				super(nome, telefone);
				this.salarioBase = salarioBase;
				this.imposto = imposto;
			}
		 public Empregado(String nome, String endereco, String telefone, int c, double s, double i) {
			 super(nome, endereco, telefone);
			 this.codigoSetor = c;
			 this.salarioBase = s;
			 this.imposto = i;
		 }
	
	// Métodos \\
	public double calculaSalario() {
		return (this.salarioBase - this.imposto);
	}
		
	// Getters e Setters \\
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	@Override
	public String toString() {
		
		return "********** Empregado ********** \nNome:" +super.getNome()+"\nEndereço:"+super.getEndereco()+ "\nTelefone: "
		+ super.getTelefone()+ "\nCodigo Setor:" + codigoSetor + "\nSalario Base:" + salarioBase + "\nImposto:" + imposto;
	}

	//toString() \\
	
	
}
