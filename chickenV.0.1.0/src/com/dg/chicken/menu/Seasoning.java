package com.dg.chicken.menu;

import java.util.ArrayList;

import com.dg.chicken.data.Product;

public class Seasoning {
	public void proc(ArrayList<Product> flavors) {
		System.out.println("-----------------------");
		for (Product f : flavors) {
			f.info();
		}
		System.out.println("-----------------------");
		System.out.print("맛을 선택하세요 : ");
	}
}
