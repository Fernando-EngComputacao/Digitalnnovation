package repositorioLojaVirtual.code.jdbc;

import repositorioLojaVirtual.code.jdbc.factory.*;
import java.sql.*;

public class TesteListagem {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection conexao = criaConexao.iniciaConexao();
		
		Statement stm =  conexao.createStatement();
		stm.execute("select * from produto;");
		
		ResultSet rst = stm.getResultSet();
		
		while(rst.next()) {
			Integer id = rst.getInt("id");
			String nome = rst.getString("nome");
			String descricao = rst.getString("descricao");
			
			System.out.println("[id="+id+", nome="+nome+", descrição="+descricao+"]");
		}
		
		conexao.close();
	}
}
