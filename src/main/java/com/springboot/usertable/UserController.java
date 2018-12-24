package com.springboot.usertable;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	public UserService userService;
	
	
	// GET ALL Request
	
	
	@RequestMapping("/user")
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
		
	}
	
	
	// GET Request
	
	@RequestMapping("/user/{userId}")
	public Object getUser(@PathVariable int userId)
	{
		return userService.getUser(userId);
	}
	
	
	// POST Request
	
	@RequestMapping(method = RequestMethod.POST, value = "/user")
	public void postUser(@RequestBody User user)
	{
		userService.postUser(user);
	}
	
	// PUT Request
	
	@RequestMapping(method = RequestMethod.PUT , value = "/user/{userId}")
	public void putUser(@PathVariable int userId, @RequestBody User user)
	{
		userService.putUser(user);
	}
	
	
	// DELETE Request
	@RequestMapping(method = RequestMethod.DELETE , value = "/user/{userId}")
	public void deleteUser(@PathVariable int userId)
	{
		userService.deleteUser(userId);
	}
	

}
