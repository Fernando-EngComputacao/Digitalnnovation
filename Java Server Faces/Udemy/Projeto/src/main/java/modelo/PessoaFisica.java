package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@DiscriminatorValue("PF")
public class PessoaFisica extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cpf;
    private String rg;
    private Date dataNasc;
    private Sexo sexo;

    //Constructor
    public PessoaFisica() {
        super();
    }

    //Getters and Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    @Temporal(TemporalType.DATE)
    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
    @Enumerated
    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    
    

}
