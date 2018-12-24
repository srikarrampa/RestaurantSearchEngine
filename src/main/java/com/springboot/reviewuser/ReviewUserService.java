package com.springboot.reviewuser;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	public void postReviewUser(ReviewUser user) {
		
		reviewUserRepo.save(user);
		
	}

	public void putReviewUser(ReviewUser user) {
		
		reviewUserRepo.save(user);
		
	}

	public void deleteReviewUser(int userId) {
		
		reviewUserRepo.deleteById(userId);
	}

}
