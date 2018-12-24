package com.springboot.restaurants;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	public void postRestaurant(Restaurants restaurant) {
		
		restaurantRepo.save(restaurant);
		
	}

	public void putRestaurant(Restaurants restaurant) {
		
		restaurantRepo.save(restaurant);
		
	}

	public void deleteRestaurant(int restaurantId) {
		
		restaurantRepo.deleteById(restaurantId);
	}

}
