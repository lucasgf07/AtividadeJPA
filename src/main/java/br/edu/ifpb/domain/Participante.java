package br.edu.ifpb.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "participantes")
public class Participante implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private String email;
    private String nomeCracha;
    private String instituicao;
    private String cpf;
    private String tipoUsuario;
    private String profissao;

    @OneToOne
    private Endereco endereco;

    @OneToOne
    private Contato contato;

    @OneToMany
    private List<Artigo> artigos;

    @OneToMany
    private List<Inscricao> inscricoes;

    public Participante() {
    }

    public Participante(String nome, String email, String nomeCracha, String instituicao, String cpf, String tipoUsuario, String profissao, Endereco endereco, Contato contato, List<Artigo> artigos, List<Inscricao> inscricoes) {
        this.nome = nome;
        this.email = email;
        this.nomeCracha = nomeCracha;
        this.instituicao = instituicao;
        this.cpf = cpf;
        this.tipoUsuario = tipoUsuario;
        this.profissao = profissao;
        this.endereco = endereco;
        this.contato = contato;
        this.artigos = artigos;
        this.inscricoes = inscricoes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeCracha() {
        return nomeCracha;
    }

    public void setNomeCracha(String nomeCracha) {
        this.nomeCracha = nomeCracha;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public List<Artigo> getArtigos() {
        return artigos;
    }

    public void setArtigos(List<Artigo> artigos) {
        this.artigos = artigos;
    }

    public List<Inscricao> getInscricoes() {
        return inscricoes;
    }

    public void setInscricoes(List<Inscricao> inscricoes) {
        this.inscricoes = inscricoes;
    }
}
