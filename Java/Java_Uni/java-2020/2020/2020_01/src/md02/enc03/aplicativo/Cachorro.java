package md02.enc03.aplicativo;

public class Cachorro extends Animal {

	// Da Super Classe \\
	public Cachorro() {
		super();
	}

	public Cachorro(String nn, int id) {
		super(nn, id);
	}

	// Métodos \\
	public void emitirSom() {
		super.emitirSom();
		System.out.println("Latindo");
	}

	public void correr() {
		System.out.println("Cachorro a correr");
	}
}
