package com.libertese.hackathon.util;

import com.libertese.hackathon.model.Client;

import java.util.List;

/**
 * Classe que trata o formulario de cotacao
 */
public class CotacaoForm {

    private Client cliente;
    private List<Object> informacoes;

    /**
     *
     * @return
     */
    public Client getCliente() {
        return cliente;
    }

    /**
     *
     * @param cliente
     */
    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    /**
     *
     * @return
     */
    public List<Object> getInformacoes() {
        return informacoes;
    }

    public void setInformacoes(List<Object> informacoes) {
        this.informacoes = informacoes;
    }
}
