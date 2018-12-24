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
public class Rating {
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_ratings")
	private int id_ratings;
	@Column(name="ratings_desc")
	private String ratings_desc;
	@Column(name="ratings_created_by")
	private String ratings_created_by;
	@Column(name="ratings_created_date")
	private Date ratings_created_date;
	
	public Rating()
	{
		
	}

	public Rating(int id_ratings, String ratings_desc, String ratings_created_by, Date ratings_created_date) {
		super();
		this.id_ratings = id_ratings;
		this.ratings_desc = ratings_desc;
		this.ratings_created_by = ratings_created_by;
		this.ratings_created_date = ratings_created_date;
	}

	public int getId_ratings() {
		return id_ratings;
	}

	public void setId_ratings(int id_ratings) {
		this.id_ratings = id_ratings;
	}

	public String getRatings_desc() {
		return ratings_desc;
	}

	public void setRatings_desc(String ratings_desc) {
		this.ratings_desc = ratings_desc;
	}

	public String getRatings_created_by() {
		return ratings_created_by;
	}

	public void setRatings_created_by(String ratings_created_by) {
		this.ratings_created_by = ratings_created_by;
	}

	public Date getRatings_created_date() {
		return ratings_created_date;
	}

	public void setRatings_created_date(Date ratings_created_date) {
		this.ratings_created_date = ratings_created_date;
	}

	
	
}
