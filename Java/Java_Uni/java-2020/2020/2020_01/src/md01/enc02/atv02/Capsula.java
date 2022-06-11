package md01.enc02.atv02;

public interface Capsula {
	public abstract void mostrarHora();
	public abstract void subtrair(Tempo a, Tempo b);
	public abstract void somar(Tempo a, Tempo b);
	public abstract Tempo somar(Object a, Object b);
	public abstract String toString();
	
}
