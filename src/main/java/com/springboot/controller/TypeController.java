package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Type;
import com.springboot.service.TypeService;

@RestController
public class TypeController {
	
	@Autowired
	public TypeService typeService;
	
	
	// GET ALL Request
	
	
	@RequestMapping("/type")
	public List<Type> getAllTypes()
	{
		return typeService.getAllTypes();
		
	}
	
	
	// GET Request
	
	@RequestMapping("/type/{typeId}")
	public Object getType(@PathVariable int typeId)
	{
		return typeService.getType(typeId);
	}
	
	
	// POST Request
	
	@RequestMapping(method = RequestMethod.POST, value = "/type")
	public void postType(@RequestBody Type type)
	{
		typeService.postType(type);
	}
	
	// PUT Request
	
	@RequestMapping(method = RequestMethod.PUT , value = "/type/{typeId}")
	public void putType(@PathVariable int typeId, @RequestBody Type type)
	{
		typeService.putType(type);
	}
	
	
	// DELETE Request
	@RequestMapping(method = RequestMethod.DELETE , value = "/type/{typeId}")
	public void deletetype(@PathVariable int typeId)
	{
		typeService.deleteType(typeId);
	}
	

}
