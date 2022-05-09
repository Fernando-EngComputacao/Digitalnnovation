package md01.enc04.atv02;

public class Operario extends Empregado{
	private double valorProducao;
	private double comissao;
	
	
	// Construtores \\
	public Operario() {
		super();
	}
	public Operario(String nome, String telefone, double salarioBase, double imposto, double valorProducao, double comissao) {
		super(nome, telefone, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	// Métodos
	public double calculaSalario() {
		return (super.calculaSalario() + (this.comissao*(this.valorProducao/100.0)));
	}

	
	// Getters e Setters \\
	public double getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	// toString \\
	public String toString() {
		return ("********* Operador *********\nNome: "+ super.getNome() +"\nTelefone: "+ super.getTelefone()+
				"\nSalário Base: "+ super.getSalarioBase() +"\nImposto: "+super.getImposto()+"\nValor de Producao: "+this.valorProducao
				+"\nPorcentagem de Comissao: "+ 	this.comissao + "\nValor da porcentagem na comissão: " +(this.comissao*(this.valorProducao/100.0)));
	}
	
	
}
