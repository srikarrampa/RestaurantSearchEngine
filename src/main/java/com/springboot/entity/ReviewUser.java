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
@Table(name = "reviewsusertable")
public class ReviewUser implements Serializable{
	

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_reviews_user;
	
	@Column(name = "id_reviews_user")
	public int getId_reviews_user() {
		return id_reviews_user;
	}


	public void setId_reviews_user(int id_reviews_user) {
		this.id_reviews_user = id_reviews_user;
	}
	
	@ManyToOne
	@JoinColumn(name = "id_user")
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@ManyToOne
	@JoinColumn(name = "review_id")
	private Review review;
	

	public Review getReview() {
		return review;
	}


	public void setReview(Review review) {
		this.review = review;
	}

	@ManyToOne
	@JoinColumn(name = "r_id")
	private Restaurants restaurant;
	

	public Restaurants getRestaurant() {
		return restaurant;
	}


	public void setRestaurant(Restaurants restaurant) {
		this.restaurant = restaurant;
	}

	public ReviewUser()
	{
		
	}
	
	public ReviewUser(int id_reviews_user, User user, Review review, Restaurants restaurant) {
		super();
		this.id_reviews_user = id_reviews_user;
		this.user = user;
		this.review = review;
		this.restaurant = restaurant;
	}
	
	
	
}
