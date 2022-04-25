package code;

import java.security.NoSuchAlgorithmException;

import code.modelo.*;

public class TesteBuscaAlunosNoCurso {

	public static void main(String[] args) throws NoSuchAlgorithmException {
Curso javaCollections = new Curso("Java");
		
		javaCollections.adiciona(new Aula("Spring Boot", 45));
		javaCollections.adiciona(new Aula("Java JDBC",25));
		javaCollections.adiciona(new Aula("Banco de Dados SQL",35));
		
		Aluno a = new Aluno("Danielly",123);
		Aluno a2 = new Aluno("Roberta",124);
		
		javaCollections.matricula(a);
		javaCollections.matricula(a2);
		
		Aluno aluno = javaCollections.buscaPorMatricula(123);
		System.out.println(aluno);
	}
}
