package store.code.dao;

import javax.persistence.EntityManager;

import store.code.modelo.Categoria;

public class CategoriaDao {
	
	private EntityManager conexao;
	
	//Constructor
	public CategoriaDao(EntityManager conexao) {
		this.conexao = conexao;
	}
	
	//Methods 
	public void cadastrar(Categoria categoria) {
		this.conexao.persist(categoria);
	}
	public void atualizar(Categoria categoria) {
		this.conexao.merge(categoria);
	}
	public void remover(Categoria categoria) {
		categoria = this.conexao.merge(categoria);
		this.conexao.remove(categoria);
	}

}
