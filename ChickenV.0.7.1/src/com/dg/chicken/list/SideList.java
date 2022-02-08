package com.dg.chicken.list;

import java.util.ArrayList;

import com.dg.chicken.data.Product;

public class SideList extends Product {
	public SideList(String code, String name, int price, int ea) {
		super(code, name, price, ea);
		// TODO Auto-generated constructor stub
	}
	public static ArrayList<Product> sides = new ArrayList<Product>();
	public static void list() {
		sides.add(new SideList("S1", "감자튀김", 5000, 1));
		sides.add(new SideList("S2", "새우튀김", 4000, 1));
		sides.add(new SideList("S3", "치즈스틱", 3000, 1));
		sides.add(new SideList("S4", "떡볶이", 5000, 1));
	}
}
