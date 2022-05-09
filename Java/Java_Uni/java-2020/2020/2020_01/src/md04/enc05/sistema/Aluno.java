package md04.enc05.sistema;

public class Aluno extends Usuario {
	private String matricula;
	
	// Constructor \\
	public Aluno(int id, String login, String senha, String matricula) {
		super();
		super.setId(id);
		super.setLogin(login);
		super.setSenha(senha);
		this.matricula = matricula;
	}
	
	// Methods \\
	public String toString() {
		return ""+this.getMatricula()+" - "+super.getNome()+"";
	}
	public boolean equals(Object obj) {
		Aluno a = (Aluno) obj;
		return ((a.getMatricula()).equals(this.getMatricula()) ? true : false);
	}

	// Getters and Setters \\
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
}
