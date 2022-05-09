package md04.enc01.atv01;

public class B implements C {
	String atributo01 = "Atributo 01";
	String atributo02 = "Atributo 02";
	
	public void metodo() {
		System.out.println("Método");
	}

	@Override
	public void umMetodo() {
		System.out.println("1 método");
	}

	public String getAtributo01() {
		return atributo01;
	}

	public void setAtributo01(String atributo01) {
		this.atributo01 = atributo01;
	}

	public String getAtributo02() {
		return atributo02;
	}

	public void setAtributo02(String atributo02) {
		this.atributo02 = atributo02;
	}
	
	
}
