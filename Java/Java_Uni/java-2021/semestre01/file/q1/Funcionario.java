package semestre01.file.q1;

public class Funcionario {
    private String nome;
    private String endereco;
    private Double salario;

    // Construtor
        public Funcionario (String nome, String endereco, Double salario){
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
    }
    public Funcionario(){}

    // Get e Set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    // Método
    public String exibirDados(){
        String res = "Dados do Funcionário:\n";
        res += "Nome: " + this.nome + "\nEndereço: " + this.endereco +
                "Salário: R$ " + this.salario;
        return res;
    }
}
