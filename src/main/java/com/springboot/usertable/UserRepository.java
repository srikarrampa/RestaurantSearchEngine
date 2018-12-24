package com.springboot.usertable;

import org.springframework.data.repository.CrudRepository;



public interface UserRepository extends CrudRepository<User,Integer> {

}
