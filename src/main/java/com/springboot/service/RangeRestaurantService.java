package com.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.entity.RangeRestaurant;
import com.springboot.repository.RangeRestaurantRepository;

@Service
public class RangeRestaurantService {

	@Autowired
	private RangeRestaurantRepository rangeRestaurant;
	
	public List<RangeRestaurant> getAllRangeRestaurant() {
		
		List<RangeRestaurant> list = new ArrayList<RangeRestaurant>();
		rangeRestaurant.findAll().forEach(list::add);
		return list;
	}

	public Object getRangeRestaurant(int cuisineId) {

		return rangeRestaurant.findById(cuisineId);
	}
	@Transactional
	public void postRangeRestaurant(RangeRestaurant range) {
		
		rangeRestaurant.save(range);
		
	}
	@Transactional
	public void putRangeRestaurant(RangeRestaurant range) {
		
		rangeRestaurant.save(range);
		
	}
	@Transactional
	public void deleteRangeRestaurant(int rangeRestaurantId) {
		
		rangeRestaurant.deleteById(rangeRestaurantId);
	}

}
