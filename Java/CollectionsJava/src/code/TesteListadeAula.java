package code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import code.modelo.Aula;

public class TesteListadeAula {

	public static void main(String[] args) {
		ArrayList<Aula> vetorAula = new ArrayList<Aula>();
		
		Aula al1 = new Aula("Java Collections",15);
		Aula al2 = new Aula("Classe de Java JPA",13);
		Aula al3 = new Aula("Aula de Java JDBC",14);
		
		vetorAula.add(al1); 
		vetorAula.add(al2);
		vetorAula.add(al3);
		
		System.out.println(vetorAula);
		Collections.sort(vetorAula);
		System.out.println(vetorAula+"\n");
		
		Collections.sort(vetorAula, Comparator.comparing(Aula::getTempo));
		//ou (a mesma função da linha abaixo é da linha acima
		vetorAula.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(vetorAula);
		
	}
}
