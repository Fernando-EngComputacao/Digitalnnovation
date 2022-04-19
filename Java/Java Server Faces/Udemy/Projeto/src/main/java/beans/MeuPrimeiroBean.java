    package beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;


@ManagedBean(name="meuPrimeiroBean")
public class MeuPrimeiroBean implements Serializable{

   private String ola = "Hello World!";
   private boolean exibir = true;
   
   public String getOla(){
       return this.ola;
   }
   
   //Getters and Setters
    public boolean isExibir() {
        return exibir;
    }

    public void setExibir(boolean exibir) {
        this.exibir = exibir;
    }
   
    
}
