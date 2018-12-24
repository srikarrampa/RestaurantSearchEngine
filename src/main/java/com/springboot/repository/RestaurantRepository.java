package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.entity.Restaurants;



public interface RestaurantRepository extends CrudRepository<Restaurants,Integer> {

}
