package com.springboot.dishes;

import org.springframework.data.repository.CrudRepository;



public interface DishRepository extends CrudRepository<Dish,Integer> {

}
