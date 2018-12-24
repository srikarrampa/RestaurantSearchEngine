package com.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.entity.Review;
import com.springboot.repository.ReviewRepository;

@Service
public class ReviewService {

	@Autowired
	private ReviewRepository reviewsRepo;
	
	public List<Review> getAllReviews() {
		
		List<Review> list = new ArrayList<Review>();
		reviewsRepo.findAll().forEach(list::add);
		return list;
	}

	public Object getReview(int ReviewsId) {

		return reviewsRepo.findById(ReviewsId);
	}
	@Transactional
	public void postReview(Review Reviews) {
		
		reviewsRepo.save(Reviews);
		
	}
	@Transactional
	public void putReview(Review Reviews) {
		
		reviewsRepo.save(Reviews);
		
	}
	@Transactional
	public void deleteReview(int ReviewsId) {
		
		reviewsRepo.deleteById(ReviewsId);
	}

}
