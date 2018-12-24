package com.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.controller.RestaurantUser;
import com.springboot.repository.RestaurantUserRepository;

@Service
public class RestaurantUserService {

	@Autowired
	private RestaurantUserRepository restaurantUserRepo;
	
	public List<RestaurantUser> getAllRestaurantUser() {
		
		List<RestaurantUser> list = new ArrayList<RestaurantUser>();
		restaurantUserRepo.findAll().forEach(list::add);
		return list;
	}

	public Object getRestaurantUser(int userId) {

		return restaurantUserRepo.findById(userId);
	}
	@Transactional
	public void postRestaurantUser(RestaurantUser user) {
		
		restaurantUserRepo.save(user);
		
	}
	@Transactional
	public void putRestaurantUser(RestaurantUser user) {
		
		restaurantUserRepo.save(user);
		
	}
	@Transactional
	public void deleteRestaurantUser(int userId) {
		
		restaurantUserRepo.deleteById(userId);
	}

}
