package com.dg.chicken.list;

import java.util.ArrayList;

import com.dg.chicken.data.Flavor;

public class FlavorList extends Flavor {
	public FlavorList(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public static ArrayList<Flavor> flavors = new ArrayList<Flavor>();
	public static void list() {
		flavors.add(new FlavorList("순한맛"));
		flavors.add(new FlavorList("중간맛"));
		flavors.add(new FlavorList("매운맛"));
	}
}