package com.springboot.dishrestaurant;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.springboot.dishes.Dish;
import com.springboot.range.Ranges;
import com.springboot.restaurants.Restaurants;



@SuppressWarnings("serial")
@Entity
@Table(name = "dishresttable")
public class DishRestaurant implements Serializable{
	

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_dish_rest_table;
	
	@Column(name = "id_dish_rest_table")
	public int getId_dish_rest_table() {
		return id_dish_rest_table;
	}


	public void setId_dish_rest_table(int id_dish_rest_table) {
		this.id_dish_rest_table = id_dish_rest_table;
	}

	@ManyToOne
	@JoinColumn(name = "dish_id")
	private Dish dish;
	
	public Dish getDish() {
		return dish;
	}

	public void setDish(Dish dish) {
		this.dish = dish;
	}
	
	@ManyToOne
	@JoinColumn(name = "ids_rest")
	private Restaurants restaurant;
	

	public Restaurants getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurants restaurant) {
		this.restaurant = restaurant;
	}
	
	public DishRestaurant()
	{
		
	}
	public DishRestaurant(int id_dish_rest_table, int dishId, int restid) {
		super();
		this.id_dish_rest_table = id_dish_rest_table;
		this.dish = new Dish(dishId,"");
		this.restaurant = new Restaurants(restid,"",null,null,"","");
	}

	
	
	
}
