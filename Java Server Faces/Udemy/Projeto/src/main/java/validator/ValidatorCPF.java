package validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.*;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.ValidatorException;

/*
 * @author Fernando Furtado
 */
@FacesValidator(value="idValidadorCPF")
public class ValidatorCPF implements Validator {
    
    @Override
    public void validate(FacesContext context, UIComponent componet, Object value) throws ValidatorException {
        String cpf = value.toString().replaceAll("[^0-9]", "");
        
        if (cpf.length() == 11) {
            int dv1 = Integer.parseInt(cpf.charAt(0)+"");
            int dv2 = Integer.parseInt(cpf.charAt(10)+"");
            
            // A validar o DV1
            int cont = 10;
            int soma = 0;
            
            for (int i = 0; i < 9; i++){
                soma += cont * (Integer.parseInt(cpf.charAt(i) + ""));
                cont--;
            }
            
            int verifica = soma % 11;
            if (verifica < 2) verifica = 0;
            else verifica = 11 - verifica;
            
            if (dv1 != verifica)
                throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "", ""));
            
            // A validar o DV2
            cont = 11;
            soma = 0;
            
            for(int i = 0; i < 10; i++){
                soma += cont * (Integer.parseInt(cpf.charAt(i)+""));
                cont--;
            }
            
            verifica = soma % 11;
            if (verifica < 2) verifica = 0;
            else verifica = 11 - verifica;
            
            if (dv2 != verifica)
                throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "", ""));
        }
    }
}
