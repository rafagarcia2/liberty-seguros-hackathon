package com.libertese.hackathon.model;

/**
 * The address class
 * @author gabriel
 *
 */
public class Address {
	
	/**
	 * Attributes 
	 */
	
	private String street;
	private String CEP;
	private String neighborhood;
	private String number;
	private String complement;
	private String city;
	private String state;
	
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

	
	
}
