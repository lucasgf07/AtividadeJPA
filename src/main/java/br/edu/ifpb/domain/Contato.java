package br.edu.ifpb.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "contatos")
public class Contato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String telefoneComercial;
    private String telefoneResidencial;
    private String telefoneCelular;

    public Contato() {
    }

    public Contato(String telefoneComercial, String telefoneResidencial, String telefoneCelular) {
        this.telefoneComercial = telefoneComercial;
        this.telefoneResidencial = telefoneResidencial;
        this.telefoneCelular = telefoneCelular;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    public String getTelefoneResidencial() {
        return telefoneResidencial;
    }

    public void setTelefoneResidencial(String telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }
}
