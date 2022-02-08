package com.dg.chicken.list;

import java.util.ArrayList;

import com.dg.chicken.data.Product;

public class ChickenList extends Product {
	public ChickenList(String code, String name, int price, int ea) {
		super(code, name, price, ea);
		// TODO Auto-generated constructor stub
	}
	public static ArrayList<Product> chickens = new ArrayList<Product>();
	public static void list() {
		chickens.add(new ChickenList("C1", "후라이드치킨", 10000, 1));
		chickens.add(new ChickenList("C2", "양념치킨", 11000, 1));
		chickens.add(new ChickenList("C3", "갈릭치킨", 13000, 1));
		chickens.add(new ChickenList("C4", "바베큐치킨", 13000, 1));
	}
}
