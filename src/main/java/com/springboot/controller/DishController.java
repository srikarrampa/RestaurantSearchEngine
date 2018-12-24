package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Dish;
import com.springboot.service.DishService;

@RestController
public class DishController {
	
	@Autowired
	public DishService dishService;
	
	
	// GET ALL Request
	
	
	@RequestMapping("/dish")
	public List<Dish> getAllDishes()
	{
		return dishService.getAllDishes();
		
	}
	
	
	// GET Request
	
	@RequestMapping("/dish/{dishId}")
	public Object getDish(@PathVariable int dishId)
	{
		return dishService.getDishes(dishId);
	}
	
	
	// POST Request
	
	@RequestMapping(method = RequestMethod.POST, value = "/dish")
	public void postDish(@RequestBody Dish dish)
	{
		dishService.postDish(dish);
	}
	
	// PUT Request
	
	@RequestMapping(method = RequestMethod.PUT , value = "/dish/{dishId}")
	public void putdish(@PathVariable int dishId, @RequestBody Dish dish)
	{
		dishService.putDish(dish);
	}
	
	
	// DELETE Request
	@RequestMapping(method = RequestMethod.DELETE , value = "/dish/{dishId}")
	public void deletedish(@PathVariable int dishId)
	{
		dishService.deleteDish(dishId);
	}
	

}
