package com.springboot.restaurantuser;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.restaurants.Restaurants;
import com.springboot.usertable.User;

@RestController
public class RestaurantUserController {
	
	@Autowired
	public RestaurantUserService restaurantUserService;
	
	// GET ALL Request
	
	
	@RequestMapping("/user/{userid}/restaurants/{restaurantid}/userrestaurant")
	public List<RestaurantUser> getAllrestaurantsUser()
	{
		return restaurantUserService.getAllRestaurantUser();
		
	}
	
	
	// GET Request
	
	@RequestMapping("/user/{userId}/restaurants/{restaurantid}/userrestaurant/{idUserrestaurantTable}")
	public Object getUserrestaurant(@PathVariable int idUserrestaurantTable)
	{
		return restaurantUserService.getRestaurantUser(idUserrestaurantTable);
	}
	
	
	// POST Request
	
	@RequestMapping(method = RequestMethod.POST, value = "/user/{userId}/restaurants/{restaurantId}/userrestaurant")
	public void postUserrestaurant(@RequestBody RestaurantUser restaurantUser, @PathVariable int userId, @PathVariable int restaurantId)
	{
		restaurantUser.setUser(new User(userId,"","",null));
		restaurantUser.setRestaurant(new Restaurants(restaurantId,"",null,null,"",""));
		restaurantUserService.postRestaurantUser(restaurantUser);
	}
	
	// PUT Request
	
	@RequestMapping(method = RequestMethod.PUT , value = "/user/{userId}/restaurants/{restaurantId}/userrestaurant/{idUserrestaurantTable}")
	public void putUserrestaurants(@PathVariable int idUserrestaurantTable, @RequestBody RestaurantUser restaurantUser, @PathVariable int userId, @PathVariable int restaurantId)
	{
		restaurantUser.setUser(new User(userId,"","",null));
		restaurantUser.setRestaurant(new Restaurants(restaurantId,"",null,null,"",""));
		restaurantUserService.putRestaurantUser(restaurantUser);
	}
	
	
	// DELETE Request
	@RequestMapping(method = RequestMethod.DELETE , value = "/user/{userId}/restaurants/{restaurantId}/userrestaurant/{idUserrestaurantTable")
	public void deleteUserestaurant(@PathVariable int idUserrestaurantTable)
	{
		restaurantUserService.deleteRestaurantUser(idUserrestaurantTable);
	}
	

}
