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
@Table(name = "rangeresttable")
public class RangeRestaurant implements Serializable{
	

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_range_rest_table;
	
	@Column(name = "id_range_rest_table")
	public int getId_range_rest_table() {
		return id_range_rest_table;
	}


	public void setId_range_rest_table(int id_range_rest_table) {
		this.id_range_rest_table = id_range_rest_table;
	}

	@ManyToOne
	@JoinColumn(name = "range_id")
	private Ranges range;
	
	public Ranges getRange() {
		return range;
	}

	public void setRange(Ranges range) {
		this.range = range;
	}
	
	@ManyToOne
	@JoinColumn(name = "id_rest")
	private Restaurants restaurant;
	

	public Restaurants getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurants restaurant) {
		this.restaurant = restaurant;
	}
	
	public RangeRestaurant()
	{
		
	}
	public RangeRestaurant(int id_range_rest_table, int rangeId, int restid) {
		super();
		this.id_range_rest_table = id_range_rest_table;
		this.range = new Ranges(rangeId,"","",null,"");
		this.restaurant = new Restaurants(restid,"",null,null,"","");
	}

	
	
	
}
