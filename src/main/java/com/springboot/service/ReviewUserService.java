package com.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.entity.ReviewUser;
import com.springboot.repository.ReviewUserRepository;

@Service
public class ReviewUserService {

	@Autowired
	private ReviewUserRepository reviewUserRepo;
	
	public List<ReviewUser> getAllReviewUser() {
		
		List<ReviewUser> list = new ArrayList<ReviewUser>();
		reviewUserRepo.findAll().forEach(list::add);
		return list;
	}

	public Object getReviewUser(int userId) {

		return reviewUserRepo.findById(userId);
	}
	@Transactional
	public void postReviewUser(ReviewUser user) {
		
		reviewUserRepo.save(user);
		
	}
	@Transactional
	public void putReviewUser(ReviewUser user) {
		
		reviewUserRepo.save(user);
		
	}
	@Transactional
	public void deleteReviewUser(int userId) {
		
		reviewUserRepo.deleteById(userId);
	}

}
