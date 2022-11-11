package com.example.demo.exceptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.repositories.PersonRepository;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException  {
	
	private static final long serialVersionUID = 1L;
	
	@Autowired
	PersonRepository repository;
	
	public ResourceNotFoundException(String ex) {
		super(ex);
	}

}