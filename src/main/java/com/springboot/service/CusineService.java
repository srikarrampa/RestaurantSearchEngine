package com.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.entity.Cuisine;
import com.springboot.repository.CusineRepository;

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

	@Transactional
	public void postcuisine(Cuisine cuisine) {
		
		cuisineRepo.save(cuisine);
		
	}
	@Transactional
	public void putcuisine(Cuisine cuisine) {
		
		cuisineRepo.save(cuisine);
		
	}
	@Transactional
	public void deletecuisine(int cuisineId) {
		
		cuisineRepo.deleteById(cuisineId);
	}

}
