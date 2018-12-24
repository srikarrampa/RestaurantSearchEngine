package com.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.entity.DishRestaurant;
import com.springboot.repository.DishRestaurantRepository;

@Service
public class DishRestaurantService {

	@Autowired
	private DishRestaurantRepository dishRestaurant;
	
	public List<DishRestaurant> getAllDishRestaurant() {
		
		List<DishRestaurant> list = new ArrayList<DishRestaurant>();
		dishRestaurant.findAll().forEach(list::add);
		return list;
	}

	public Object getDishRestaurant(int dishId) {

		return dishRestaurant.findById(dishId);
	}
	@Transactional
	public void postDishRestaurant(DishRestaurant dish) {
		
		dishRestaurant.save(dish);
		
	}
	@Transactional
	public void putDishRestaurant(DishRestaurant dish) {
		
		dishRestaurant.save(dish);
		
	}
	@Transactional
	public void deletedDishRestaurant(int dishRestaurantId) {
		
		dishRestaurant.deleteById(dishRestaurantId);
	}

}
