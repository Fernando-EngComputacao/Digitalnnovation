package semestre01.file.q1;

public class Gerente extends Funcionario {

    //Construtor
    public Gerente(String nome, String endereco, Double salario){
        super(nome, endereco, salario);
    }
    public Gerente(){
        super();
    }

    //Método
    public String exibirDados() {
        String res = "Dados do Gerente: \n";
        res += "Nome: " + this.getNome() + "\nEndereço: " + this.getEndereco()+
                "\nSalário: R$ " + this.getSalario();
        return res;
    }
}
