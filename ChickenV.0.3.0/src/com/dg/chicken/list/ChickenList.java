package com.dg.chicken.list;

import java.util.ArrayList;

import com.dg.chicken.data.Product;

public class ChickenList {
	public static ArrayList<Product> chickens = new ArrayList<Product>();
	public static void list() {
		chickens.add(new Product("후라이드치킨", 10000));
		chickens.add(new Product("양념치킨", 11000));
		chickens.add(new Product("갈릭치킨", 13000));
		chickens.add(new Product("바베큐치킨", 13000));
	}
}
