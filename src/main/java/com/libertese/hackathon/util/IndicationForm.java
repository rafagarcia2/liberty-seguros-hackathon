package com.libertese.hackathon.util;

import com.libertese.hackathon.model.StatusLead;

public class IndicationForm {

    private StatusLead status;
    private String observacao;

    public StatusLead getStatus() {
        return status;
    }

    public void setStatus(StatusLead status) {
        this.status = status;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
