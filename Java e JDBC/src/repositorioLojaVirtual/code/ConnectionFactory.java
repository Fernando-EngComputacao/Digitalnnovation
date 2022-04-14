package repositorioLojaVirtual.code;

import java.sql.*;

public class ConnectionFactory {
	
	public Connection iniciaConexao() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost/lojaVirtualAlura","root","123456789");
	}
}
