package code;

import java.util.ArrayList;
import java.util.Collections;

public class TesteListas {

	public static void main(String[] args) {
		
		ArrayList<String> aulas = new ArrayList<String>();
		aulas.add("Aula de Java Collections");
		aulas.add("ArrayList<>");
		aulas.add("Listas de Strings");
		
		System.out.println(aulas);
		aulas.remove(1);
		System.out.println(aulas+"\n");
		
		for (String aula : aulas) {
			System.out.println(aula);
		}
		
		aulas.forEach(lista -> {
			System.out.println("Vetor Aulas: "+lista);
		});
		
		aulas.add("Aprimorando os conhecimentos adquiridos");
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
	}
}
