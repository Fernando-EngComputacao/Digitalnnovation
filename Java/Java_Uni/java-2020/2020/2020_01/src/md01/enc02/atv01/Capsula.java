package md01.enc02.atv01;

public interface Capsula {
	public abstract int calcDias(int m);
	public abstract int calcDias(String m);
	public abstract boolean validarD(int d);
	public abstract boolean validarM(int m);
	public abstract void imprimirNaTela();
	public abstract String toString();
}
