package repositorioLojaVirtual.code;

import java.sql.*;

public class TesteRemocao {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection cnx = criaConexao.iniciaConexao();
		
		Statement stm = cnx.createStatement();
		stm.execute("delete from produto where id > 5;");
		
		cnx.close();
	}
}
