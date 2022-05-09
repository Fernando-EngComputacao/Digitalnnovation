package md04.enc05.sistema;

public class Teste {
	public static void main(String[] args) {
		Aluno a = new Aluno(1, "aluno", "123", "#1");
		Aluno a2 = new Aluno(2, "aluna", "123", "#2");
		Aluno a3 = new Aluno(3, "aluna", "123", "#2");
		
		a.setNome("Ana"); 
		a2.setNome("Lara"); 
		a3.setNome("Mara");
		
		System.out.println(a.equals(a2));
		System.out.println(a2.equals(a3));
		System.out.println(a3.equals(a));
		
		System.out.println(a.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		
		System.out.println(a.efetuarLogin("aluna", "123"));
		System.out.println(a.efetuarLogin("aluno", "123")+"\n");
		
		a.efetuarLogoff();
		
		
		Professor p = new Professor(1, "login", "123", "mat");
		Professor p2 = new Professor(1, "login", "123", "pro");
		
		p.setNome("Pedro");
		p2.setNome("Pablo");
		
		System.out.println(p.equals(p2)); p.setId(2);
		System.out.println(p.equals(p2));
		
		System.out.println(p.toString());
		System.out.println(p2.toString());
		
		System.out.println(p.efetuarLogin("login", "123"));
		System.out.println(p.efetuarLogin("login", "124"));
		
		p.efetuarLogoff();
		p2.efetuarLogoff();
		
		
		
	}
}
