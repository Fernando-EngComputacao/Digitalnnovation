package md04.enc05.sistema;

public class Usuario {
	private int id;
	private String login;
	private String senha;
	private String nome;
	private boolean autenticado;
	
	// Methods \\
	public void efetuarLogoff() {
		this.autenticado = false;
	}
	public boolean efetuarLogin(String login, String senha) { 
		if ((login.equals(this.getLogin())) && (senha.equals(this.getSenha()))) {
			this.autenticado = true;
			return true;
		}	
		return false;
	}
	
	// Getters and Setters \\
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
