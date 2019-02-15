package com.libertese.hackathon.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * The Insurer class
 * @author gabriel
 *
 */
@Entity
@Table (name = "insurer")
public class Insurer {

	/**
	 * Attributes
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column (name = "name")
	private String name;
	
	@Column (name = "site")
	private String site;
	
	@OneToOne(mappedBy="insurer",cascade = CascadeType.ALL)
	private Sale sale;
	
	/**
	 * Construct 
	 */
	
	public Insurer(String name, String site) {
		super();
		this.name = name;
		this.site = site;
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

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}
	
	public Integer getId () {
		return this.id;
	}
	
	
	
}
