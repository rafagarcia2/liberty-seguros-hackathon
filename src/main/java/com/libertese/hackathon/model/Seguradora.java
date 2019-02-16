package com.libertese.hackathon.model;

import javax.persistence.*;

@Entity
@Table(name = "seguradoras")
public class Seguradora {

    private static final long serialVersionUID = 1L;

    public Seguradora(){}

    public Seguradora(String nome, String urlFoto){
        super();
        this.nome = nome;
        this.urlFoto = urlFoto;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "urlFoto")
    private String urlFoto;

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

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }
}
