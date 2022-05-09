package md03.enc01.atv01;

public class Octal implements Converter {
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
			
		if (aux.contains("d")) 
			this.setValor(Integer.parseInt(Integer.toOctalString(value)));
			
		else if (aux.contains("b")) 
			this.setValor(Integer.parseInt(Integer.toOctalString(value)));
		
		
	}

	@Override
	public double getValue() {
		return this.getValor();
	}
	
	@Override
	public String toString() {
		return "" + this.getValor();
	}

}
