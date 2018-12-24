package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.entity.DishRestaurant;



public interface DishRestaurantRepository extends CrudRepository<DishRestaurant,Integer> {

}
