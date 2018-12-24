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
public class Dish {
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_dish")
	private int idDish;
	@Column(name = "dish_name")
	private String dishName;
	
	
	public int getIdDish() {
		return idDish;
	}


	public void setIdDish(int idDish) {
		this.idDish = idDish;
	}


	public String getDishName() {
		return dishName;
	}


	public void setDishName(String dishName) {
		this.dishName = dishName;
	}


	public Dish()
	{
		
	}


	public Dish(int idDish, String dishName) {
		super();
		this.idDish = idDish;
		this.dishName = dishName;
	}
	
	
	


	
	

	
	
	
	
	
}
