package com.example.sample.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

@Component
public class Employee implements SmartLifecycle{
	
	private boolean isRunning;
	
	private String firstName;
	
	private String lastName;
	
	@Autowired
	private Address address;
	
	public Employee() {
	}

//	public Employee(Address address, String firstName, String lastName) {
//		this.address = address;
//		this.firstName = firstName;
//		this.lastName = lastName;
//	}

	//protected abstract Address addAddress();

	@Lookup
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void employeeDetails() {
		System.out.println("FirstName: "+firstName +" LastName: "+lastName+" State: "+address.getState());
	}
	
	public void show() {
		System.out.println("Inside Employee");
		address.show();
	}

	@Override
	public void start() {
		System.out.println("START");
		isRunning = true;
	}

	@Override
	public void stop() {
		System.out.println("STOP");
		isRunning = false;
	}

	@Override
	public boolean isRunning() {
		return isRunning;
	}
}
