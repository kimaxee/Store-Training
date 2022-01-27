package com.dg.chicken.list;

import java.util.ArrayList;

import com.dg.chicken.data.Product;

public class SideList {
	public void list(ArrayList<Product> sides) {
		sides.add(new Product("감자튀김"));
		sides.add(new Product("새우튀김"));
		sides.add(new Product("치즈스틱"));
		sides.add(new Product("떡볶이"));
	}
}
