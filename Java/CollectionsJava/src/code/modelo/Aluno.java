package code.modelo;

public class Aluno {

	private String nome;
	private int nMatricula;
	
	//Constructor
	public Aluno(String nome, int nMatricula) {
		if (nome == null) {
			throw new NullPointerException("Não pode ter nome vazio.");
		}
		this.nome = nome;
		this.nMatricula = nMatricula;
	}
	
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getnMatricula() {
		return nMatricula;
	}
	public void setnMatricula(int nMatricula) {
		this.nMatricula = nMatricula;
	}
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
	
	//toString
	public String toString() {
		return "[Aluno: "+this.nome+", matricula: "+this.nMatricula+"]";
	}

}
