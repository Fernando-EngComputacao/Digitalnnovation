package store.code.dao;

import javax.persistence.EntityManager;

import java.math.BigDecimal;
import java.util.*;
import store.code.modelo.Produto;

public class ProdutoDao {

	private EntityManager conexao;
	
	//Constructor
	public ProdutoDao(EntityManager conexao) {
		this.conexao = conexao;
	}
	
	//Methods 
	public void cadastrar(Produto produto) {
		this.conexao.persist(produto);
	}
	public void atualizar(Produto produto) {
		this.conexao.merge(produto);
	}
	public void remover(Produto produto) {
		produto = conexao.merge(produto);
		this.conexao.remove(produto);
	}
	public Produto buscarPeloId(Long id) {
		return conexao.find(Produto.class, id);
	}
	public List<Produto> buscarListProduto() {
		// SELECT variávelCriada FROM nomeDaClasseDesejada variávelCriada
		String jpql = "SELECT objetoP FROM Produto objetoP";
		return conexao.createQuery(jpql, Produto.class).getResultList();
	}
	public List<Produto> buscarPorNome(String name) {
		// SELECT (variávelCriada) FROM nomeDaClasseDesejada (variávelCriada) WHERE (variávelCriada).nome = :variávelParâmetro
		String jpql = "SELECT objetoP FROM Produto objetoP WHERE objetoP.nome = :nameSql";
		return conexao.createQuery(jpql, Produto.class).setParameter("nameSql", name).getResultList();
	}
	public List<Produto> buscarPorNomeCategoria(String name) {
		//Usando JOIN 
		// SELECT (variávelCriada) FROM nomeDaClasseDesejada (variávelCriada) WHERE (variávelCriada).Variavelrelacionamento.nome = :variávelParâmetro
		//variavelRelacionamento -> É a variável criada em uma classe, vinda de outra classe (que instancia outra classe)
		String jpql = "SELECT objetoP FROM Produto objetoP WHERE objetoP.categoria.nome = :nameSql";
		return conexao.createQuery(jpql, Produto.class).setParameter("nameSql", name).getResultList();
	}
	public BigDecimal buscarPrecoProdutoComNome(String nome) {
		String jpql = "SELECT p.preco FROM Produto p WHERE p.nome = :nomeJPQL";
		return conexao.createQuery(jpql, BigDecimal.class).setParameter("nomeJPQL", nome).getSingleResult();
	}

}





