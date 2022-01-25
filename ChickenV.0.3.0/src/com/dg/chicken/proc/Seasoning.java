package com.dg.chicken.proc;

import java.util.ArrayList;

import com.dg.chicken.data.Flavor;
import com.dg.chicken.list.FlavorList;

public class Seasoning {
	public void proc(ArrayList<Flavor> flavors) {
		System.out.println("-----------------------");
		for (Flavor f : FlavorList.flavors) {
			f.info();
		}
		System.out.println("-----------------------");
		System.out.println("뒤로가기 : b");
		System.out.println("-----------------------");
		System.out.print("맛을 선택하세요 : ");
	}
}
