package repositorioLojaVirtual.code.jdbc;

import repositorioLojaVirtual.code.jdbc.factory.*;
import java.sql.*;

public class TesteListagemSQLInjection {

	public static void main(String[] args) throws SQLException {
		System.out.println("--> Listagem tratando SQL Injection\n");
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection cnx = cf.iniciaConexao();
		
		String sql = "select * from produto;";
		
		PreparedStatement stm = cnx.prepareStatement(sql);
		stm.execute();
		
		ResultSet rst = stm.getResultSet();
		while(rst.next()) {
			Integer id = rst.getInt("id");
			String nome = rst.getString("nome");
			String desc = rst.getString("descricao");
			
			System.out.println("[id="+id+", nome="+nome+", descricao="+desc+"]");
		}
				
	}
}
