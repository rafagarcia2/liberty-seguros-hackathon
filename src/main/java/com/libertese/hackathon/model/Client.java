package com.libertese.hackathon.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * The Client class
 * @author gabriel
 *
 */
@Entity
@Table(name = "client")
public class Client {

	/**
	 * Attributes
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer code;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "cpf")
	private String cpf;
	
	@OneToOne(mappedBy="client",cascade = CascadeType.ALL)
	private Address adress;
	
	@OneToMany (mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Indication> indication;

	@OneToMany (mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Sale> sale;
	
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

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	
}
