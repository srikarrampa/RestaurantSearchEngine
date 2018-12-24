package com.springboot.rangerestaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	public void postRangeRestaurant(RangeRestaurant range) {
		
		rangeRestaurant.save(range);
		
	}

	public void putRangeRestaurant(RangeRestaurant range) {
		
		rangeRestaurant.save(range);
		
	}

	public void deleteRangeRestaurant(int rangeRestaurantId) {
		
		rangeRestaurant.deleteById(rangeRestaurantId);
	}

}
