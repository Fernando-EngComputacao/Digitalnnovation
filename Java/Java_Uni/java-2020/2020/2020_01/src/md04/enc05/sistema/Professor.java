package md04.enc05.sistema;

public class Professor extends Usuario {
	private String areaConhecimento;

	// Constructor \\
	public Professor(int id, String login, String senha, String areaConhecimento) {
		super();
		super.setId(id);
		super.setLogin(login);
		super.setSenha(senha);
		this.setAreaConhecimento(areaConhecimento);
	}
	// Methods \\
	public String toString() {
		return super.getId()+" - "+super.getNome()+" ("+this.areaConhecimento+")";
	}
	public boolean equals(Object obj) {
		Professor p = (Professor) obj;
		return (p.getId() == this.getId() ? true : false);
	}
	
	// Setters and Getters \\
	public String getAreaConhecimento() {
		return areaConhecimento;
	}
	public void setAreaConhecimento(String areaConhecimento) {
		this.areaConhecimento = areaConhecimento;
	}
	
	
}
