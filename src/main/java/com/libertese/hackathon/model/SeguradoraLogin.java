package com.libertese.hackathon.model;

import javax.persistence.*;

@Entity
@Table(name = "seguradora_login")
public class SeguradoraLogin {
    private static final long serialVersionUID = 1L;

    public SeguradoraLogin(){}

    public SeguradoraLogin(Seguradora seguradora, String email, String senha){
        super();
        this.seguradora = seguradora;
        this.email = email;
        this.senha = senha;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_seguradora")
    private Seguradora seguradora;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Seguradora getSeguradora() {
        return seguradora;
    }

    public void setSeguradora(Seguradora seguradora) {
        this.seguradora = seguradora;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
