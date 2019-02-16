package com.libertese.hackathon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="orcamento")
public class Orcamento {

	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_ORCAMENTO")
	@SequenceGenerator(name="SEQ_ORCAMENTO", sequenceName="id_seq_orcamento", allocationSize=1)
	@Column(name="id_orcamento")
	private int id;
	
	@Column
	@NotBlank(message = "Campo obrigatório")
	private String cliente;
	
	@Column
	@NotBlank(message = "Campo obrigatório")
	private String seguradora;
	
	@Column
	private String ramo;
	
	@Column
	private double valor;

	@Column
	private String status;
	
	@Column
	private String data_criacao;

	public Orcamento(@NotBlank(message = "Campo obrigatório") String cliente,
			@NotBlank(message = "Campo obrigatório") String seguradora,
			@NotBlank(message = "Campo obrigatório") String ramo, double valor,
			String status) {
		super();
		this.cliente = cliente;
		this.seguradora = seguradora;
		this.ramo = ramo;
		this.valor = valor;
		this.status = status;
	}
	
	public Orcamento() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getSeguradora() {
		return seguradora;
	}

	public void setSeguradora(String seguradora) {
		this.seguradora = seguradora;
	}

	public String getRamo() {
		return ramo;
	}

	public void setRamo(String ramo) {
		this.ramo = ramo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getData_criacao() {
		return data_criacao;
	}

	public void setData_criacao(String data_criacao) {
		this.data_criacao = data_criacao;
	}
	
	
}
