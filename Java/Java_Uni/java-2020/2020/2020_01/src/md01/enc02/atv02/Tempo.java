package md01.enc02.atv02;

public class Tempo implements Capsula{

	private double hor;
	private double min;
	private double sec;
	
	// Construtor \\
	public Tempo() {
		this.hor = 0;
		this.min = 0;
		this.sec = 0;
	}
	public Tempo(double hora, double minuto, double segundo) {
		this.hor = hora;
		this.min = minuto;
		this.sec = segundo;
	}
	
    // Getters & Setters \\
	public double getHor() {
		return hor;
	}
	public void setHor(double hor) {
		this.hor = hor;
	}
	public double getMin() {
		return min;
	}
	public void setMin(double min) {
		this.min = min;
	}
	public double getSec() {
		return sec;
	}
	public void setSec(double sec) {
		this.sec = sec;
	}
		
	////////////////////////
	
	@Override
	public void mostrarHora() {
		System.out.println(toString());
	}
		
	@Override
	public void subtrair(Tempo a, Tempo b) {
		double h,m,s;
		h = Math.abs(a.getHor()-b.getHor());
		m = Math.abs(a.getMin()-b.getMin());
		s = Math.abs(a.getSec()-b.getSec());
		
		this.hor = h; this.min = m; this.sec = s;
	}
	@Override
	public void somar(Tempo a, Tempo b) {
		double h, m, s;
		h = (a.getHor()) +(b.getHor());
		m = ((a.getMin()) + (b.getMin()));
		s = ((a.getSec()) + (b.getSec()));
		this.hor = h; this.min = m; this.sec =s;
	}
	
	@Override
	public Tempo somar(Object a, Object b) {
		double h, m, s;
		
		Tempo t1 = new Tempo();
		Tempo t2 = new Tempo();
		
		t1 = (Tempo) a; t2 = (Tempo) b;
		
		h = (t1.getHor()) +(t2.getHor());
		m = ((t1.getMin()) + (t2.getMin()));
		s = ((t1.getSec()) + (t2.getSec()));
		
		t1.setHor(h); t1.setMin(m); t1.setSec(s);
		
		return t1;
	}
	
	// toString \\
	
	public String toString() {
		String hh, mm, ss;
		hh = ((int) this.getHor())+"";
		mm = ((int) this.getMin())+"";
		ss = ((int) this.getSec())+"";
		
		if (this.getHor() < 10) 
			hh = "0"+hh;
		if (this.getMin() < 10) 
			mm = "0"+mm;
		if (this.getSec() < 10) 
			ss = "0"+ss;
		
		return (hh+":"+mm+":"+ss);
		
	}
	
	
	
}
