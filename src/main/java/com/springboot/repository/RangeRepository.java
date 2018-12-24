package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.entity.Ranges;



public interface RangeRepository extends CrudRepository<Ranges,Integer> {

}
