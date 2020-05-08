package com.example.sample.entities;

public class InstantiationWithStaticFactoryMethod {

	private static InstantiationWithStaticFactoryMethod inst = new InstantiationWithStaticFactoryMethod();
	
	private InstantiationWithStaticFactoryMethod() {}

    public static InstantiationWithStaticFactoryMethod createInstance() {
        return inst;
    }
}
