package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.entity.CuisineUser;



public interface CuisineUserRepository extends CrudRepository<CuisineUser,Integer> {

}
