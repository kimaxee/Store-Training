package com.dg.chicken.list;

import java.util.ArrayList;

import com.dg.chicken.data.Product;

public class DrinkList extends Product {
	public DrinkList(String code, String name, int price, int ea) {
		super(code, name, price, ea);
		// TODO Auto-generated constructor stub
	}
	public static ArrayList<Product> drinks = new ArrayList<Product>();
	public static void list() {
		drinks.add(new DrinkList("D1", "콜라", 2000, 1));
		drinks.add(new DrinkList("D2", "사이다", 2000, 1));
		drinks.add(new DrinkList("D3", "생맥주", 4000, 1));
	}
}
