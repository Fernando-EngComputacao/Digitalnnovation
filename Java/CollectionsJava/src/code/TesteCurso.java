package code;

import code.modelo.Aula;
import code.modelo.Curso;

public class TesteCurso {

	public static void main(String[] args) {
		Curso javaCollections = new Curso("Collections about Java", "Fernando Furtado");
		
		
		javaCollections.adiciona(new Aula("ArrayList",23));
		
		System.out.println(javaCollections);
	}
}
