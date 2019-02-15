package com.libertese.hackathon.model;

/**
 * The Insurer class
 * @author gabriel
 *
 */
public class Insurer {

	/**
	 * Attributes
	 */
	
	private String name;
	private String site;
	
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
	
	
	
	
	
}
