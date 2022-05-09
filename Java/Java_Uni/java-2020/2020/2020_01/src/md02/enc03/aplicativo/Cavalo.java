package md02.enc03.aplicativo;

public class Cavalo extends Animal {

	// Da Super Classe \\
	public Cavalo() {
		super();
	}

	public Cavalo(String nn, int id) {
		super(nn, id);
	}

	// Métodos \\
	public void emitirSom() {
		super.emitirSom();
		System.out.println("Relinchando");
	}

	public void correr() {
		System.out.println("Cavalo a correr");
	}

}
