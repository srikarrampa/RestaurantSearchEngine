package com.springboot.usertypetable;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.type.Type;
import com.springboot.usertable.User;

@RestController
public class UserTypeController {
	
	@Autowired
	public UserTypeService userService;
	
	
	// GET ALL Request
	
	
	@RequestMapping("/user/{userid}/type/{typeid}/usertype")
	public List<UserType> getAllUserTypes()
	{
		return userService.getAllUserTypes();
		
	}
	
	
	// GET Request
	
	@RequestMapping("/user/{userId}/type/{typeid}/usertype/{idUserTypeTable}")
	public Object getUserType(@PathVariable int idUserTypeTable)
	{
		return userService.getUserType(idUserTypeTable);
	}
	
	
	// POST Request
	
	@RequestMapping(method = RequestMethod.POST, value = "/user/{userId}/type/{typeId}/usertype")
	public void postUserType(@RequestBody UserType usertype, @PathVariable int userId, @PathVariable int typeId)
	{
		usertype.setUser(new User(userId,"","",null));
		usertype.setType(new Type(typeId,"","",null));
		userService.postUser(usertype);
	}
	
	// PUT Request
	
	@RequestMapping(method = RequestMethod.PUT , value = "/user/{userId}/type/{typeId}/usertype/{idUserTypeTable}")
	public void putUserTypes(@PathVariable int idUserTypeTable, @RequestBody UserType usertype, @PathVariable int userId, @PathVariable int typeId)
	{
		usertype.setUser(new User(userId,"","",null));
		usertype.setType(new Type(typeId,"","",null));
		userService.putUserType(usertype);
	}
	
	
	// DELETE Request
	@RequestMapping(method = RequestMethod.DELETE , value = "/user/{userId}/type/{typeId}/usertype/{idUserTypeTable")
	public void deleteUseType(@PathVariable int idUserTypeTable)
	{
		userService.deleteUserType(idUserTypeTable);
	}
	

}
