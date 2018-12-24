package com.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.entity.Restaurants;
import com.springboot.repository.RestaurantRepository;

@Service
public class RestaurantService {

	@Autowired
	private RestaurantRepository restaurantRepo;
	
	public List<Restaurants> getAllRestaurants() {
		
		List<Restaurants> list = new ArrayList<Restaurants>();
		restaurantRepo.findAll().forEach(list::add);
		return list;
	}

	public Object getRestaurant(int restaurantId) {

		return restaurantRepo.findById(restaurantId);
	}
	@Transactional
	public void postRestaurant(Restaurants restaurant) {
		
		restaurantRepo.save(restaurant);
		
	}
	@Transactional
	public void putRestaurant(Restaurants restaurant) {
		
		restaurantRepo.save(restaurant);
		
	}
	@Transactional
	public void deleteRestaurant(int restaurantId) {
		
		restaurantRepo.deleteById(restaurantId);
	}

}
