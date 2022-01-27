package com.dg.chicken.proc;

import java.util.ArrayList;
import java.util.Scanner;

import com.dg.chicken.data.Product;
import com.dg.chicken.list.OrdertList;

public class Side {
	Scanner sc = new Scanner(System.in);
	public static String sideType;
	
	public void proc(ArrayList<Product> sides) {
		System.out.println("\n=======================");
		System.out.println("2.사이드를 선택하셨습니다.");
		System.out.println("-----------------------");
		for (Product s : sides) {
			s.info();
		}
		System.out.println("-----------------------");
		System.out.println("뒤로가기 : b");
		System.out.println("-----------------------");
		System.out.print("종류를 선택하세요 : ");
		
		boolean run4 = true;
		while (run4) {
			sideType = sc.next();
			switch (sideType) {
			case "감자튀김":
				System.out.println("=======================");
				System.out.println(sideType + "을 선택하셨습니다.");
				OrdertList.products.add(new Product(Side.sideType));
				run4 = false;
				break;
			case "새우튀김":
				System.out.println("=======================");
				System.out.println(sideType + "을 선택하셨습니다.");
				OrdertList.products.add(new Product(Side.sideType));
				run4 = false;
				break;
			case "치즈스틱":
				System.out.println("=======================");
				System.out.println(sideType + "을 선택하셨습니다.");
				OrdertList.products.add(new Product(Side.sideType));
				run4 = false;
				break;
			case "떡볶이":
				System.out.println("=======================");
				System.out.println(sideType + "를 선택하셨습니다.");
				OrdertList.products.add(new Product(Side.sideType));
				run4 = false;
				break;
			case "b":
				run4 = false;
				break;
			default:
				System.out.println(sideType + "은 없습니다 다시 선택하세요.");
				System.out.println("-----------------------");
				for (Product s : sides) {
					s.info();
				}
				System.out.println("-----------------------");
				System.out.println("뒤로가기 : b");
				System.out.println("-----------------------");
				System.out.print("종류를 선택하세요 : ");
			}
		}
	}
}
