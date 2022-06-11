package md01.enc02.atv02;

public class Main {
	public static void main(String[] args) {
		
		Tempo t = new Tempo();
		t.mostrarHora();
		Tempo l = new Tempo(5,02,20);
		Tempo m = new Tempo(1,2,3);
		m.somar(m, l);
		t.mostrarHora(); l.mostrarHora(); m.mostrarHora();
		
		t.subtrair(l, m);
		t.mostrarHora();
	}
}
