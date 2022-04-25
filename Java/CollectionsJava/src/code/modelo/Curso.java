package code.modelo;

import java.security.NoSuchAlgorithmException;
import java.util.*;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<Aluno>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	
	//Constructor
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	public Curso(String nome) {
		this.nome = nome;
	}
	
	public Curso() {}
	
	
	//Methods
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	public boolean verificaMatriculado(Aluno aluno) {
		return alunos.contains(aluno);
		
	}
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getnMatricula(), aluno);
	}
	public Aluno buscaPorMatricula(int matriculan) throws NoSuchAlgorithmException {
		if(!matriculaParaAluno.containsKey(matriculan))
			throw new NoSuchAlgorithmException(); 
		return matriculaParaAluno.get(matriculan);
	}
	
	//Getters and Setters
	public List<Aula> getAulas(){
		return Collections.unmodifiableList(aulas);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getInstrutor() {
		return instrutor;
	}
	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}
	public Set<Aluno> getAlunos(){
		return Collections.unmodifiableSet(alunos);
	}
	
	//toString
	public String toString() {
		return "[Curso: "+nome+", tempo total: "+this.getTempoTotal()+", aulas: "+this.aulas+"]";
	}
}
