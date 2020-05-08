package com.example.sample.entities;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CallbacksUsingXML implements InitializingBean, DisposableBean{

	 public void init() {
	        System.out.println("Executed after dependency injection is done");
	    }
	 
	 public void cleanup() {
	        System.out.println("Release pooled connections and perform other cleanup activities ");
	    }

	@Override
	public void destroy() throws Exception {
		System.out.println("Perform cleanup activities");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Verifying resources");
		
	}
}

