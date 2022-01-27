package com.dg.chicken.list;

import java.util.ArrayList;

import com.dg.chicken.data.Product;

public class FlavorList {
	public void list(ArrayList<Product> flavors) {
		flavors.add(new Product("순한맛"));
		flavors.add(new Product("중간맛"));
		flavors.add(new Product("매운맛"));
	}
}