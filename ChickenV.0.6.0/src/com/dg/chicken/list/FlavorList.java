package com.dg.chicken.list;

import java.util.ArrayList;

import com.dg.chicken.data.Flavor;

public class FlavorList {
	public static ArrayList<Flavor> flavors = new ArrayList<Flavor>();
	public static void list() {
		flavors.add(new Flavor("순한맛"));
		flavors.add(new Flavor("중간맛"));
		flavors.add(new Flavor("매운맛"));
	}
}