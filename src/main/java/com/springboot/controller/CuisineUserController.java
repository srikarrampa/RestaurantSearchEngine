package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Cuisine;
import com.springboot.entity.CuisineUser;
import com.springboot.entity.User;
import com.springboot.service.CuisineUserService;

@RestController
public class CuisineUserController {
	
	@Autowired
	public CuisineUserService cuisineUserService;
	
	// GET ALL Request
	
	
	@RequestMapping("/user/{userid}/cuisines/{cuisineid}/usercuisine")
	public List<CuisineUser> getAllCuisinesUser()
	{
		return cuisineUserService.getAllCuisineUser();
		
	}
	
	
	// GET Request
	
	@RequestMapping("/user/{userId}/cuisines/{cuisineid}/usercuisine/{idUserCuisineTable}")
	public Object getUsercuisine(@PathVariable int idUserCuisineTable)
	{
		return cuisineUserService.getCuisineUser(idUserCuisineTable);
	}
	
	
	// POST Request
	
	@RequestMapping(method = RequestMethod.POST, value = "/user/{userId}/cuisines/{cuisineId}/usercuisine")
	public void postUsercuisine(@RequestBody CuisineUser cuisineUser, @PathVariable int userId, @PathVariable int cuisineId)
	{
		cuisineUser.setUser(new User(userId,"","",null));
		cuisineUser.setCuisine(new Cuisine(cuisineId,"","","",null));
		cuisineUserService.postCuisineUser(cuisineUser);
	}
	
	// PUT Request
	
	@RequestMapping(method = RequestMethod.PUT , value = "/user/{userId}/cuisines/{cuisineId}/usercuisine/{idUsercuisineTable}")
	public void putUsercuisines(@PathVariable int idUsercuisineTable, @RequestBody CuisineUser cuisineUser, @PathVariable int userId, @PathVariable int cuisineId)
	{
		cuisineUser.setUser(new User(userId,"","",null));
		cuisineUser.setCuisine(new Cuisine(cuisineId,"","","",null));
		cuisineUserService.putCuisineUser(cuisineUser);
	}
	
	
	// DELETE Request
	@RequestMapping(method = RequestMethod.DELETE , value = "/user/{userId}/cuisines/{cuisineId}/usercuisine/{idUsercuisineTable")
	public void deleteUsecuisine(@PathVariable int idUserCuisineTable)
	{
		cuisineUserService.deleteCuisineUser(idUserCuisineTable);
	}
	

}
