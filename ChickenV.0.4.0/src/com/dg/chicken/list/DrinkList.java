package com.dg.chicken.list;

import java.util.ArrayList;

import com.dg.chicken.data.Product;

public class DrinkList {
	public static ArrayList<Product> drinks = new ArrayList<Product>();
	public static void list() {
		drinks.add(new Product("콜라", 2000));
		drinks.add(new Product("사이다", 2000));
		drinks.add(new Product("생맥주", 4000));
	}
}
