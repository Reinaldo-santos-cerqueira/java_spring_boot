package com.example.demo.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exceptions.ResourceNotFoundException;
import com.example.demo.model.Person;
import com.example.demo.repositories.PersonRepository;

@Service
public class PersonServices {

	private Logger logger = Logger.getLogger(PersonServices.class.getName());

	@Autowired
	PersonRepository repository;
	
	public Person findById(Long id) {
		
		logger.info(" Finding one person ");

		return repository.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("No records found for this ID"));
	}
	
	public List<Person> findAll() {
		
		logger.info(" Finding all person ");
				
		return repository.findAll();
	
	}

	public Person create(Person person) {
		
		logger.info(" Create person ");

		return repository.save(person);
	
	}
	
	public Person update(Person person) {
		
		logger.info(" Update person ");
		
		var entity = repository.findById(person.getId())
		.orElseThrow(()-> new ResourceNotFoundException("No records found for this ID"));
		
		entity.setId(person.getId());
		
		entity.setFirstName(person.getFirstName());
		
		entity.setLastName(person.getLastName());
		
		entity.setAddress(person.getAddress());
		
		entity.setGender(person.getGender()); 
		
		return repository.save(person);
		
	} 
	
	public void delete(Long id) {
		
		var entity = repository.findById(id)
		.orElseThrow(()-> new ResourceNotFoundException("No records found for this ID"));
		
		repository.delete(entity);
		
	} 
	
}
