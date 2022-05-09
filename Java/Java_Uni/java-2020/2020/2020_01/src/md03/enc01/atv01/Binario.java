package md03.enc01.atv01;

public class Binario implements Converter {
	private int valor;
	
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public void converter(String valor) {
		String aux = (valor.split("-")[0]).toLowerCase();
		int value = Integer.parseInt(valor.split("-")[1]);
		if (aux.contains("d")) {
			this.setValor(Integer.parseInt(Integer.toBinaryString(value)));
		}
		else if (aux.contains("o")) {
			this.setValor(Integer.parseInt(Integer.toBinaryString(value)));
		}
	}

	@Override
	public String toString() {
		return "" + this.getValor();
	}
	
	@Override
	public double getValue() {
		return this.getValor();
	}

}
