package com.dg.chicken.list;

import java.util.ArrayList;

import com.dg.chicken.data.Product;

public class ChickenList {
	public void list(ArrayList<Product> chickens) {
		chickens.add(new Product("후라이드"));
		chickens.add(new Product("양념"));
		chickens.add(new Product("갈릭"));
		chickens.add(new Product("바베큐"));
	}
}
