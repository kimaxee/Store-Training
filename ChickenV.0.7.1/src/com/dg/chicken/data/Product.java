package com.dg.chicken.data;

public abstract class Product {
	private String code;
	private String name;
	private int price;
	private int ea;

	public Product(String code, String name, int price, int ea) {
		this.setCode(code);
		this.name = name;
		this.price = price;
		this.ea = ea;
	}

	public void info() {
		System.out.println(name + " " + price + "원");
	}
	
	public void info2() {
		System.out.println(name + " " + price + "원 " + ea + "EA");
	}

	public void info3() {
		System.out.println(name + " " + ea + "EA");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getEa() {
		return ea;
	}

	public void setEa(int ea) {
		this.ea = ea;
	}

	public int getPrice() {
		return price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
