package com.libertese.hackathon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * The address class
 * @author gabriel
 *
 */

@Entity
@Table(name = "adress")
public class Address {
	
	/**
	 * Attributes 
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "street")
	private String street;
	
	@Column(name = "CEP")
	private String CEP;
	
	@Column(name = "neighborhood")
	private String neighborhood;
	
	@Column(name = "number")
	private String number;
	
	@Column(name = "complement")
	private String complement;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@OneToOne
	@JoinColumn(name = "code")
	private Client client;
	
	public Address(String street, String CEP, String neighborhood, String number, String complement, String city,
			String state) {
		super();
		this.street = street;
		this.CEP = CEP;
		this.neighborhood = neighborhood;
		this.number = number;
		this.complement = complement;
		this.city = city;
		this.state = state;
	}
	
	public Address(String street, String cEP, String neighborhood, String number, String city, String state) {
		super();
		this.street = street;
		CEP = cEP;
		this.neighborhood = neighborhood;
		this.number = number;
		this.city = city;
		this.state = state;
	}

	/**
	 * Getters and Setters 
	 */
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	
}
