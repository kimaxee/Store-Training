package com.dg.chicken.data;

public class Flavor {
	private String name;
	
	public Flavor(String name) {
		this.name = name;
	}
	
	public void info() {
		System.out.println(name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
