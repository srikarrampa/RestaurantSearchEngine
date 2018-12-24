package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.entity.Rating;



public interface RatingRepository extends CrudRepository<Rating,Integer> {

}
