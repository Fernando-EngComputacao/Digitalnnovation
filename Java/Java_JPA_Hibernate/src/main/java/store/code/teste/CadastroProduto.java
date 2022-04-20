package store.code.teste;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import store.code.dao.CategoriaDao;
import store.code.dao.ProdutoDao;
import store.code.modelo.Categoria;
import store.code.modelo.Produto;
import store.code.util.JPAUtil;

public class CadastroProduto {

	public static void main(String[] args) {
		cadastrarProduto();
		Long id = 1l;
		EntityManager cnx = JPAUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(cnx);
		Produto produto = produtoDao.buscarPeloId(id);
		
		System.out.println(produto.getDescricao());
		
		List<Produto> todosProdutos = produtoDao.buscarListProduto();
		todosProdutos.forEach(lista -> System.out.println(lista.getNome()));
		
		BigDecimal precoProduto = produtoDao.buscarPrecoProdutoComNome("Xiaomi Redmi");
		System.out.println("Preço do produto: R$ "+precoProduto+" reais.");
	}

	private static void cadastrarProduto() {
		Categoria celulares = new Categoria("ELETRÔNICOS");
		Produto celular = new Produto("Xiaomi Redmi","Note 10",new BigDecimal("1200"), celulares);
		
		EntityManager cnx = JPAUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(cnx);
		CategoriaDao categoriaDao = new CategoriaDao(cnx);
		
		
		cnx.getTransaction().begin();
		categoriaDao.cadastrar(celulares);
		produtoDao.cadastrar(celular);
		cnx.getTransaction().commit();
		// Para voltar a entidade a ser gerenciada pelo JPA após Clear ou Close da Entity
		//cnx.flush();
		//cnx.clear();
		//celulares = cnx.merge(celulares);
		//celulares.setNome("Teste");
		cnx.close();
	}
}
