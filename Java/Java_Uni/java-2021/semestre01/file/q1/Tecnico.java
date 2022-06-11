package semestre01.file.q1;

public class Tecnico extends Assitente {
    private Double bonus;

    //Construtor
    public Tecnico(String nome, String endereco, Double salario, int nMatricula, Double bonus){
        super(nome, endereco, salario, nMatricula);
        this.bonus = bonus;
    }
    public Tecnico(){
        super();
    }

    //Get e Set
    public Double getBonus() {
        return bonus;
    }
    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    //Método
    public String exibirDados() {
        String res = "Dados do Assistente Técnico: \n";
        res += "Nome: " + this.getNome() + "\nEndereço: " + this.getEndereco()+
                "\nSalário: R$ " + this.getSalario() + "\nN° Matrícula: " + this.getnMatricula()+
                "\nBônus Salarial: " + this.bonus;
        return res;
    }
}
