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

	@OneToMany (mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Indication> indication;

	@OneToMany (mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Sale> sale;
	
	/**
	 * Construct 
	 */
	
	public Client(String name, String email, String phone, String cpf,
				  String street, String CEP, String neighborhood, String number,
				  String complement, String city, String state) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.cpf = cpf;
		this.street = street;
		this.CEP = CEP;
		this.neighborhood = neighborhood;
		this.number = number;
		this.complement = complement;
		this.city = city;
		this.state = state;
	}

	public Client(String name, String email, String phone, String cpf,
				  String street, String CEP, String neighborhood,
				  String number, String city, String state) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.cpf = cpf;
		this.street = street;
		this.CEP = CEP;
		this.neighborhood = neighborhood;
		this.number = number;
		this.city = city;
		this.state = state;
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

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String CEP) {
		this.CEP = CEP;
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

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	
}
