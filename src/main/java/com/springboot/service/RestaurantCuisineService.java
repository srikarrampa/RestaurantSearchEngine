package com.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.entity.RestaurantCuisine;
import com.springboot.repository.RestaurantCuisineRepository;

@Service
public class RestaurantCuisineService {

	@Autowired
	private RestaurantCuisineRepository restaurantCuisineRepo;
	
	public List<RestaurantCuisine> getAllRestaurantCuisine() {
		
		List<RestaurantCuisine> list = new ArrayList<RestaurantCuisine>();
		restaurantCuisineRepo.findAll().forEach(list::add);
		return list;
	}

	public Object getRestaurantCuisine(int cuisineId) {

		return restaurantCuisineRepo.findById(cuisineId);
	}
	@Transactional
	public void postRestaurantCuisine(RestaurantCuisine cuisine) {
		
		restaurantCuisineRepo.save(cuisine);
		
	}
	@Transactional
	public void putRestaurantCuisine(RestaurantCuisine cuisine) {
		
		restaurantCuisineRepo.save(cuisine);
		
	}
	@Transactional
	public void deleteRestaurantCuisine(int cuisineId) {
		
		restaurantCuisineRepo.deleteById(cuisineId);
	}

}
