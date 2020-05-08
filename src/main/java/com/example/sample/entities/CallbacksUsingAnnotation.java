package com.example.sample.entities;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CallbacksUsingAnnotation implements InitializingBean, DisposableBean{
	
	 @PostConstruct
	 public void initWithAnno() {
	        System.out.println("Executed after dependency injection is done");
	    }
	 
	 @PreDestroy
	 public void cleanupWithAnno() {
	        System.out.println("Release pooled connections and perform other cleanup activities");
	    }

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Verifying resourcess");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Perform clean up activities");
	}

}
