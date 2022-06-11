package semestre01.file.q1;

public class Assitente extends Funcionario {
    private int nMatricula;

    // Construtor
    public Assitente(String nome, String endereco, Double salario, int nMatricula) {
        super(nome, endereco, salario);
        this.nMatricula = nMatricula;
    }
    public Assitente(){
        super();
    }

    // Get
    public int getnMatricula(){
        return this.nMatricula;
    }

    // Sobrecarga do Método ExibirDados
    public String exibirDados(){
        String res = "Dados do Assistente: \n";
        res += "Nome: " + this.getNome() + "Endereço: " + this.getEndereco() +
                "\nN° de Matrícula: " + this.nMatricula;
        return  res;
    }
}
