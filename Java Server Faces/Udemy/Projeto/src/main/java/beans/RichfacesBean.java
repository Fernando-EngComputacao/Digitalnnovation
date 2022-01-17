package beans;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Fernando Furtado
 */
@ManagedBean
@SessionScoped
public class RichfacesBean {
    private String titulo;
    
    
    // Getters and Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
