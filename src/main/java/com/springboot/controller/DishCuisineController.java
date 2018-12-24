package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Cuisine;
import com.springboot.entity.Dish;
import com.springboot.entity.DishCuisine;
import com.springboot.service.DishCuisineService;

@RestController
public class DishCuisineController {
	
	@Autowired
	public DishCuisineService cuisinedishService;
	
	// GET ALL Request
	
	
	@RequestMapping("/dish/{dishid}/cuisines/{cuisineid}/dishcuisine")
	public List<DishCuisine> getAllCuisinesdish()
	{
		return cuisinedishService.getAllDishCuisine();
		
	}
	
	
	// GET Request
	
	@RequestMapping("/dish/{dishId}/cuisines/{cuisineid}/dishcuisine/{iddishCuisineTable}")
	public Object getdishcuisine(@PathVariable int iddishCuisineTable)
	{
		return cuisinedishService.getDishCuisine(iddishCuisineTable);
	}
	
	
	// POST Request
	
	@RequestMapping(method = RequestMethod.POST, value = "/dish/{dishId}/cuisines/{cuisineId}/dishcuisine")
	public void postdishcuisine(@RequestBody DishCuisine cuisinedish, @PathVariable int dishId, @PathVariable int cuisineId)
	{
		cuisinedish.setDish(new Dish(dishId,""));
		cuisinedish.setCuisine(new Cuisine(cuisineId,"","","",null));
		cuisinedishService.postDishCuisine(cuisinedish);
	}
	
	// PUT Request
	
	@RequestMapping(method = RequestMethod.PUT , value = "/dish/{dishId}/cuisines/{cuisineId}/dishcuisine/{iddishcuisineTable}")
	public void putdishcuisines(@PathVariable int iddishcuisineTable, @RequestBody DishCuisine cuisinedish, @PathVariable int dishId, @PathVariable int cuisineId)
	{
		cuisinedish.setDish(new Dish(dishId,""));
		cuisinedish.setCuisine(new Cuisine(cuisineId,"","","",null));
		cuisinedishService.putDishCuisine(cuisinedish);
	}
	
	
	// DELETE Request
	@RequestMapping(method = RequestMethod.DELETE , value = "/dish/{dishId}/cuisines/{cuisineId}/dishcuisine/{iddishcuisineTable")
	public void deleteUsecuisine(@PathVariable int iddishCuisineTable)
	{
		cuisinedishService.deleteDishCuisine(iddishCuisineTable);
	}
	

}
