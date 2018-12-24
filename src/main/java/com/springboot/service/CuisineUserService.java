package com.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.entity.CuisineUser;
import com.springboot.repository.CuisineUserRepository;

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
	@Transactional
	public void postCuisineUser(CuisineUser user) {
		
		cuisineUserRepo.save(user);
		
	}
	@Transactional
	public void putCuisineUser(CuisineUser user) {
		
		cuisineUserRepo.save(user);
		
	}
	@Transactional
	public void deleteCuisineUser(int userId) {
		
		cuisineUserRepo.deleteById(userId);
	}

}
