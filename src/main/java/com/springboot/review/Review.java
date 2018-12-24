package com.springboot.review;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Review {
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_reviews;
	private String reviews_desc;
	
	public Review()
	{
		
	}
	
	public Review(int id_reviews, String reviews_desc) {
		super();
		this.id_reviews = id_reviews;
		this.setReviews_desc(reviews_desc);
	}

	public int getId_reviews() {
		return id_reviews;
	}

	public void setId_reviews(int id_reviews) {
		this.id_reviews = id_reviews;
	}

	public String getReviews_desc() {
		return reviews_desc;
	}

	public void setReviews_desc(String reviews_desc) {
		this.reviews_desc = reviews_desc;
	}

}
