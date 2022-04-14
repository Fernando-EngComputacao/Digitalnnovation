package repositorioLojaVirtual.code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) throws SQLException {
		
		//Cria e inicia a conexão com o Banco de Dados
		Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/lojaVirtualAlura?useTimezone=true&serverTimezone=UTC", "root", "123456789");
		
		//Insere o código de busca no Banco de Dados (Selec)
		Statement buscaBD = conexao.createStatement();
		boolean resul = buscaBD.execute("SELECT * FROM produto;");
		verifica(resul);
		
		//Pega o retorno dos dados do Banco de Dados
		ResultSet retornoBD = buscaBD.getResultSet();
		while (retornoBD.next()) {
			Integer id = retornoBD.getInt("id");
			String nome = retornoBD.getString("nome");
			String descricao = retornoBD.getString("descricao");
			
			String txt = "["+id+", "+nome+", "+descricao+"]";
			System.out.println(txt);
		}
		
		//Fecha Conexão
		conexao.close();
	}
	
	
	// Verifica se o retorno do Banco de Dados houve dados ou não
	public static void verifica(boolean resul) {
		String txt = "-> Retornou dados!";
		if (!resul)
			txt = "-> Retornou vazio!";
		System.out.println(txt+"\n");
	}
}
