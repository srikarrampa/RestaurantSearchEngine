package com.springboot.dishes;

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
public class Dish {
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_dish;
	private String dish_name;
	
	
	public Dish()
	{
		
	}
	
	
	public Dish(int id_dish, String dish_name) {
		super();
		this.id_dish = id_dish;
		this.dish_name = dish_name;
	}


	public int getId_dish() {
		return id_dish;
	}

	public void setId_dish(int id_dish) {
		this.id_dish = id_dish;
	}

	public String getName() {
		return dish_name;
	}

	public void setName(String dish_name) {
		this.dish_name = dish_name;
	}

	
	

	
	
	
	
	
}
