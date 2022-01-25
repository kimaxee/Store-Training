package com.dg.chicken.proc;

import java.util.ArrayList;
import java.util.Scanner;

import com.dg.chicken.data.Product;

public class DrinkMenu {
	Scanner sc = new Scanner(System.in);
	String name;
	
	public void proc(ArrayList<Product> drinks) {
		System.out.println("\n=======================");
		System.out.println("3.음료를 선택하셨습니다.");
		System.out.println("-----------------------");
		for (Product d : drinks) {
			d.info();
		}
		System.out.println("-----------------------");
		System.out.print("종류를 선택하세요 : ");
		
		boolean run5 = true;
		while (run5) {
			name = sc.next();
			switch (name) {
			case "콜라":
				System.out.println("=======================");
				System.out.println(name + "를 선택하셨습니다.");
				run5 = false;
				break;
			case "사이다":
				System.out.println("=======================");
				System.out.println(name + "를 선택하셨습니다.");
				run5 = false;
				break;
			case "생맥주":
				System.out.println("=======================");
				System.out.println(name + "를 선택하셨습니다.");
				run5 = false;
				break;
			default:
				System.out.println(name + "은 없습니다 다시 선택하세요.");
				System.out.println("-----------------------");
				for (Product d : drinks) {
					d.info();
				}
				System.out.println("-----------------------");
				System.out.print("종류를 선택하세요 : ");
			}
		}
	}

}
