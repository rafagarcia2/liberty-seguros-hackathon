package com.libertese.hackathon.model;

import java.sql.Date;

/**
 * 
 * @author gabriel
 *
 */
public class Spent {

	/**
	 * Attributes
	 */
	
	private float value;
	private String description;
	private Date date;
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
