package com.libertese.hackathon.util;

import com.libertese.hackathon.model.Cotacao;
import com.libertese.hackathon.model.Seguradora;
import com.libertese.hackathon.model.VeiculoInformacoes;

import java.util.List;

/**
 * Classe que trata o formulario de cotacoes
 */
public class CotacaoForm {

    private List<String> seguradoras;
    private List<String> comissoes;
    private Cotacao cotacao;
    private VeiculoInformacoes veiculoInformacoes;
    private String fimVigencia;
    private String inicioVigencia;

    public CotacaoForm(List<String> seguradoras, List<String> comissoes, Cotacao cotacao, VeiculoInformacoes veiculoInformacoes) {
        this.seguradoras = seguradoras;
        this.comissoes = comissoes;
        this.cotacao = cotacao;
        this.veiculoInformacoes = veiculoInformacoes;
    }

    public Cotacao getCotacao() {
        return cotacao;
    }

    public void setCotacao(Cotacao cotacao) {
        this.cotacao = cotacao;
    }

    public List<String> getSeguradoras() {
        return seguradoras;
    }

    public void setSeguradoras(List<String> seguradoras) {
        this.seguradoras = seguradoras;
    }

    public List<String> getComissoes() {
        return comissoes;
    }

    public void setComissoes(List<String> comissoes) {
        this.comissoes = comissoes;
    }

    public VeiculoInformacoes getVeiculoInformacoes() {
        return veiculoInformacoes;
    }

    public void setVeiculoInformacoes(VeiculoInformacoes veiculoInformacoes) {
        this.veiculoInformacoes = veiculoInformacoes;
    }

    public String getFimVigencia() {
        return fimVigencia;
    }

    public void setFimVigencia(String fimVigencia) {
        this.fimVigencia = fimVigencia;
    }

    public String getInicioVigencia() {
        return inicioVigencia;
    }

    public void setInicioVigencia(String inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }
}
