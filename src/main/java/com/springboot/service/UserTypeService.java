package com.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.entity.UserType;
import com.springboot.repository.UserTypeRepository;

@Service
public class UserTypeService {

	@Autowired
	private UserTypeRepository userRepo;
	
	public List<UserType> getAllUserTypes() {
		
		List<UserType> list = new ArrayList<UserType>();
		userRepo.findAll().forEach(list::add);
		return list;
	}

	public Object getUserType(int userId) {

		return userRepo.findById(userId);
	}
	@Transactional
	public void postUser(UserType user) {
		
		userRepo.save(user);
		
	}
	@Transactional
	public void putUserType(UserType user) {
		
		userRepo.save(user);
		
	}
	@Transactional
	public void deleteUserType(int userId) {
		
		userRepo.deleteById(userId);
	}

}
