package com.springboot.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Review {
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_reviews")
	private int idReviews;
	@Column(name="reviews_desc")
	private String reviewsDesc;
	
	public Review()
	{
		
	}

	public Review(int idReviews, String reviewsDesc) {
		super();
		this.idReviews = idReviews;
		this.reviewsDesc = reviewsDesc;
	}

	public int getIdReviews() {
		return idReviews;
	}

	public void setIdReviews(int idReviews) {
		this.idReviews = idReviews;
	}

	public String getReviewsDesc() {
		return reviewsDesc;
	}

	public void setReviewsDesc(String reviewsDesc) {
		this.reviewsDesc = reviewsDesc;
	}
	
	
}
