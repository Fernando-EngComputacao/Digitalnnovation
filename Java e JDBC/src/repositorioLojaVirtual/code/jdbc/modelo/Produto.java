package repositorioLojaVirtual.code.jdbc.modelo;


import java.sql.*;
import repositorioLojaVirtual.code.jdbc.factory.*;

public class Produto {

	private Integer id;
	private String nome;
	private String descricao;
	private Integer categoriaId;

	// Constructor
	public Produto(Integer id, String nome, String descricao) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}

	public Produto(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}

	public Produto() {
	}

	// Methods
	public void add() throws SQLException {
		try (Connection cnx = new ConnectionFactory().iniciaConexao()) {
			String sql = "insert into produto (nome, descricao) values (?,?);";

			try (PreparedStatement pstm = cnx.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
				pstm.setString(1, this.getNome());
				pstm.setString(2, this.getDescricao());

				pstm.execute();

				try (ResultSet rst = pstm.getGeneratedKeys()) {
					while (rst.next()) {
						this.setId(rst.getInt(1));
					}
				}
			}
		}
	}
	
	
	public Produto add(String nome, String descricao) throws SQLException {
		Produto generico = new Produto(nome, descricao);
		try (Connection cnx = new ConnectionFactory().iniciaConexao()) {
			String sql = "insert into produto (nome, descricao) values (?,?);";

			try (PreparedStatement pstm = cnx.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
				pstm.setString(1, nome);
				pstm.setString(2, descricao);

				pstm.execute();
				
			}
		}
		return generico;
	}
	
	

	// Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setCategoriaId(Integer categoriaId) {
		this.categoriaId = categoriaId;
	}
	
	public Integer getCategoriaId() {
		return categoriaId;
	}

	// toString
	public String toString() {
		return String.format("O produto criado: %d, %s, %s", this.id, this.nome, this.descricao);
	}

}
