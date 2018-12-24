package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Restaurants;
import com.springboot.entity.Review;
import com.springboot.entity.ReviewUser;
import com.springboot.entity.User;
import com.springboot.service.ReviewUserService;

@RestController
public class ReviewUserController {
	
	@Autowired
	public ReviewUserService reviewUserService;
	
	// GET ALL Request
	
	
	@RequestMapping("/user/{userid}/review/{reviewid}/restaurants/{restaurantid}/reviewUser")
	public List<ReviewUser> getAllreviewsUser()
	{
		return reviewUserService.getAllReviewUser();
		
	}
	
	
	// GET Request
	
	@RequestMapping("/user/{userid}/review/{reviewid}/restaurants/{restaurantid}/reviewUser/{reviewUserId}")
	public Object getUserreview(@PathVariable int reviewUserId)
	{
		return reviewUserService.getReviewUser(reviewUserId);
	}
	
	
	// POST Request
	
	@RequestMapping(method = RequestMethod.POST, value = "/user/{userId}/review/{reviewId}/restaurants/{restaurantId}/reviewUser")
	public void postUserreview(@RequestBody ReviewUser reviewUser, @PathVariable int userId, @PathVariable int reviewId,@PathVariable int restaurantId )
	{
		reviewUser.setUser(new User(userId,"","",null));
		reviewUser.setReview(new Review(reviewId,""));
		reviewUser.setRestaurant(new Restaurants(restaurantId,"",null,null,"",""));
		reviewUserService.postReviewUser(reviewUser);
	}
	
	// PUT Request
	
	@RequestMapping(method = RequestMethod.PUT , value = "/user/{userId}/review/{reviewId}/restaurants/{restaurantId}/reviewUser/{idReviewUser}")
	public void putUserReviews(@PathVariable int idReviewUser, @RequestBody ReviewUser reviewUser, @PathVariable int userId, @PathVariable int reviewId,@PathVariable int restaurantId)
	{
		reviewUser.setUser(new User(userId,"","",null));
		reviewUser.setReview(new Review(reviewId,""));
		reviewUser.setRestaurant(new Restaurants(restaurantId,"",null,null,"",""));
		reviewUserService.putReviewUser(reviewUser);
	}
	
	
	// DELETE Request
	@RequestMapping(method = RequestMethod.DELETE , value = "/user/{userId}/reviews/{reviewId}/userreview/{idUserreviewTable")
	public void deleteUserReview(@PathVariable int idUserReviewTable)
	{
		reviewUserService.deleteReviewUser(idUserReviewTable);
	}
	

}
