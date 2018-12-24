package com.springboot.restaurants;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.springboot.usertypetable.UserType;


@Entity
public class Restaurants {
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Restaurant;
	private String name_restaurant;
	private Date create_timestamp;
	private Date update_timestamp;
	private String created_by;
	private String location_restaurant;
	
	public Restaurants()
	{
		
	}
	
	public Restaurants(int id_Restaurant, String name_restaurant, Date create_timestamp, Date update_timestamp,
			String created_by, String location_restaurant) {
		super();
		this.id_Restaurant = id_Restaurant;
		this.name_restaurant = name_restaurant;
		this.create_timestamp = create_timestamp;
		this.update_timestamp = update_timestamp;
		this.created_by = created_by;
		this.location_restaurant = location_restaurant;
	}

	public int getId_Restaurant() {
		return id_Restaurant;
	}

	public void setId_Restaurant(int id_Restaurant) {
		this.id_Restaurant = id_Restaurant;
	}

	public String getName_restaurant() {
		return name_restaurant;
	}

	public void setName_restaurant(String name_restaurant) {
		this.name_restaurant = name_restaurant;
	}

	public Date getCreate_timestamp() {
		return create_timestamp;
	}

	public void setCreate_timestamp(Date create_timestamp) {
		this.create_timestamp = create_timestamp;
	}

	public Date getUpdate_timestamp() {
		return update_timestamp;
	}

	public void setUpdate_timestamp(Date update_timestamp) {
		this.update_timestamp = update_timestamp;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getLocation_restaurant() {
		return location_restaurant;
	}

	public void setLocation_restaurant(String location_restaurant) {
		this.location_restaurant = location_restaurant;
	}

	
	
	
}
