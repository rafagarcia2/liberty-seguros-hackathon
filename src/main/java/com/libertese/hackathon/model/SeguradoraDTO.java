package com.libertese.hackathon.model;

public class SeguradoraDTO {
    private int idSeguradora;
    private String email;
    private String senha;

    public int getIdSeguradora() {
        return idSeguradora;
    }

    public void setIdSeguradora(int idSeguradora) {
        this.idSeguradora = idSeguradora;
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
