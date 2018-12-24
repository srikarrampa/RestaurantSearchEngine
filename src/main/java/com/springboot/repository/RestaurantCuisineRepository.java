package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.entity.RestaurantCuisine;



public interface RestaurantCuisineRepository extends CrudRepository<RestaurantCuisine,Integer> {

}
