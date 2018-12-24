package com.springboot.range;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RangeService {

	@Autowired
	private RangeRepository rangeRepo;
	
	public List<Ranges> getAllRanges() {
		
		List<Ranges> list = new ArrayList<Ranges>();
		rangeRepo.findAll().forEach(list::add);
		return list;
	}

	public Object getRange(int rangeId) {

		return rangeRepo.findById(rangeId);
	}

	public void postRange(Ranges range) {
		
		rangeRepo.save(range);
		
	}

	public void putRange(Ranges range) {
		
		rangeRepo.save(range);
		
	}

	public void deleteRange(int rangeId) {
		
		rangeRepo.deleteById(rangeId);
	}

}
