package repositorioLojaVirtual.code.jdbc;

import repositorioLojaVirtual.code.jdbc.factory.*;
import java.sql.*;

public class TesteInsercao {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection cnx = criaConexao.iniciaConexao();
		
		// Insere Dados
		Statement stm = cnx.createStatement();
		stm.execute("insert into produto (nome, descricao) values ('Teclado','Dell');",Statement.RETURN_GENERATED_KEYS);
		//ResultSet rst = stm.getGeneratedKeys();
		
		// Busca	 de Dados
		stm.execute("select * from produto;");
		ResultSet rstS = stm.getResultSet();
		
		while(rstS.next()) {
			
			Integer id = rstS.getInt("id");
			String nome = rstS.getString("nome");
			String descricao = rstS.getString("descricao");
			
			System.out.println("[id="+id+", nome="+nome+", descricao="+descricao+"]");
		}
		
		cnx.close();
	}
}
