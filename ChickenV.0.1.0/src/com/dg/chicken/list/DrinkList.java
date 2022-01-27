package com.dg.chicken.list;

import java.util.ArrayList;

import com.dg.chicken.data.Product;

public class DrinkList {
	public void list(ArrayList<Product> drinks) {
		drinks.add(new Product("콜라"));
		drinks.add(new Product("사이다"));
		drinks.add(new Product("생맥주"));
	}
}
