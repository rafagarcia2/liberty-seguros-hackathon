package com.libertese.hackathon.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="cotacao")
public class Cotacao {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_COTACAO")
	@SequenceGenerator(name="SEQ_COTACAO", sequenceName="id_seq_cotacao", allocationSize=1)
	@Column(name="id_cotacao")
	private int id;

	@Column(name="id_cliente")
	private Client cliente;

	@Column(name="id_segurado")
	private Seguradora seguradora;

	@Column
	private String ramo;

	@Temporal(TemporalType.DATE)
	@Column(name="vigencia_inicio", columnDefinition="DATE")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date inicioVigencia;

	@Temporal(TemporalType.DATE)
	@Column(name="vigencia_fim", columnDefinition="DATE")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date fimVigencia;


	public Cotacao(int id, Client cliente, String ramo, Date inicioVigencia, Date fimVigencia) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.ramo = ramo;
		this.inicioVigencia = inicioVigencia;
		this.fimVigencia = fimVigencia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Client getCliente() {
		return cliente;
	}

	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}

	public String getRamo() {
		return ramo;
	}

	public void setRamo(String ramo) {
		this.ramo = ramo;
	}

	public Date getInicioVigencia() {
		return inicioVigencia;
	}

	public void setInicioVigencia(Date inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}

	public Date getFimVigencia() {
		return fimVigencia;
	}

	public void setFimVigencia(Date fimVigencia) {
		this.fimVigencia = fimVigencia;
	}

	public Seguradora getSeguradora() {
		return seguradora;
	}

	public void setSeguradora(Seguradora seguradora) {
		this.seguradora = seguradora;
	}

}
