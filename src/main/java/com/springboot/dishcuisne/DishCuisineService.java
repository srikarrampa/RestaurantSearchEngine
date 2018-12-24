package com.springboot.dishcuisne;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DishCuisineService {

	@Autowired
	private DishCuisineRepository dishCusineRepo;
	
	public List<DishCuisine> getAllDishCuisine() {
		
		List<DishCuisine> list = new ArrayList<DishCuisine>();
		dishCusineRepo.findAll().forEach(list::add);
		return list;
	}

	public Object getDishCuisine(int Id) {

		return dishCusineRepo.findById(Id);
	}

	public void postDishCuisine(DishCuisine dishcuisine) {
		
		dishCusineRepo.save(dishcuisine);
		
	}

	public void putDishCuisine(DishCuisine dishciuisine) {
		
		dishCusineRepo.save(dishciuisine);
		
	}

	public void deleteDishCuisine(int Id) {
		
		dishCusineRepo.deleteById(Id);
	}

}
