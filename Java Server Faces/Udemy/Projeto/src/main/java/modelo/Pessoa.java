package modelo;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipo")
public abstract class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    private int codigo;
    private String nome;
    private String telefone;
    private String email;
    private Endereco endereco;
    
    
    //Constructor
    public Pessoa() {
        super();
    }

    // Methods
    


    
    //Getters and Setters
    public void setEmail(String email) {       
        this.email = email;
    }
    
    
    @GeneratedValue(generator="genpessoa")
    @SequenceGenerator(sequenceName = "pessoa_codigo_seq", name="genpessoa")
    @Id
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Embedded
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    @Column(nullable=false, unique=true)
    public String getEmail() {
        return email;
    }
    
}
