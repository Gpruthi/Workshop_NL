package com.example.sample;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

import com.example.sample.entities.Address;
import com.example.sample.entities.CallbacksUsingAnnotation;
import com.example.sample.entities.Employee;
import com.example.sample.entities.LazyInitialization;

@Configuration
public class Config {
 
    @Bean
    public BeanFactoryPostProcessor beanFactoryPostProcessor() {
        return new PostProcessor();
    }
    
    @Bean
    public CallbacksUsingAnnotation callbacks() {
        return new CallbacksUsingAnnotation();
    }
    
    @Bean("emp")
    @DependsOn(value = {"address"})
    public Employee emp() {
        return new Employee();
    }
    
    @Bean("address")
    public Address address() {
        return new Address();
    }
    
    @Bean("lazy")
    @Lazy(false)
    public LazyInitialization lazy() {
        return new LazyInitialization();
    }
    
    @Bean
    public CustomBeanFactoryPostProcessor custom() {
        return new CustomBeanFactoryPostProcessor();
    }
    
}