package com.example.sample.entities;

public class Address {
	
	private String state;
	
	public Address() {
		
	}

//	public Address(String state) {
//		this.state = state;
//	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void show() {
		System.out.println("Inside Address");
	}
	
}
