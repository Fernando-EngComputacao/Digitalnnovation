package code;


import java.util.*;

import code.modelo.*;

public class TesteCursoComAluno {

	public static void main(String[] args) {
		Curso javaCollections = new Curso("Java");
		
		javaCollections.adiciona(new Aula("Spring Boot", 45));
		javaCollections.adiciona(new Aula("Java JDBC",25));
		javaCollections.adiciona(new Aula("Banco de Dados SQL",35));
		
		Aluno a = new Aluno("Danielly",123);
		Aluno a2 = new Aluno("Roberta",124);
		
		javaCollections.matricula(a);
		javaCollections.matricula(a2);
		
		System.out.println("Alunos Matriculados!");
		javaCollections.getAlunos().forEach(lista -> {
			System.out.println(lista);
		});
		
		Set<Aluno> alunos = javaCollections.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator(); //faz os HashSet ou LinkedHashSet poder ter (as buscar nativas, como get) e semelhantes
		System.out.println("Iterador: "+iterador);
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println("Aluno por Iterador: "+proximo);
		}
		
		System.out.println("Verifica se o aluno está matriculado.");
		System.out.println(a.hashCode());
		
	}
}
