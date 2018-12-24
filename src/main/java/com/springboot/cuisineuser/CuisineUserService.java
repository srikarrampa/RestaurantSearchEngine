package com.springboot.cuisineuser;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CuisineUserService {

	@Autowired
	private CuisineUserRepository cuisineUserRepo;
	
	public List<CuisineUser> getAllCuisineUser() {
		
		List<CuisineUser> list = new ArrayList<CuisineUser>();
		cuisineUserRepo.findAll().forEach(list::add);
		return list;
	}

	public Object getCuisineUser(int userId) {

		return cuisineUserRepo.findById(userId);
	}

	public void postCuisineUser(CuisineUser user) {
		
		cuisineUserRepo.save(user);
		
	}

	public void putCuisineUser(CuisineUser user) {
		
		cuisineUserRepo.save(user);
		
	}

	public void deleteCuisineUser(int userId) {
		
		cuisineUserRepo.deleteById(userId);
	}

}
