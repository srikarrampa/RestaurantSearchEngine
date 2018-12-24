package com.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.entity.Type;
import com.springboot.repository.TypeRepository;

@Service
public class TypeService {

	@Autowired
	private TypeRepository typeRepo;
	
	public List<Type> getAllTypes() {
		
		List<Type> list = new ArrayList<Type>();
		typeRepo.findAll().forEach(list::add);
		return list;
	}

	public Object getType(int typeId) {

		return typeRepo.findById(typeId);
	}
	@Transactional
	public void postType(Type type) {
		
		typeRepo.save(type);
		
	}
	@Transactional
	public void putType(Type type) {
		
		typeRepo.save(type);
		
	}
	@Transactional
	public void deleteType(int typeId) {
		
		typeRepo.deleteById(typeId);
	}

}
