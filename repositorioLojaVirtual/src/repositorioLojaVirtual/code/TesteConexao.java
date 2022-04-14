package repositorioLojaVirtual.code;

import java.sql.*;

public class TesteConexao {
		public static void main(String[] args) throws SQLException {
			System.out.println("Incia Conexão ao BD!");
			
			ConnectionFactory criaConexao = new ConnectionFactory();
			Connection conexao = criaConexao.iniciaConexao();
			
			
			conexao.close();
			System.out.println("Conexão ao BD Fechada!");
		}
}
