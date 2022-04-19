package repositorioLojaVirtual.code.jdbc.modelo;

import java.util.*;

public class Categoria {
	private Integer id;
	private String nome;
	private List<Produto> produtos = new ArrayList<Produto>();
	
	// Constructor
	public Categoria (Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	public Categoria (String nome) {
		this.nome = nome;
	}
	public Categoria() {}
	
	//Methods
	public void adicionar(Produto produto) {
		this.produtos.add(produto);
	}
	
	//Getters and Setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	//toString
	public String toString() {
		return String.format("Categoria criada: %d, %s", this.id, this.nome);
	}
}
