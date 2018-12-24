package com.springboot.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name = "cuisineusertable")
public class CuisineUser implements Serializable{
	

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cuisine_user_table;
	
	@Column(name = "id_cuisine_user_table")
	public int getId_cuisine_user_table() {
		return id_cuisine_user_table;
	}


	public void setId_cuisine_user_table(int id_cuisine_user_table) {
		this.id_cuisine_user_table = id_cuisine_user_table;
	}

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@ManyToOne
	@JoinColumn(name = "cuisineid")
	private Cuisine cuisine;
	

	public Cuisine getCuisine() {
		return cuisine;
	}

	public void setCuisine(Cuisine cuisine) {
		this.cuisine = cuisine;
	}
	
	public CuisineUser()
	{
		
	}
	public CuisineUser(int id_cuisine_user_table, int userId, int cuisineId) {
		super();
		this.id_cuisine_user_table = id_cuisine_user_table;
		this.user = new User(userId,"","",null);
		this.cuisine = new Cuisine(cuisineId,"","","",null);
	}

	
	
	
}
