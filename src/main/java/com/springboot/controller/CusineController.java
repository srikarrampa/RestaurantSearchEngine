package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Cuisine;
import com.springboot.service.CusineService;

@RestController
public class CusineController {
	
	@Autowired
	public CusineService cuisinesService;
	
	
	// GET ALL Request
	
	
	@RequestMapping("/cuisines")
	public List<Cuisine> getAllcuisiness()
	{
		return cuisinesService.getAllcuisines();
		
	}
	
	
	// GET Request
	
	@RequestMapping("/cuisines/{cuisinesId}")
	public Object getcuisines(@PathVariable int cuisinesId)
	{
		return cuisinesService.getcuisine(cuisinesId);
	}
	
	
	// POST Request
	
	@RequestMapping(method = RequestMethod.POST, value = "/cuisines")
	public void postcuisines(@RequestBody Cuisine cuisines)
	{
		cuisinesService.postcuisine(cuisines);
	}
	
	// PUT Request
	
	@RequestMapping(method = RequestMethod.PUT , value = "/cuisines/{cuisinesId}")
	public void putcuisines(@PathVariable int cuisinesId, @RequestBody Cuisine cuisines)
	{
		cuisinesService.putcuisine(cuisines);
	}
	
	
	// DELETE Request
	@RequestMapping(method = RequestMethod.DELETE , value = "/cuisines/{cuisinesId}")
	public void deletecuisines(@PathVariable int cuisinesId)
	{
		cuisinesService.deletecuisine(cuisinesId);
	}
	

}
