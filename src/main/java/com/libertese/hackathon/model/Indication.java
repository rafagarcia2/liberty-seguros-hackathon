package com.libertese.hackathon.model;

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
 * 
 * @author gabriel
 *
 */
@Entity
@Table (name = "indication")
public class Indication {

	/**
	 * Attributes
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_client")
	private Client client;
	
	@Column (name = "email")
	private String email;
	
	@Column (name = "phone")
	private String phone;
	
	@Column (name = "name")
	private String name;
	/**
	 * Construct 
	 */

	public Indication(){}

	public Indication(Client client, String email, String phone, String name) {
		super();
		this.client = client;
		this.email = email;
		this.phone = phone;
		this.name = name;
	}
	
	public Indication(Client client, String email, String name) {
		this.client = client;
		this.email = email;
		this.name = name;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getId ()
	{
		return this.id;
	}
	
}
