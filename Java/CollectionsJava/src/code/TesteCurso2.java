package code;

import java.util.*;

import code.modelo.*;

public class TesteCurso2 {

	public static void main(String[] args) {
		
		Curso javaCollections = new Curso("Java");
		
		javaCollections.adiciona(new Aula("Spring Boot", 45));
		javaCollections.adiciona(new Aula("Java JDBC",25));
		javaCollections.adiciona(new Aula("Banco de Dados SQL",35));
		
		List<Aula> aulasImutaveis = javaCollections.getAulas();
		List<Aula> aulas = new ArrayList<Aula>(aulasImutaveis);
		Collections.sort(aulas);
		
		System.out.println(aulasImutaveis);
		System.out.println(aulas);
		System.out.println(javaCollections.getTempoTotal());
		System.out.println(javaCollections);
				
	}
}
