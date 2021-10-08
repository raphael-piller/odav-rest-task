package com.odav.rest;

public class ExampleResource {	
	private String id;
	private int number;
	
	public ExampleResource(String id, int number) {
		this.setId(id);
		this.setNumber(number);
	}
	
	public String getId() {
		return id;
	}
	public int getNumber() {
		return number;
	}
	
	private void setId(String id) {
		this.id = id;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "ExampleResource ["
				+ "id=" + this.id + ", "
				+ "number=" + this.number
				+ "]";
	}
}
