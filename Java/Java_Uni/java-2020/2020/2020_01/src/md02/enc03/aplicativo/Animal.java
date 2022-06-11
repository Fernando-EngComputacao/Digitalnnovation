package md02.enc03.aplicativo;

public class Animal implements Capsula {
	private String nome;
	private int idade;

	// Construtor \\
	public Animal() {
		this.nome = "sem nome";
		this.idade = 0;
	}

	public Animal(String n, int i) {
		this.nome = n;
		this.idade = i;
	}

	// Métodos \\
	public void emitirSom() {
		System.out.println("A emitir som");
	}

	// Getters and Setters \\
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
