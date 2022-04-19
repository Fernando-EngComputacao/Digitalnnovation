package repositorioLojaVirtual.code.jdbc.dao;

import repositorioLojaVirtual.code.jdbc.controller.*;
import repositorioLojaVirtual.code.jdbc.modelo.Categoria;
import repositorioLojaVirtual.code.jdbc.modelo.Produto;

import java.sql.*;
import java.util.*;

public class CategoriaDao {
	
	private Connection conexao;
	
	public CategoriaDao(Connection conexao) {
		this.conexao = conexao;
	}
	
	public void salvar(Categoria categoria) throws SQLException {
		String sql = "INSERT INTO categoria (nome) values (?);";
		
		try(PreparedStatement pstm = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
			pstm.setString(1, categoria.getNome());
			pstm.execute();
		}
	}
	
	public List<Categoria> listar() throws SQLException {
		Categoria ultima = null;
		List<Categoria> vetorCategoria = new ArrayList<Categoria>(); 
		String sql = "select ca.id,ca.nome,pd.id,pd.nome,pd.descricao from categoria"
		+" ca inner join produto pd on ca.id=pd.categoria_id;";
		
		try(PreparedStatement pstm = conexao.prepareStatement(sql)){
			pstm.execute();
			
			try(ResultSet rst = pstm.getResultSet()){
				while (rst.next()) {
					Integer id = rst.getInt(1);
					String nome = rst.getString(2);
					if (ultima == null || !(ultima.equals(nome))) {
						Categoria newCategoria = new Categoria(id, nome);
						ultima = newCategoria;
						vetorCategoria.add(newCategoria);
					}
					Produto produto = new Produto(rst.getInt(3), rst.getString(4), rst.getString(5));
					ultima.adicionar(produto);
				}
			}
		}
		return vetorCategoria;
	}
}
