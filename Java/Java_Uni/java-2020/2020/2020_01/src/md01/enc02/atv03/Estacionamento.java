package md01.enc02.atv03;
import md01.enc02.atv02.Tempo;

public class Estacionamento {
	private String placa;
	private String modelo;
	private String horaE;
	private String horaS;
	
	public Estacionamento() {
		this.placa = null;
		this.modelo = null;
		this.horaE = null;
		this.horaS = null;	
	}
	
	public double pagar() {
		String he, hs, h, m, s, hh, mm, ss;
		double e,f,g,totalHora;
		he = this.horaE; hs = this.horaS;
		
		if (he == null)
			he = "00:00:00";
		if (hs == null) 
			hs = "00:00:00";
		
		h = he.substring(0,2); m = he.substring(3,5); s = he.substring(6);
		hh = hs.substring(0,2); mm = hs.substring(3,5); ss = hs.substring(6);
		
		Tempo a = new Tempo(Double.parseDouble(h),Double.parseDouble(m),Double.parseDouble(s));
		Tempo b = new Tempo(Double.parseDouble(hh),Double.parseDouble(mm),Double.parseDouble(ss));
		
		a.subtrair(a, b);
		e = a.getHor(); f = a.getMin(); g = a.getSec();
		totalHora = e + (f/60.0) + (g/360);
		
		return (totalHora*1.5);	
	}
	
	public void imprimirDados() {
		
		System.out.println(toString());
	}
	
	public String toString() {
		String saida = "------------- ESTACIONAMENTO -------------\n";
		saida += "PLACA: "+this.placa+"\nMODELO: "+this.modelo+"\n";
		saida += "HORA DE ENTRADA: "+this.horaE+"\nHORA DE SAÍDA: "+this.horaS;
		saida += "\nVALOR DO ESTACIONAMENTO A PAGAR: R$"+pagar();
		
		return saida;
	}
	
	public void alterarHoraEntrada(double h, double m, double s) {
		String a,b,c;
		Tempo aux = new Tempo(h, m, s);
		a = ((int) aux.getHor()) + "";
		b = ((int) aux.getMin()) + "";
		c = ((int) aux.getSec()) + "";
		
		if (Integer.parseInt(a) < 10) 
			a = "0"+ ((int)  aux.getHor());
		if (Integer.parseInt(b) < 10) 
			b = "0"+ ((int) aux.getMin());
		if (Integer.parseInt(c) < 10) 
			c = "0"+ ((int)aux.getSec());
		
		this.horaE = (a+":"+b+":"+c);		
	}
	
	public void alterarHoraSaida(double h, double m, double s) {
		String a,b,c;
		Tempo aux = new Tempo(h, m, s);
		a = ((int) aux.getHor()) + "";
		b = ((int) aux.getMin()) + "";
		c = ((int) aux.getSec()) + "";
		
		if (Integer.parseInt(a) < 10) 
			a = "0"+ ((int)  aux.getHor());
		if (Integer.parseInt(b) < 10) 
			b = "0"+ ((int) aux.getMin());
		if (Integer.parseInt(c) < 10) 
			c = "0"+ ((int)aux.getSec());
		
		this.horaS = (a+":"+b+":"+c);		
	}

	// Getters & Setters \\
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getHoraE() {
		return horaE;
	}
	public void setHoraE(double h, double m, double s) {
		String a,b,c;
		a = (""+(int) h); 
		b = ""+((int) m);
		c = ""+((int) s);
		if (h < 10) 
			a = "0"+ ((int) h);
		if (m < 10) 
			b = "0"+ ((int) m);
		if (s < 10) 
			c = "0"+ ((int) s);
		this.horaE = (a+":"+b+":"+c);
	}
	public void setHoraE(String hs) {
		this.horaE = hs;
	}
	public String getHoraS() {
		return horaS;
	}
	public void setHoraS(double h, double m, double s) {
		String a,b,c;
		a = (""+(int) h);
		b = ""+((int) m);
		c = ""+((int) s);
		if (h < 10) 
			a = "0"+ ((int) h);
		if (m < 10) 
			b = "0"+ ((int) m);
		if (s < 10) 
			c = "0"+ ((int) s);
		
		this.horaS = (a+":"+b+":"+c);
	}
	public void setHoraS(String horaS) {
		this.horaS = horaS;
	}
}
