package com.libertese.hackathon.model;

import javax.persistence.*;

@Entity
@Table(name="caixa")
public class Caixa {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_CAIXA")
	@SequenceGenerator(name="SEQ_CAIXA", sequenceName="id_seq_caixa", allocationSize=1)
	@Column(name="id_caixa")
	private int id;
	
	@Enumerated(EnumType.STRING)
	@Column(name="tipo_lancamento")
	private TipoLancamento tipoLancamento;
	
	@Column
	private String fonte;
	
	@Column
	private String conta;
	
	@Column
	private double valor;

	@Enumerated(EnumType.STRING)
	@Column(name="status_lancamento")
	private StatusLancamento statusLancamento;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User usuario;

	public Caixa(TipoLancamento tipoLancamento, String fonte, String conta, double valor,
			StatusLancamento statusLancamento) {
		super();
		this.tipoLancamento = tipoLancamento;
		this.fonte = fonte;
		this.conta = conta;
		this.valor = valor;
		this.statusLancamento = statusLancamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TipoLancamento getTipoLancamento() {
		return tipoLancamento;
	}

	public void setTipoLancamento(TipoLancamento tipoLancamento) {
		this.tipoLancamento = tipoLancamento;
	}

	public String getFonte() {
		return fonte;
	}

	public void setFonte(String fonte) {
		this.fonte = fonte;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public StatusLancamento getStatusLancamento() {
		return statusLancamento;
	}

	public void setStatusLancamento(StatusLancamento statusLancamento) {
		this.statusLancamento = statusLancamento;
	}

	public User getUsuario() {
		return usuario;
	}

	public void setUsuario(User idUsuario) {
		this.usuario = idUsuario;
	}
}
