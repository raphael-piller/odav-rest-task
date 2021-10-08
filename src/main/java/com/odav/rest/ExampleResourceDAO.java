package com.odav.rest;

import org.springframework.stereotype.Repository;

@Repository
public class ExampleResourceDAO {
	private static ExampleResources exampleResources = new ExampleResources();
	
	public ExampleResources getExampleResources() {
		return exampleResources;		
	}
	
	public void addExampleResource(ExampleResource exampleResource) {
		exampleResources.getList().add(exampleResource);
	}
}