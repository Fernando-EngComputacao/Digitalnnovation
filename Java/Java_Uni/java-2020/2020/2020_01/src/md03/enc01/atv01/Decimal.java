package md03.enc01.atv01;

public class Decimal implements Converter{
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
		String value = valor.split("-")[1];
		
		if (aux.contains("b")) 
			this.setValor(Integer.parseInt(value, 2));
			
		else if (aux.contains("o")) 
			this.setValor(Integer.parseInt(value, 2));
		
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
