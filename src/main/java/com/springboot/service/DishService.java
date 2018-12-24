package com.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.entity.Dish;
import com.springboot.repository.DishRepository;

@Service
public class DishService {

	@Autowired
	private DishRepository dishRepo;
	
	public List<Dish> getAllDishes() {
		
		List<Dish> list = new ArrayList<Dish>();
		dishRepo.findAll().forEach(list::add);
		return list;
	}

	public Object getDishes(int dishId) {

		return dishRepo.findById(dishId);
	}
	@Transactional
	public void postDish(Dish dish) {
		
		dishRepo.save(dish);
		
	}
	@Transactional
	public void putDish(Dish dish) {
		
		dishRepo.save(dish);
		
	}
	@Transactional
	public void deleteDish(int dishId) {
		
		dishRepo.deleteById(dishId);
	}

}
