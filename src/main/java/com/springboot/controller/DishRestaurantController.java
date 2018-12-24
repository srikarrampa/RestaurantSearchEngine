package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Dish;
import com.springboot.entity.DishRestaurant;
import com.springboot.entity.Restaurants;
import com.springboot.service.DishRestaurantService;


@RestController
public class DishRestaurantController {
	
	@Autowired
	public DishRestaurantService dishRestaurantService;
	
	// GET ALL Request
	
	
	@RequestMapping("/dish/{dishid}/restaurants/{restaurantid}/dishrestaurant")
	public List<DishRestaurant> getAlldishRestaurant()
	{
		return dishRestaurantService.getAllDishRestaurant();
		
	}
	
	
	// GET Request
	
	@RequestMapping("/dish/{dishId}/restaurants/{restaurantid}/dishsrestaurant/{iddishRestaurantTable}")
	public Object getdishsRestaurant(@PathVariable int iddishRestaurantTable)
	{
		return dishRestaurantService.getDishRestaurant(iddishRestaurantTable);
	}
	
	
	// POST Request
	
	@RequestMapping(method = RequestMethod.POST, value = "/dish/{dishId}/restaurants/{restaurantId}/dishrestaurant")
	public void postdishsRestaurant(@RequestBody DishRestaurant dishRestaurant, @PathVariable int dishsId, @PathVariable int restaurantId)
	{
		dishRestaurant.setDish(new Dish(dishsId,""));
		dishRestaurant.setRestaurant(new Restaurants(restaurantId,"",null,null,"",""));
		dishRestaurantService.postDishRestaurant(dishRestaurant);
	}
	
	// PUT Request
	
	@RequestMapping(method = RequestMethod.PUT , value = "/dish/{dishId}/restaurants/{restaurantId}/dishrestaurant/{iddishrestaurantTable}")
	public void putdishsrestaurants(@PathVariable int iddishsrestaurantTable, @RequestBody DishRestaurant dishsRestaurant, @PathVariable int dishsId, @PathVariable int restaurantId)
	{
		dishsRestaurant.setDish(new Dish(dishsId,""));
		dishsRestaurant.setRestaurant(new Restaurants(restaurantId,"",null,null,"",""));
		dishRestaurantService.putDishRestaurant(dishsRestaurant);
	}
	
	
	// DELETE Request
	@RequestMapping(method = RequestMethod.DELETE , value = "/dish/{dishId}/restaurants/{restaurantId}/dishrestaurant/{iddishrestaurantTable")
	public void deletedishsestaurant(@PathVariable int iddishsrestaurantTable)
	{
		dishRestaurantService.deletedDishRestaurant(iddishsrestaurantTable);
	}
	

}
