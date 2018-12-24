package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.entity.Dish;



public interface DishRepository extends CrudRepository<Dish,Integer> {

}
