package com.dg.chicken.list;

import java.util.ArrayList;

import com.dg.chicken.data.Product;

public class SideList {
	public static ArrayList<Product> sides = new ArrayList<Product>();
	public static void list() {
		sides.add(new Product("S1", "감자튀김", 5000, 1));
		sides.add(new Product("S2", "새우튀김", 4000, 1));
		sides.add(new Product("S3", "치즈스틱", 3000, 1));
		sides.add(new Product("S4", "떡볶이", 5000, 1));
	}
}
