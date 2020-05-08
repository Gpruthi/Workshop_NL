package com.example.sample.services;

import org.springframework.stereotype.Service;

@Service
public class SampleService {
	
	public void message(String message) {
		System.out.println(message);
	}

}
