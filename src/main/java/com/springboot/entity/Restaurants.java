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
public class Restaurants {
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_Restaurant")
	private int idRestaurant;
	@Column(name="name_restaurant")
	private String nameRestaurant;
	@Column(name="create_timestamp")
	private Date createTimestamp;
	@Column(name="update_timestamp")
	private Date updateTimestamp;
	@Column(name="created_by")
	private String createdBy;
	@Column(name="location_restaurant")
	private String locationRestaurant;
	
	public Restaurants()
	{
		
	}

	public int getIdRestaurant() {
		return idRestaurant;
	}

	public void setIdRestaurant(int idRestaurant) {
		this.idRestaurant = idRestaurant;
	}

	public String getNameRestaurant() {
		return nameRestaurant;
	}

	public void setNameRestaurant(String nameRestaurant) {
		this.nameRestaurant = nameRestaurant;
	}

	public Date getCreateTimestamp() {
		return createTimestamp;
	}

	public void setCreateTimestamp(Date createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public Date getUpdateTimestamp() {
		return updateTimestamp;
	}

	public void setUpdateTimestamp(Date updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getLocationRestaurant() {
		return locationRestaurant;
	}

	public void setLocationRestaurant(String locationRestaurant) {
		this.locationRestaurant = locationRestaurant;
	}

	public Restaurants(int idRestaurant, String nameRestaurant, Date createTimestamp, Date updateTimestamp,
			String createdBy, String locationRestaurant) {
		super();
		this.idRestaurant = idRestaurant;
		this.nameRestaurant = nameRestaurant;
		this.createTimestamp = createTimestamp;
		this.updateTimestamp = updateTimestamp;
		this.createdBy = createdBy;
		this.locationRestaurant = locationRestaurant;
	}
	
	
}
