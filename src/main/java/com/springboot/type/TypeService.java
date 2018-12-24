package com.springboot.type;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	public void postType(Type type) {
		
		typeRepo.save(type);
		
	}

	public void putType(Type type) {
		
		typeRepo.save(type);
		
	}

	public void deleteType(int typeId) {
		
		typeRepo.deleteById(typeId);
	}

}
