package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Restaurants;
import com.springboot.service.RestaurantService;

@RestController
public class RestaurantController {
	
	@Autowired
	public RestaurantService restaurantService;
	
	
	// GET ALL Request
	
	
	@RequestMapping("/restaurant")
	public List<Restaurants> getAllRestaurants()
	{
		return restaurantService.getAllRestaurants();
		
	}
	
	
	// GET Request
	
	@RequestMapping("/restaurant/{restaurantId}")
	public Object getRestaurant(@PathVariable int restaurantId)
	{
		return restaurantService.getRestaurant(restaurantId);
	}
	
	
	// POST Request
	
	@RequestMapping(method = RequestMethod.POST, value = "/restaurant")
	public void postRestaurant(@RequestBody Restaurants restaurant)
	{
		restaurantService.postRestaurant(restaurant);
	}
	
	// PUT Request
	
	@RequestMapping(method = RequestMethod.PUT , value = "/restaurant/{restaurantId}")
	public void putRestaurant(@PathVariable int restaurantId, @RequestBody Restaurants restaurant)
	{
		restaurantService.putRestaurant(restaurant);
	}
	
	
	// DELETE Request
	@RequestMapping(method = RequestMethod.DELETE , value = "/restaurant/{restaurantId}")
	public void deleteRestaurant(@PathVariable int restaurantId)
	{
		restaurantService.deleteRestaurant(restaurantId);
	}
	

}
