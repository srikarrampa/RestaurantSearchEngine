package com.springboot.restaurants;

import org.springframework.data.repository.CrudRepository;



public interface RestaurantRepository extends CrudRepository<Restaurants,Integer> {

}
