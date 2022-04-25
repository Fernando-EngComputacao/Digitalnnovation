package code.modelo;

public class Aula implements Comparable<Aula>{

	private String titulo;
	private int tempo;
	
	
	//Constructor
	public Aula(String titulo, int tempo) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
	}
	public Aula() {}
	
	
	//Getters and Setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	//toString
	@Override
	public String toString() {
		return "[Aula: "+this.titulo+", "+this.tempo+"]";
	}
	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}
}
