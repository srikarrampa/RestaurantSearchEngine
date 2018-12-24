package com.springboot.dishes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	public void postDish(Dish dish) {
		
		dishRepo.save(dish);
		
	}

	public void putDish(Dish dish) {
		
		dishRepo.save(dish);
		
	}

	public void deleteDish(int dishId) {
		
		dishRepo.deleteById(dishId);
	}

}
