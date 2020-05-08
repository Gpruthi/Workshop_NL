package com.example.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.services.SampleService;

@RestController
@RequestMapping("/")
public class SampleController {
	
	//@Autowired
	SampleService service;
	
	public SampleController(SampleService service) { 
		this.service = service; 
		}
	
	@Autowired
	public void setService(SampleService service) {
		this.service = service;
	}

	@GetMapping
	public void mess() {
		service.message("Sample Message");
	}

}
