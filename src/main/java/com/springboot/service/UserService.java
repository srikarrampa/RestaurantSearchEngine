package com.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.entity.User;
import com.springboot.repository.UserRepository;

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
	@Transactional
	public void postUser(User user) {
		
		userRepo.save(user);
		
	}
	@Transactional
	public void putUser(User user) {
		
		userRepo.save(user);
		
	}
	@Transactional
	public void deleteUser(int userId) {
		
		userRepo.deleteById(userId);
	}

}
