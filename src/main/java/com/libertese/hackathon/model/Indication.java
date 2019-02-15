package com.libertese.hackathon.model;

/**
 * 
 * @author gabriel
 *
 */
public class Indication {

	/**
	 * Attributes
	 */
	
	private Client client;
	private String email;
	private String phone;
	
	/**
	 * Construct 
	 */
	
	public Indication(Client client, String email, String phone) {
		super();
		this.client = client;
		this.email = email;
		this.phone = phone;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
