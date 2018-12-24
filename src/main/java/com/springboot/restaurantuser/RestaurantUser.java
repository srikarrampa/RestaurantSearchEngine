package com.springboot.restaurantuser;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.springboot.restaurants.Restaurants;
import com.springboot.usertable.User;


@SuppressWarnings("serial")
@Entity
@Table(name = "restaurantusertable")
public class RestaurantUser implements Serializable{
	

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_restaurant_user_table;
	
	@Column(name = "id_restaurant_user_table")
	public int getIdRestaurantUserTable() {
		return id_restaurant_user_table;
	}


	public void setIdRestaurantUserTable(int id_restaurant_user_table) {
		this.id_restaurant_user_table = id_restaurant_user_table;
	}

	@ManyToOne
	@JoinColumn(name = "u_id")
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@ManyToOne
	@JoinColumn(name = "rest_id")
	private Restaurants restaurant;
	

	public Restaurants getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurants restaurant) {
		this.restaurant = restaurant;
	}
	
	public RestaurantUser()
	{
		
	}
	public RestaurantUser(int id_restaurant_user_table, int userId, int restid) {
		super();
		this.id_restaurant_user_table = id_restaurant_user_table;
		this.user = new User(userId,"","",null);
		this.restaurant = new Restaurants(restid,"",null,null,"","");
	}

	
	
	
}
