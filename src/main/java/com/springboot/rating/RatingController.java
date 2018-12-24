package com.springboot.rating;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingController {
	
	@Autowired
	public RatingService ratingService;
	
	
	// GET ALL Request
	
	
	@RequestMapping("/rating")
	public List<Rating> getAllRatings()
	{
		return ratingService.getAllRatings();
		
	}
	
	
	// GET Request
	
	@RequestMapping("/rating/{ratingId}")
	public Object getRating(@PathVariable int ratingId)
	{
		return ratingService.getRating(ratingId);
	}
	
	
	// POST Request
	
	@RequestMapping(method = RequestMethod.POST, value = "/rating")
	public void postRating(@RequestBody Rating rating)
	{
		ratingService.postRating(rating);
	}
	
	// PUT Request
	
	@RequestMapping(method = RequestMethod.PUT , value = "/rating/{ratingId}")
	public void putRating(@PathVariable int ratingId, @RequestBody Rating rating)
	{
		ratingService.putRating(rating);
	}
	
	
	// DELETE Request
	@RequestMapping(method = RequestMethod.DELETE , value = "/rating/{ratingId}")
	public void deleteRating(@PathVariable int ratingId)
	{
		ratingService.deleteRating(ratingId);
	}
	

}
