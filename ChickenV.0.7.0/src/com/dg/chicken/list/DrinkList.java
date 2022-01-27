package com.dg.chicken.list;

import java.util.ArrayList;

import com.dg.chicken.data.Product;

public class DrinkList {
	public static ArrayList<Product> drinks = new ArrayList<Product>();
	public static void list() {
		drinks.add(new Product("D1", "콜라", 2000, 1));
		drinks.add(new Product("D2", "사이다", 2000, 1));
		drinks.add(new Product("D3", "생맥주", 4000, 1));
	}
}
