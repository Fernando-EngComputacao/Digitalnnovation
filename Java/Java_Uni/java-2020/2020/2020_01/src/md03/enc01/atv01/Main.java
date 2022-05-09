package md03.enc01.atv01;

public class Main {
	
	public static void main(String[] args) {
		Binario b = new Binario();
		b.converter("decimal-62");
		System.out.println(b.getValue());
		System.out.println(b.toString()+"\n");
		
		Binario b2 = new Binario();
		b2.converter("octal-51");
		System.out.println(b2.getValue());
		System.out.println(b2.toString()+"\n");
		
		Octal o = new Octal();
		o.converter("decimal-144");
		System.out.println(o.getValue());
		System.out.println(o.toString()+"\n");
		
		Octal o2 = new Octal();
		o2.converter("binario-110011");
		System.out.println(o2.getValue());
		System.out.println(o2.toString()+"\n");
		
		Decimal d = new Decimal();
		d.converter("binario-111110");
		System.out.println(d.getValue());
		System.out.println(d.toString()+"\n");
		
		Decimal d2 = new Decimal();
		d2.converter("binario-111110");
		System.out.println(d2.getValue());
		System.out.println(d2.toString());
	}
}
