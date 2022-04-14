package repositorioLojaVirtual.code;

import java.sql.*;

public class TesteRemocaoSQLInjection {

	public static void main(String[] args) throws SQLException {
		String nome = "copo";
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection cnx = cf.iniciaConexao();
		
		String sql = "delete from produto where nome=?";
		
		PreparedStatement stm = cnx.prepareStatement(sql);
		stm.setString(1, nome);
		stm.execute();
		
		cnx.close();
	}
}
