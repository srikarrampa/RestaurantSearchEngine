package com.springboot.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Cuisine {
	

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cuisine_id")
	private int cuisineId;
	@Column(name="cuisine_name")
	private String cuisineName;
	@Column(name="cuisine_created_by")
	private String cuisineCreatedBy;
	@Column(name="cuisine_desc")
	private String cuisineDesc;
	@Column(name="cuisine_created_date")
	private Date cuisineCreatedDate;

	public Cuisine()
	{
		
	}

	public Cuisine(int cuisineId, String cuisineName, String cuisineCreatedBy, String cuisineDesc,
			Date cuisineCreatedDate) {
		super();
		this.cuisineId = cuisineId;
		this.cuisineName = cuisineName;
		this.cuisineCreatedBy = cuisineCreatedBy;
		this.cuisineDesc = cuisineDesc;
		this.cuisineCreatedDate = cuisineCreatedDate;
	}
	
	
	
	public int getCuisineId() {
		return cuisineId;
	}

	public void setCuisineId(int cuisineId) {
		this.cuisineId = cuisineId;
	}

	public String getCuisineName() {
		return cuisineName;
	}

	public void setCuisineName(String cuisineName) {
		this.cuisineName = cuisineName;
	}

	public String getCuisineCreatedBy() {
		return cuisineCreatedBy;
	}

	public void setCuisineCreatedBy(String cuisineCreatedBy) {
		this.cuisineCreatedBy = cuisineCreatedBy;
	}

	public String getCuisineDesc() {
		return cuisineDesc;
	}

	public void setCuisineDesc(String cuisineDesc) {
		this.cuisineDesc = cuisineDesc;
	}

	public Date getCuisineCreatedDate() {
		return cuisineCreatedDate;
	}

	public void setCuisineCreatedDate(Date cuisineCreatedDate) {
		this.cuisineCreatedDate = cuisineCreatedDate;
	}	

	
}
