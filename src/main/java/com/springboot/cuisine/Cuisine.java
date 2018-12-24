package com.springboot.cuisine;

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
public class Cuisine {
	

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cuisine_id;
	private String cuisine_name;
	private String cuisine_created_by;
	private String cuisine_desc;
	private Date cuisine_created_date;

	public Cuisine()
	{
		
	}
	
	
	public Cuisine(int cuisine_id, String cuisine_name, String cuisine_created_by, String cuisine_desc,
			Date cuisine_created_date) {
		super();
		this.cuisine_id = cuisine_id;
		this.cuisine_name = cuisine_name;
		this.cuisine_created_by = cuisine_created_by;
		this.cuisine_desc = cuisine_desc;
		this.cuisine_created_date = cuisine_created_date;
	}


	public int getcuisine_id() {
		return cuisine_id;
	}


	public void setcuisine_id(int cuisine_id) {
		this.cuisine_id = cuisine_id;
	}


	public String getcuisine_name() {
		return cuisine_name;
	}


	public void setcuisine_name(String cuisine_name) {
		this.cuisine_name = cuisine_name;
	}


	public String getcuisine_created_by() {
		return cuisine_created_by;
	}


	public void setcuisine_created_by(String cuisine_created_by) {
		this.cuisine_created_by = cuisine_created_by;
	}


	public String getcuisine_desc() {
		return cuisine_desc;
	}


	public void setcuisine_desc(String cuisine_desc) {
		this.cuisine_desc = cuisine_desc;
	}


	public Date getcuisine_created_date() {
		return cuisine_created_date;
	}


	public void setcuisine_created_date(Date cuisine_created_date) {
		this.cuisine_created_date = cuisine_created_date;
	}


	
	
	
}
