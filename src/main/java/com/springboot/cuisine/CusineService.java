package com.springboot.cuisine;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CusineService {

	@Autowired
	private CusineRepository cuisineRepo;
	
	public List<Cuisine> getAllcuisines() {
		
		List<Cuisine> list = new ArrayList<Cuisine>();
		cuisineRepo.findAll().forEach(list::add);
		return list;
	}

	public Object getcuisine(int cuisineId) {

		return cuisineRepo.findById(cuisineId);
	}

	public void postcuisine(Cuisine cuisine) {
		
		cuisineRepo.save(cuisine);
		
	}

	public void putcuisine(Cuisine cuisine) {
		
		cuisineRepo.save(cuisine);
		
	}

	public void deletecuisine(int cuisineId) {
		
		cuisineRepo.deleteById(cuisineId);
	}

}
