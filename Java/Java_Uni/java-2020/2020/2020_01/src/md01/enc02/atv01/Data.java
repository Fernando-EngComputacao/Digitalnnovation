package md01.enc02.atv01;

import java.util.ArrayList;

public class Data implements Capsula{
	private int dia;
	private int mes;
	private int ano;
	
	public Data() {
		this.dia = 28;
		this.mes = 11;
		this.ano = 2000;
	}
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	

	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		int [] vd = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		ArrayList<Integer> vm = new ArrayList<Integer>(); 
		
		for (int i = 1; i < 13; i++) {
			vm.add(i);
		}
		
		int pos = vm.indexOf(this.mes);
		
		if (dia <= vd[pos] && dia > 0) 
			this.dia = dia;
		else
			System.out.println("Valor de DIA inserido inválido!!!");
	
		
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		if (mes > 0 && mes < 13) 
			this.mes = mes;
		else
			System.out.println("Valor de MÊS inserido inválido!!!");
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		if (ano > -1) 
			this.ano = ano;
		else
			System.out.println("Valor de ANO inserido inválido!!!");
	}

	@Override
	public int calcDias(int m) {
		if (m > 0 && m < 13) {
			int [] dias = {31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
			int count = 0;
			for (int i = 0; i < m; i++) 
				count = dias[i];
			
		return count;
		}
		return 0;
	}

	@Override
	public int calcDias(String m) {
		String aux = m.toLowerCase().substring(0,3);
		int entregar = 0;
		String [] mes = {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"};
		int [] n = {1,2,3,4,5,6,7,8,9,10,11,12};
		for (int i = 0; i < 12; i++) {
			if (aux.equals(mes[i])) 
				entregar = n[i];
		}
		return calcDias(entregar); 
	}

	@Override
	public boolean validarD(int d) {
		boolean saida = false;
		if (d > 0 && d < 32) {
			saida = true;
		}
		return saida;
	}

	@Override
	public boolean validarM(int m) {
		boolean saida = false;
		if (m > 0 && m < 13) {
			saida = true;
		}
		return saida;
	}

	public String toString() {
		String d,m;
		d = ""+this.dia;
		m = ""+this.mes;
		if (Integer.parseInt(d) < 10) 
			d = "0"+this.dia;
		if (Integer.parseInt(m) < 10)
			m = "0"+this.mes;
		String aux = (d+"/"+m+"/"+this.ano);
		return aux;
	}

	public void imprimirNaTela() {
		System.out.println(toString());
	}
}
