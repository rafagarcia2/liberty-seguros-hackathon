package com.libertese.hackathon.model;

public enum StatusLead {
	NOVO,
	AGUARDANDO_RESPOSTA,
	NEGADO,
	ACEITO;

	@Override
	public String toString() {
		switch(this) {
			case NOVO: return "NOVO";
			case AGUARDANDO_RESPOSTA: return "AGUARDANDO RESPOSTA";
			case NEGADO: return "NEGADO";
			case ACEITO: return "ACEITO";
			default: throw new IllegalArgumentException();
		}
	}
}
