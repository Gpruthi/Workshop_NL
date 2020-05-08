package com.example.sample.entities;

public class LazyInitialization {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LazyInitialization() {
	}

	public LazyInitialization(String name) {
		this.name = name;
		System.out.println("Lazy Initialization");
	}
	
	public void show() {
		System.out.println("Initialized");
	}

}
