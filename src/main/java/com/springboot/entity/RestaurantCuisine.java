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
@Table(name = "restaurantcuisinetable")
public class RestaurantCuisine implements Serializable{
	

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_restaurant_cuisine_table;
	
	@Column(name = "id_restaurant_cuisine_table")
	public int getIdRestaurantCuisineTable() {
		return id_restaurant_cuisine_table;
	}


	public void setIdRestaurantUserTable(int id_restaurant_cuisine_table) {
		this.id_restaurant_cuisine_table = id_restaurant_cuisine_table;
	}

	@ManyToOne
	@JoinColumn(name = "cuisine_id")
	private Cuisine cuisine;
	
	public Cuisine getCuisine() {
		return cuisine;
	}

	public void setCuisine(Cuisine cuisine) {
		this.cuisine = cuisine;
	}
	
	@ManyToOne
	@JoinColumn(name = "restaurantid")
	private Restaurants restaurant;
	

	public Restaurants getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurants restaurant) {
		this.restaurant = restaurant;
	}
	
	public RestaurantCuisine()
	{
		
	}
	public RestaurantCuisine(int id_restaurant_user_table, int userId, int restid) {
		super();
		this.id_restaurant_cuisine_table = id_restaurant_user_table;
		this.cuisine = new Cuisine(userId,"","","",null);
		this.restaurant = new Restaurants(restid,"",null,null,"","");
	}

	
	
	
}
