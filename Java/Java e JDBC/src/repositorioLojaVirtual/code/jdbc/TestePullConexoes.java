package repositorioLojaVirtual.code.jdbc;

import repositorioLojaVirtual.code.jdbc.factory.*;
import java.sql.*;

public class TestePullConexoes {
	
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory factory = new ConnectionFactory();
		
		for (int x = 0; x < 20; x++) {
			factory.iniciaConexao();
			System.out.println("Conexão de n°: "+x);
			
		}
	}
}
