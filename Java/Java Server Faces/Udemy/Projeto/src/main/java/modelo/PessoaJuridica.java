/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author ferna
 */
@Entity
@DiscriminatorValue("PJ")
public class PessoaJuridica extends Pessoa implements Serializable {
    private String razaoSocial;
    private String cnpj;
    private String inscricaoEstadual;
    private String inscricaoMunicipal;
    private static final long serialVersionUID = 1L;
    
    
    //Constructor
    public PessoaJuridica() {
        super();
    }
    
    //Methods

    
   
    
    
    //Getters and Setters
    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }
    
}
