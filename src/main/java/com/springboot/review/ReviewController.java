package com.springboot.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {
	
	@Autowired
	public ReviewService reviewService;
	
	
	// GET ALL Request
	
	@RequestMapping("/review")
	public List<Review> getAllReviews()
	{
		return reviewService.getAllReviews();
		
	}
	
	// GET Request
	
	@RequestMapping("/review/{reviewId}")
	public Object getReview(@PathVariable int reviewId)
	{
		return reviewService.getReview(reviewId);
	}
	
	
	// POST Request
	
	@RequestMapping(method = RequestMethod.POST, value = "/review")
	public void postReview(@RequestBody Review review)
	{
		reviewService.postReview(review);
	}
	
	// PUT Request
	
	@RequestMapping(method = RequestMethod.PUT , value = "/review/{reviewId}")
	public void putReview(@PathVariable int reviewId, @RequestBody Review review)
	{
		reviewService.putReview(review);
	}
	
	
	// DELETE Request
	@RequestMapping(method = RequestMethod.DELETE , value = "/review/{reviewId}")
	public void deleteReview(@PathVariable int reviewId)
	{
		reviewService.deleteReview(reviewId);
	}
	

}
