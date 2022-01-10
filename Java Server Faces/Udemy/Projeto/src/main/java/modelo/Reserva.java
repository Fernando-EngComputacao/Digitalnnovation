package modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Reserva implements Serializable {

    private int codigo;
    private Date data;
    private double valor;
    private Pessoa cliente;
    private Collection<DiariaReservada> diarias;

    // Constructor 
    public Reserva() {
        super();
    }

    //Getters and Setters
    @Id
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @ManyToOne
    @JoinColumn(name = "cod_pessoa")
    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    @OneToMany(mappedBy = "reserva",
            fetch = FetchType.EAGER,
            cascade = {CascadeType.ALL})
    public Collection<DiariaReservada> getDiarias() {
        return diarias;
    }

    public void setDiarias(Collection<DiariaReservada> diarias) {
        this.diarias = diarias;
    }

}
