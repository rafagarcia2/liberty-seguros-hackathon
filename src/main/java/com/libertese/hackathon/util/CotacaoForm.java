package com.libertese.hackathon.util;

import com.libertese.hackathon.model.Cotacao;
import com.libertese.hackathon.model.Seguradora;

import java.util.List;

/**
 * Classe que trata o formulario de cotacoes
 */
public class CotacaoForm {

    private List<Seguradora> seguradoras;
    private List<Cotacao> cotacoes;

    public List<Cotacao> getCotacoes() {
        return cotacoes;
    }

    public void setCotacoes(List<Cotacao> cotacoes) {
        this.cotacoes = cotacoes;
    }

    public List<Seguradora> getSeguradoras() {
        return seguradoras;
    }

    public void setSeguradoras(List<Seguradora> seguradoras) {
        this.seguradoras = seguradoras;
    }
}
