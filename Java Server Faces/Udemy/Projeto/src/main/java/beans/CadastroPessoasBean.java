package beans;

import java.io.Serializable;
import java.util.*;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;

import modelo.Pessoa;
import modelo.PessoaFisica;
import modelo.PessoaJuridica;
import modelo.Sexo;
 
@Named
@SessionScoped
public class CadastroPessoasBean implements Serializable{
    private Pessoa pessoaSelecionada;
    private Collection<Pessoa> lista;
    String tipoNovaPessoa;
    
    //Construtor
    public CadastroPessoasBean(){
        pessoaSelecionada = new PessoaFisica();
        lista = new ArrayList<Pessoa>();
        
        for (int i = 0; i < 10; i++) {
            Pessoa p = (i%2==0) ? new PessoaFisica() : new PessoaJuridica();
            p.setNome(String.format("Fulano %02d", i));
            p.setEmail(String.format("fulano%02d@teste.com", i));
            p.setTelefone(String.format("9999.88%02d", i));
           lista.add(p);
        }
    }
    
    //Methods
    public void salvar(){
        if (!lista.contains(pessoaSelecionada)) {
            lista.add(pessoaSelecionada);
        }
        FacesContext contexto = FacesContext.getCurrentInstance();
        contexto.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Edição efetuada com sucesso", ""));
        tipoNovaPessoa = null;
        pessoaSelecionada = null;
    }
    
    public String cancelar(){
        tipoNovaPessoa = null;
        pessoaSelecionada = null;
        return "primeiro.jsf";
    }
    
    public void editar(){
        if (tipoNovaPessoa == null) {
            tipoNovaPessoa = "PF";
        }
    }
    
    public void excluir(){
        if (tipoNovaPessoa == null) {
            tipoNovaPessoa = "PF";
            tipoNovaPessoa = null;
        }
        lista.remove(pessoaSelecionada);
        pessoaSelecionada = new PessoaFisica();
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Pessoa excluído com sucesso",""));
    }
    
    public void criar(){
        FacesContext contexto =  FacesContext.getCurrentInstance();
        if (tipoNovaPessoa == null) {
            contexto.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Especique o tipo'", ""));
        }
        
        if (tipoNovaPessoa.equals("PF")) {
            pessoaSelecionada = new PessoaFisica();
        } else if (tipoNovaPessoa.equals("PJ")){
            pessoaSelecionada = new PessoaJuridica();
        }
        
        contexto.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Pessoa criada com sucesso",""));
    }
       
    //Getters and Setters
    public Pessoa getPessoaSelecionada() {
        return pessoaSelecionada;
    }

    public void setPessoaSelecionada(Pessoa pessoaSelecionada) {
        this.pessoaSelecionada = pessoaSelecionada;
    }

    public Collection<Pessoa> getLista() {
        return lista;
    }

    public void setLista(Collection<Pessoa> lista) {
        this.lista = lista;
    }
    
    public String getTipoNovaPessoa() {
        return tipoNovaPessoa;
    }

    public void setTipoNovaPessoa(String tipoNovaPessoa) {
        this.tipoNovaPessoa = tipoNovaPessoa;
    }    
    
    //Getters and Setters enexistentes
    public Sexo[] getSexo(){
        return Sexo.values();
    }
    
    public boolean isPessoaFisicaSelecionada(){
        return pessoaSelecionada instanceof PessoaFisica;
    }
    
    public boolean isPessoaJuridicaSelecionada(){
        return pessoaSelecionada instanceof PessoaJuridica;
    }
    
    public void ouvinteAjax(AjaxBehaviorEvent event){
        Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).info("AJAX" + event.getPhaseId());
    }
    
    public void ouvinetAjax(ValueChangeEvent event){
        Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).info("AJAX VALUE CHANGE" + event.getPhaseId());
    }
}
