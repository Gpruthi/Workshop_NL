package com.example.sample.entities;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

public class JavaCollection {

	private List list;
	
	private Set set;
	
	private Map map;
	
	private Properties prop;

	// a setter method to set List
	public void setList(List list) {
		this.list = list;
	}

	// prints and returns all the elements of the list.
	public List getList() {
		System.out.println("List Elements :" + list);
		return list;
	}

	// a setter method to set Set
	public void setSet(Set set) {
		this.set = set;
	}

	// prints and returns all the elements of the Set.
	public Set getSet() {
		System.out.println("Set Elements :" + set);
		return set;
	}

	// a setter method to set Map
	public void setMap(Map map) {
		this.map = map;
	}

	// prints and returns all the elements of the Map.
	public Map getMap() {
		System.out.println("Map Elements :" + map);
		return map;
	}

	// a setter method to set Property
	public void setProp(Properties prop) {
		this.prop = prop;
	}

	// prints and returns all the elements of the Property.
	public Properties getProp() {
		System.out.println("Property Elements :" + prop);
		return prop;
	}

}
