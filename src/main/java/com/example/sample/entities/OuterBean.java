package com.example.sample.entities;

public class OuterBean {
	
	private InnerBean innerBean;

	public InnerBean getInnerBean() {
		return innerBean;
	}

	public void setInnerBean(InnerBean innerBean) {
		System.out.println("Inside setInnerBean");
		this.innerBean = innerBean;
	}
	
	public void show() {
		System.out.println("Inner Bean");
	}

}
