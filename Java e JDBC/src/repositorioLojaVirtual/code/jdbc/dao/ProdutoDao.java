package repositorioLojaVirtual.code.jdbc.dao;

import java.sql.*;
import java.util.*;

import repositorioLojaVirtual.code.jdbc.modelo.*;



public class ProdutoDao {

	private Connection conexao;

	public ProdutoDao(Connection conexao) {
			this.conexao = conexao;
		}

	public void salvar(Produto produto) throws SQLException {
		String sql = "INSERT INTO produto (nome, descricao) VALUES (?,?);";
		
		try(PreparedStatement pstm = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			pstm.setString(1,produto.getNome());
			pstm.setString(2, produto.getDescricao());
			
			pstm.execute();
		}
	}
	
	public List<Produto> listar() throws SQLException {
		List<Produto> produtos = new ArrayList<Produto>();
		String sql = "SELECT * FROM produto;";
		
		try(PreparedStatement pstm = conexao.prepareStatement(sql)) {
			pstm.execute();
			
			try(ResultSet rst = pstm.getResultSet()) {
				while(rst.next()) {
					//Integer id = rst.getInt("id");
					//String nome = rst.getString("nome");
					//String desc = rst.getString("descricao");
					
					Produto prd = new Produto(rst.getInt(1), rst.getString(2), rst.getString(3));
					produtos.add(prd);
					//System.out.println("["+id+", "+nome+", "+desc+"]");
					
				}
			}
		}
		
		return produtos;
	}
	
	public List<Produto> buscar(Categoria categoria) throws SQLException{
		List<Produto> produtos = new ArrayList<Produto>();
		String sql = "SELECT * FROM produto where categoria_id = ?;";
		
		try(PreparedStatement pstm = conexao.prepareStatement(sql)) {
			pstm.setInt(1, categoria.getId());
			pstm.execute();
			
			try(ResultSet rst = pstm.getResultSet()) {
				while(rst.next()) {
					//Integer id = rst.getInt("id");
					//String nome = rst.getString("nome");
					//String desc = rst.getString("descricao");
					
					Produto prd = new Produto(rst.getInt(1), rst.getString(2), rst.getString(3));
					produtos.add(prd);
					//System.out.println("["+id+", "+nome+", "+desc+"]");
					
				}
			}
		}
		
		return produtos;
	}
	
	public void deletar(Integer id) throws SQLException {
		try (PreparedStatement stm = conexao.prepareStatement("DELETE FROM PRODUTO WHERE ID = ?")) {
			stm.setInt(1, id);
			stm.execute();
		}
	}

	public void alterar(String nome, String descricao, Integer id) throws SQLException {
		try (PreparedStatement stm = conexao
				.prepareStatement("UPDATE PRODUTO P SET P.NOME = ?, P.DESCRICAO = ? WHERE ID = ?")) {
			stm.setString(1, nome);
			stm.setString(2, descricao);
			stm.setInt(3, id);
			stm.execute();
		}
	}

	private void trasformarResultSetEmProduto(List<Produto> produtos, PreparedStatement pstm) throws SQLException {
		try (ResultSet rst = pstm.getResultSet()) {
			while (rst.next()) {
				Produto produto = new Produto(rst.getInt(1), rst.getString(2), rst.getString(3));

				produtos.add(produto);
			}
		}
	}
	
	public void salvarComCategoria(Produto produto) throws SQLException {
		String sql = "INSERT INTO PRODUTO (NOME, DESCRICAO, CATEGORIA_ID) VALUES (?, ?, ?)";

		try (PreparedStatement pstm = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

			pstm.setString(1, produto.getNome());
			pstm.setString(2, produto.getDescricao());
			pstm.setInt(3, produto.getCategoriaId());

			pstm.execute();

			try (ResultSet rst = pstm.getGeneratedKeys()) {
				while (rst.next()) {
					produto.setId(rst.getInt(1));
				}
			}
		}
	}

}
