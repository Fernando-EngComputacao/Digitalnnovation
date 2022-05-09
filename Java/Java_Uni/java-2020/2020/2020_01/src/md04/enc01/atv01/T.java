package md04.enc01.atv01;

public class T {

	public static void main(String[] args) {
		A a = new A(); 
		A a2 = new A();
		
		a.metodo();
		a2.metodo();
		a.umMetodo();
		a2.umMetodo();
		a.metodoDeA();
		a2.metodoDeA();
		
		System.out.println(a.getAtributo01()); 
		System.out.println(a.getAtributo02());
		System.out.println(a2.getAtributo01()); 
		System.out.println(a2.getAtributo02());
	}
}
