package com.odav.rest;

import java.util.ArrayList;
import java.util.List;

public class ExampleResources {
	private List<ExampleResource> list;
	
	public ExampleResources(List<ExampleResource> list) {
		this.setList(list);
	}
	public ExampleResources() {
		this(new ArrayList<>());
	}
	
	public List<ExampleResource> getList() {
		return list;
	}
	
	public void setList(List<ExampleResource> list) {
		this.list = list;
	}
}
