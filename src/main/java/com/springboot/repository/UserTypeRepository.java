package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.entity.UserType;



public interface UserTypeRepository extends CrudRepository<UserType,Integer> {

}
