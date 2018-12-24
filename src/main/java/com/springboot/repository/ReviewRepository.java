package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.entity.Review;



public interface ReviewRepository extends CrudRepository<Review,Integer> {

}
