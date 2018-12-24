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
@Table(name = "dishcuisinetable")
public class DishCuisine implements Serializable{
	

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_dish_cuisine_table;
	
	@Column(name = "id_dish_cuisine_table")
	public int getId_dish_cuisine_table() {
		return id_dish_cuisine_table;
	}

	public void setId_dish_cuisine_table(int id_dish_cuisine_table) {
		this.id_dish_cuisine_table = id_dish_cuisine_table;
	}
	
	
	public DishCuisine()
	{
		
	}
	public DishCuisine(int id_dish_cuisine_table, int dishId, int cuisineId) {
		super();
		this.id_dish_cuisine_table = id_dish_cuisine_table;
		this.dish = new Dish(dishId,"");
		this.cuisine = new Cuisine(cuisineId,"","","",null);
	}
	
	@ManyToOne
	@JoinColumn(name = "ids_dish")
	private Dish dish;
	
	public Dish getDish() {
		return dish;
	}

	public void setDish(Dish dish) {
		this.dish = dish;
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
	
	

	
	
	
}
