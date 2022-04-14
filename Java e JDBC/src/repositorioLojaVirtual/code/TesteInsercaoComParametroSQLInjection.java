package repositorioLojaVirtual.code;

import java.sql.*;

import javax.swing.JOptionPane;

public class TesteInsercaoComParametroSQLInjection {

	public static void main(String[] args) throws SQLException {

		String nome = JOptionPane.showInputDialog("Nome do produto: ");
		String desc = JOptionPane.showInputDialog("Descricao do produto: ");

		ConnectionFactory cf = new ConnectionFactory();

		try (Connection cnx = cf.iniciaConexao()) {
			// String sql = "INSERT INTO produto (nome, descricao) VALUES
			// ('"+nome+"','"+desc+"');";
			// OU
			String sql = "INSERT INTO produto (nome, descricao) VALUES (?,?);";
			cnx.setAutoCommit(false);

			try (PreparedStatement stm = cnx.prepareStatement(sql)) {
				add(nome, desc, stm);
				add("panela", "Alumínio", stm);
				cnx.commit();

				stm.execute("select * from produto;");
				try (ResultSet rst = stm.getResultSet()) {
					while (rst.next()) {
						Integer id = rst.getInt("id");
						nome = rst.getString("nome");
						desc = rst.getString("descricao");

						System.out.println("[id=" + id + ", nome=" + nome + ", descricao=" + desc + "]");
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("ROLLBACK EXECUTADO.");
				cnx.rollback();
			}
		}
	}

	private static void add(String nome, String descricao, PreparedStatement stm) throws SQLException {
		stm.setString(1, nome);
		stm.setString(2, descricao);

		if (nome.equals("Panela")) {
			throw new RuntimeException("Não foi possível adicionar produtos!");
		}

		stm.execute();
	}
}
