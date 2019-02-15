package com.libertese.hackathon.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * The Sale class
 * @author gabriel
 *
 */
@Entity
@Table (name = "sale")
public class Sale {

	/**
	 * Attributes
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_client")
	private Client client;
	
	@OneToOne 
	@JoinColumn(name = "id")
	private Insurer insurer;
	
	@Column (name = "value")
	private float value;
	
	@Column (name = "date")
	private Date date;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "status")
	private Status status;
	
	/**
	 * Construct
	 */
	
	
	public Sale(Client client, Insurer insurer, float value, Date date, Status status) {
		super();
		this.client = client;
		this.insurer = insurer;
		this.value = value;
		this.date = date;
		this.status = status;
	}

	/**
	 * Getters and Setters
	 */
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Insurer getInsurer() {
		return insurer;
	}

	public void setInsurer(Insurer insurer) {
		this.insurer = insurer;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
