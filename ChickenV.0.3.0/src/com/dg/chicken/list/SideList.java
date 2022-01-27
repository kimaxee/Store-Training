package com.dg.chicken.list;

import java.util.ArrayList;

import com.dg.chicken.data.Product;

public class SideList {
	public static ArrayList<Product> sides = new ArrayList<Product>();
	public static void list() {
		sides.add(new Product("감자튀김", 5000));
		sides.add(new Product("새우튀김", 4000));
		sides.add(new Product("치즈스틱", 3000));
		sides.add(new Product("떡볶이", 5000));
	}
}
