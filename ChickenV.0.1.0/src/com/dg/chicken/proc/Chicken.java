package com.dg.chicken.proc;

import java.util.ArrayList;
import java.util.Scanner;

import com.dg.chicken.data.Product;
import com.dg.chicken.list.FlavorList;
import com.dg.chicken.menu.Seasoning;

public class Chicken {
	Scanner sc = new Scanner(System.in);
	String name;
	String taste;
	ArrayList<Product> flavors = new ArrayList<Product>();

	public void proc(ArrayList<Product> chickens) {
		FlavorList flavorList = new FlavorList();
		flavorList.list(flavors);
		
		System.out.println("\n=======================");
		System.out.println("1.치킨을 선택하셨습니다.");
		System.out.println("-----------------------");
		for (Product c : chickens) {
			c.info();
		}
		System.out.println("-----------------------");
		System.out.print("종류를 선택하세요 : ");

		boolean run2 = true;
		while (run2) {
			name = sc.next();

			switch (name) { // 치킨종류 선택
			case "후라이드":
				System.out.println("=======================");
				System.out.println(name + "를 선택하셨습니다.");
				run2 = false;
				break;

			case "양념":
				System.out.println("=======================");
				System.out.println(name + "을 선택하셨습니다.");
				Seasoning seasoning = new Seasoning();
				seasoning.proc(flavors);

				boolean run3 = true;
				while (run3) {
					taste = sc.next();

					switch (taste) { // 치킨 맛 선택
					case "순한맛":
						System.out.println("=======================");
						System.out.println(taste + "을 선택하셨습니다.");
						run3 = false;
						break;
					case "중간맛":
						System.out.println("=======================");
						System.out.println(taste + "을 선택하셨습니다.");
						run3 = false;
						break;
					case "매운맛":
						System.out.println("=======================");
						System.out.println(taste + "을 선택하셨습니다.");
						run3 = false;
						break;
					default:
						System.out.println(taste + "는(은) 없습니다 다시 선택하세요.");
						System.out.println("-----------------------");
						for (Product f : flavors) {
							f.info();
						}
						System.out.println("-----------------------");
						System.out.print("맛을 선택하세요 : ");
					}
				}
				run2 = false;
				break;

			case "갈릭":
				System.out.println("=======================");
				System.out.println(name + "을 선택하셨습니다.");
				run2 = false;
				break;

			case "바베큐":
				System.out.println("=======================");
				System.out.println(name + "를 선택하셨습니다.");
				System.out.println("구매하시겠습니까?(Y/N)");
				run2 = false;
				break;

			default:
				System.out.println(name + "는(은) 없습니다 다시 선택하세요.");
				System.out.println("-----------------------");
				for (Product c : chickens) {
					c.info();
				}
				System.out.println("-----------------------");
				System.out.print("종류를 선택하세요 : ");
			}
		}
	}
}
