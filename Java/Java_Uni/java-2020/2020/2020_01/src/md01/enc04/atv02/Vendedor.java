package md01.enc04.atv02;

public class Vendedor extends Empregado{
	private double valorVenda;
	private double comissao;
	
	// Construtor \\
	public Vendedor() {
		super();
	}
	public Vendedor(String name, String telefone, double salarioBase, double imposto, double valorVenda, double comissao) {
		super(name, telefone, salarioBase, imposto);
		this.valorVenda = valorVenda;
		this.comissao = comissao;
	}

	// Métodos \\
	public double calculaSalario() {
		return (super.calculaSalario() + (this.valorVenda * (this.comissao/100.0)));
	}
	
	// Getters and Setters \\
	public double getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	// toString \\
		public String toString() {
			return ("********* Vendedor *********\nNome: "+ super.getNome() +"\nTelefone: "+ super.getTelefone()+
					"\nSalário Base: "+ super.getSalarioBase() +"\nImposto: "+super.getImposto()+"\nValor de Vendas: "+this.valorVenda
					+"\nPorcentagem de Comissão: "+ this.comissao + "\nValor da porcentagem na comissão: " +(this.comissao*(this.valorVenda/100.0)));
		}
}
