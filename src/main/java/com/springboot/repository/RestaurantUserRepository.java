package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.controller.RestaurantUser;



public interface RestaurantUserRepository extends CrudRepository<RestaurantUser,Integer> {

}
