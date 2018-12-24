package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.entity.RangeRestaurant;



public interface RangeRestaurantRepository extends CrudRepository<RangeRestaurant,Integer> {

}
