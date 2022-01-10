package modelo;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class DiariaReservada extends Diaria implements Serializable {
    private Reserva reserva;
    private static final long serialVersionUID = 1L;
    
    
    //Constructor
    public DiariaReservada(){
        super();
    }
    
    //Getters and Setters
    @ManyToOne
    @JoinColumn(name="cod_reserva")
    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    
}
