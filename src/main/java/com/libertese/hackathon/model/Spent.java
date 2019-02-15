package com.libertese.hackathon.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author gabriel
 *
 */

@Entity
@Table (name = "spent")
public class Spent {

	/**
	 * Attributes
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column (name = "value")
	private float value;
	
	@Column (name = "description")
	private String description;
	
	@Column (name = "date")
	private Date date;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "type")
	private SpentType type;
	
	/**
	 * Construct
	 */
	
	public Spent(float value, String description, Date date) {
		super();
		this.value = value;
		this.description = description;
		this.date = date;
	}	
	
	
	public Spent(float value, String description, Date date, SpentType type) {
		super();
		this.value = value;
		this.description = description;
		this.date = date;
		this.type = type;
	}

	/**
	 * Getters and Setters
	 */

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


	
	public SpentType getType() {
		return type;
	}


	
	public void setType(SpentType type) {
		this.type = type;
	}
	
	
}
