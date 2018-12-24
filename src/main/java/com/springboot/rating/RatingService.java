package com.springboot.rating;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingService {

	@Autowired
	private RatingRepository ratingRepo;
	
	public List<Rating> getAllRatings() {
		
		List<Rating> list = new ArrayList<Rating>();
		ratingRepo.findAll().forEach(list::add);
		return list;
	}

	public Object getRating(int ratingId) {

		return ratingRepo.findById(ratingId);
	}

	public void postRating(Rating rating) {
		
		ratingRepo.save(rating);
		
	}

	public void putRating(Rating rating) {
		
		ratingRepo.save(rating);
		
	}

	public void deleteRating(int ratingId) {
		
		ratingRepo.deleteById(ratingId);
	}

}
