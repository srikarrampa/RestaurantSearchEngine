package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.entity.Cuisine;


public interface CusineRepository extends CrudRepository<Cuisine,Integer> {

}
