package com.libertese.hackathon.model;

/**
 * The Client class
 * @author gabriel
 *
 */
public class Client {

	/**
	 * Attributes
	 */
	
	private String name;
	private String email;
	private String phone;
	private String cpf;
	private Address adress;
	
	/**
	 * Construct 
	 */
	
	public Client(String name, String email, String phone, String cpf, Address adress) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.cpf = cpf;
		this.adress = adress;
	}

	/**
	 * Getters and Setters
	 */
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}
	
	
	
	
	
}
