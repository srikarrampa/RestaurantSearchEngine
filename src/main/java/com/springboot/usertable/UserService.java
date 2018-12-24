package com.springboot.usertable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public List<User> getAllUsers() {
		
		List<User> list = new ArrayList<User>();
		userRepo.findAll().forEach(list::add);
		return list;
	}

	public Object getUser(int userId) {

		return userRepo.findById(userId);
	}

	public void postUser(User user) {
		
		userRepo.save(user);
		
	}

	public void putUser(User user) {
		
		userRepo.save(user);
		
	}

	public void deleteUser(int userId) {
		
		userRepo.deleteById(userId);
	}

}
