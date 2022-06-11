package semestre01.file.q1;

public class Teste {
    public static void main(String[] args){
        //Objetos
        Funcionario fun = new Funcionario("Andreina", "Rua A", 1520.54);
        Assitente ass = new Assitente("Andreia", "Rua B", 2500.00, 123);
        Tecnico tec = new Tecnico("Adria", "Rua C", 2800.56, 124, 580.69);
        Administrativo adm = new Administrativo("Adriely", "Rua C", 3500.10, 125, "Matutino", "Vespertino");
        Gerente ger = new Gerente("Ariane", "Rua A", 385.39);

        //Usar Método ExibirDados
        System.out.println(fun.exibirDados() + "\n");
        System.out.println(ass.exibirDados() + "\n");
        System.out.println(tec.exibirDados() + "\n");
        System.out.println(adm.exibirDados() + "\n");
        System.out.println(ger.exibirDados() + "\n");

    }
}

