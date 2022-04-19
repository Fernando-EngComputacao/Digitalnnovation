package beans;

import java.text.spi.DateFormatProvider;
import java.util.*;
import java.util.Date;
import static java.util.Date.UTC;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.model.SelectableDataModel;
import sun.util.calendar.BaseCalendar;


/**
 *
 * @author Fernando Furtado
 */
@ManagedBean
@SessionScoped
public class PrimefacesBean {
    private Date data;

    
    // Methods
    public void definirData(Date event){
        int dt = event.getDate();
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage("Data Alterada", "A data agora é: " + data));
        
    }
    
    // Getters and Setters
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
}
