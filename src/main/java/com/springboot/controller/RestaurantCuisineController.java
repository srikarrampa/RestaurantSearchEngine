package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Cuisine;
import com.springboot.entity.RestaurantCuisine;
import com.springboot.entity.Restaurants;
import com.springboot.service.RestaurantCuisineService;


@RestController
public class RestaurantCuisineController {
	
	@Autowired
	public RestaurantCuisineService restaurantcuisineService;
	
	// GET ALL Request
	
	
	@RequestMapping("/cuisine/{cuisineid}/restaurants/{restaurantid}/cuisinerestaurant")
	public List<RestaurantCuisine> getAllrestaurantscuisine()
	{
		return restaurantcuisineService.getAllRestaurantCuisine();
		
	}
	
	
	// GET Request
	
	@RequestMapping("/cuisine/{cuisineId}/restaurants/{restaurantid}/cuisinerestaurant/{idcuisinerestaurantTable}")
	public Object getcuisinerestaurant(@PathVariable int idcuisinerestaurantTable)
	{
		return restaurantcuisineService.getRestaurantCuisine(idcuisinerestaurantTable);
	}
	
	
	// POST Request
	
	@RequestMapping(method = RequestMethod.POST, value = "/cuisine/{cuisineId}/restaurants/{restaurantId}/cuisinerestaurant")
	public void postcuisinerestaurant(@RequestBody RestaurantCuisine restaurantcuisine, @PathVariable int cuisineId, @PathVariable int restaurantId)
	{
		restaurantcuisine.setCuisine(new Cuisine(cuisineId,"","","",null));
		restaurantcuisine.setRestaurant(new Restaurants(restaurantId,"",null,null,"",""));
		restaurantcuisineService.postRestaurantCuisine(restaurantcuisine);
	}
	
	// PUT Request
	
	@RequestMapping(method = RequestMethod.PUT , value = "/cuisine/{cuisineId}/restaurants/{restaurantId}/cuisinerestaurant/{idcuisinerestaurantTable}")
	public void putcuisinerestaurants(@PathVariable int idcuisinerestaurantTable, @RequestBody RestaurantCuisine restaurantcuisine, @PathVariable int cuisineId, @PathVariable int restaurantId)
	{
		restaurantcuisine.setCuisine(new Cuisine(cuisineId,"","","",null));
		restaurantcuisine.setRestaurant(new Restaurants(restaurantId,"",null,null,"",""));
		restaurantcuisineService.putRestaurantCuisine(restaurantcuisine);
	}
	
	
	// DELETE Request
	@RequestMapping(method = RequestMethod.DELETE , value = "/cuisine/{cuisineId}/restaurants/{restaurantId}/cuisinerestaurant/{idcuisinerestaurantTable")
	public void deletecuisineestaurant(@PathVariable int idcuisinerestaurantTable)
	{
		restaurantcuisineService.deleteRestaurantCuisine(idcuisinerestaurantTable);
	}
	

}
