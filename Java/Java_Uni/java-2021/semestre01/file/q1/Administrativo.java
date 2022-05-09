package semestre01.file.q1;

public class Administrativo extends Assitente {
    private String turno;
    private String turnoAdd;

    //Construtor
    public Administrativo(String nome, String endereco, Double salario, int nMatricula, String turno, String turnoAdd){
        super(nome, endereco, salario, nMatricula);
        this.turno = turno;
        this.turnoAdd = turnoAdd;
    }
    public Administrativo(){
        super();
    }

    //Get e Set
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public String getTurnoAdd() {
        return turnoAdd;
    }
    public void setTurnoAdd(String turnoAdd) {
        this.turnoAdd = turnoAdd;
    }

    //Método
    public String exibirDados() {
        String res = "Dados do Assistente Adminstrativo: \n";
        res += "Nome: " + this.getNome() + "\nEndereço: " + this.getEndereco()+
                "\nSalário: R$ " + this.getSalario() + "\nN° Matrícula: " + this.getnMatricula()+
                "\nTurno: " + this.turno + "\nTurno Adicional: " + this.turnoAdd;
        return res;
    }
}
