package com.libertese.hackathon.model;

import java.sql.Date;

/**
 * The Sale class
 * @author gabriel
 *
 */
public class Sale {

	/**
	 * Attributes
	 */
	
	private Client client;
	private Insurer insurer;
	private float value;
	private Date date;
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
