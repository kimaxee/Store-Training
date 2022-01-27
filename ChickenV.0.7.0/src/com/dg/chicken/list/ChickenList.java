package com.dg.chicken.list;

import java.util.ArrayList;

import com.dg.chicken.data.Product;

public class ChickenList {
	public static ArrayList<Product> chickens = new ArrayList<Product>();
	public static void list() {
		chickens.add(new Product("C1", "후라이드치킨", 10000, 1));
		chickens.add(new Product("C2", "양념치킨", 11000, 1));
		chickens.add(new Product("C3", "갈릭치킨", 13000, 1));
		chickens.add(new Product("C4", "바베큐치킨", 13000, 1));
	}
}
