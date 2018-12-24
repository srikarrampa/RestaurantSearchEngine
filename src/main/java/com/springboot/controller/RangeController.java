package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Ranges;
import com.springboot.service.RangeService;

@RestController
public class RangeController {
	
	@Autowired
	public RangeService rangeService;
	
	
	// GET ALL Request
	
	
	@RequestMapping("/ranges")
	public List<Ranges> getAllRanges()
	{
		return rangeService.getAllRanges();
		
	}
	
	
	// GET Request
	
	@RequestMapping("/ranges/{rangeId}")
	public Object getRange(@PathVariable int rangeId)
	{
		return rangeService.getRange(rangeId);
	}
	
	
	// POST Request
	
	@RequestMapping(method = RequestMethod.POST, value = "/ranges")
	public void postRange(@RequestBody Ranges range)
	{
		rangeService.postRange(range);
	}
	
	// PUT Request
	
	@RequestMapping(method = RequestMethod.PUT , value = "/ranges/{rangeId}")
	public void putrange(@PathVariable int rangeId, @RequestBody Ranges range)
	{
		rangeService.putRange(range);
	}
	
	
	// DELETE Request
	@RequestMapping(method = RequestMethod.DELETE , value = "/ranges/{rangeId}")
	public void deleterange(@PathVariable int rangeId)
	{
		rangeService.deleteRange(rangeId);
	}
	

}
