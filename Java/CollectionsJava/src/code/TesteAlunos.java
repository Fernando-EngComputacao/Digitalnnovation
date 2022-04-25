package code;

import java.util.*;

public class TesteAlunos {

	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<String>();
		
		alunos.add("Fernando Furtado");
		alunos.add("Bia Silva");
		alunos.add("Amanda Luany");
		alunos.add("Carlos Lino");
		alunos.add("Amanda Furtado");
		alunos.add("Calebe Jordão");
		alunos.add("Amanda Castilho");
		
		System.out.println(alunos+"\n");
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		System.out.println("");
		//ou usando ForEach
		alunos.forEach(lista -> {
			System.out.println("Usando ForEach: "+lista);
		});
		
		// de Collection para List
		List<String> listaAlunos = new ArrayList<String>(alunos);
		System.out.println(listaAlunos);
	}
}
