package com.odav.rest;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exampleResource")
public class ExampleResourceController {
	@Autowired
	private ExampleResourceDAO exampleResourceDao;
	
	@GetMapping(path="/{id}", produces="application/json")
	public ExampleResource getExampleResource(@PathVariable String id) {		
		// Lookup if a resource with the given id already exists and return it
		for (ExampleResource exampleResource : exampleResourceDao.getExampleResources().getList()) {
			if(exampleResource.getId().equals(id)) {
				return exampleResource;
			}
		}
		
		// Create a new example resource with the given id and a random number, add it to the list and return it
		ExampleResource exampleResource = new ExampleResource(id, (new Random()).nextInt(50)); // Bound 50 is just to make the random numbers clearer
		exampleResourceDao.addExampleResource(exampleResource);
		return exampleResource;
	}
}
