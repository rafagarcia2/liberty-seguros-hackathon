package com.libertese.hackathon.model;

import javax.persistence.*;

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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_user")
	private User user;

	@Column (name = "email")
	private String email;
	
	@Column (name = "phone")
	private String phone;
	
	@Column (name = "name")
	private String name;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "type")
	private StatusLead status;

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
	
	
	public StatusLead getStatus() {
		return status;
	}

	public void setStatus(StatusLead status) {
		this.status = status;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
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


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
