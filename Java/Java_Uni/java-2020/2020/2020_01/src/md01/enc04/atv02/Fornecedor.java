package md01.enc04.atv02;

public class Fornecedor extends Pessoa {
	 private double valorCredito;
	 private double valorDivida;
	 
	 // Construtores \\
	 public Fornecedor() {
		 super(); 
	 }	 
	 public Fornecedor(String nome, String endereco, String telefone) {
		 super(nome, endereco, telefone);
	 }	 
	 public Fornecedor(String nome) {
		 super(nome);
	 }
	 public Fornecedor(String nome, String endereco, int telefone) {
		 super(nome, endereco, telefone);
	 }
	 public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
		 super(nome, endereco, telefone);
		 this.valorCredito = valorCredito;
		 this.valorDivida = valorDivida;
	 }	 
	 
	 // Métodos
	 public double obterSaldo() {
		 return Math.abs(this.getValorCredito()-this.getValorDivida());
	 }
	 	 
	 
	// Getters & Setters \\
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	@Override
	public String toString() {
		return "Fornecedor [Nome=" + getNome()
		+ ", Endereco=" + getEndereco() + ", Telefone" + getTelefone() + ",valorCredito=" + valorCredito + ", valorDivida=" + valorDivida + "]";
	}


	// toString \\
	 
}
