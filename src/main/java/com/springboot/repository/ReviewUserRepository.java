package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.entity.ReviewUser;



public interface ReviewUserRepository extends CrudRepository<ReviewUser,Integer> {

}
