package com.dg.chicken.proc;

import java.util.ArrayList;
import java.util.Scanner;

import com.dg.chicken.data.Flavor;
import com.dg.chicken.data.Product;
import com.dg.chicken.list.ChickenList;
import com.dg.chicken.list.FlavorList;
import com.dg.chicken.list.OrdertList;

public class Chicken {
	Scanner sc = new Scanner(System.in);
	public static String chickenType;
	public static String taste;
	public static String choice;
	public static boolean runChoice;

	public void proc(ArrayList<Product> chickens) {
		System.out.println("\n=======================");
		System.out.println("1.치킨을 선택하셨습니다.");
		System.out.println("-----------------------");
		for (Product c : chickens) {
			c.info();
		}
		System.out.println("-----------------------");
		System.out.println("뒤로가기 : b");
		System.out.println("-----------------------");
		System.out.print("종류를 선택하세요 : ");

		boolean runChikenType = true;
		while (runChikenType) {
			chickenType = sc.next();

			switch (chickenType) { // 치킨종류 선택
			case "1": // 후라이드치킨
				System.out.println("=======================");
				System.out.println(ChickenList.chickens.get(0).getName() + "을 선택하셨습니다.");
				System.out.println("주문목록 담기(Y/N)");
				
				runChoice = true;
				while(runChoice) {
				choice = sc.next();
					if (choice.equals("Y") || choice.equals("y")) {
						OrdertList.products.add(new Product(ChickenList.chickens.get(0).getName(), ChickenList.chickens.get(0).getPrice()));
						System.out.println(ChickenList.chickens.get(0).getName() + " 담기완료!");
						return; 
					} else if (choice.equals("N") || choice.equals("n")) {
						System.out.println("취소하셨습니다.");
						return;
					} else {
						System.out.println("잘못 선택하셨습니다 다시 선택하세요.");
					}
				}
			case "2": // 양념치킨
				System.out.println("=======================");
				System.out.println(ChickenList.chickens.get(1).getName() + "을 선택하셨습니다.");
				Seasoning seasoning = new Seasoning();
				seasoning.proc(FlavorList.flavors);

				boolean runChikenTaste = true;
				while (runChikenTaste) {
					taste = sc.next();

					switch (taste) { // 치킨 맛 선택
					case "1": // 순한맛
						System.out.println("=======================");
						System.out.println(FlavorList.flavors.get(0).getName() + "을 선택하셨습니다.");
						System.out.println("주문목록 담기(Y/N)");
						
						runChoice = true;
						while(runChoice) {
						choice = sc.next();
							if (choice.equals("Y") || choice.equals("y")) {
								OrdertList.products.add(new Product(ChickenList.chickens.get(1).getName() + "(" + FlavorList.flavors.get(0).getName() + ")", ChickenList.chickens.get(1).getPrice()));
								System.out.println(ChickenList.chickens.get(1).getName() + "(" + FlavorList.flavors.get(0).getName() + ")" + " 담기완료!");
								return; 
							} else if (choice.equals("N") || choice.equals("n")) {
								System.out.println("취소하셨습니다.");
								return;
							} else {
								System.out.println("잘못 선택하셨습니다 다시 선택하세요.");
							}
						}
					case "2": // 중간맛
						System.out.println("=======================");
						System.out.println(FlavorList.flavors.get(1).getName() + "을 선택하셨습니다.");
						System.out.println("주문목록 담기(Y/N)");
						
						runChoice = true;
						while(runChoice) {
						choice = sc.next();
							if (choice.equals("Y") || choice.equals("y")) {
								OrdertList.products.add(new Product(ChickenList.chickens.get(1).getName() + "(" + FlavorList.flavors.get(1).getName() + ")", ChickenList.chickens.get(1).getPrice()));
								System.out.println(ChickenList.chickens.get(1).getName() + "(" + FlavorList.flavors.get(1).getName() + ")" + " 담기완료!");
								return; 
							} else if (choice.equals("N") || choice.equals("n")) {
								System.out.println("취소하셨습니다.");
								return;
							} else {
								System.out.println("잘못 선택하셨습니다 다시 선택하세요.");
							}
						}
					case "3": // 매운맛
						System.out.println("=======================");
						System.out.println(FlavorList.flavors.get(2).getName() + "을 선택하셨습니다.");
						System.out.println("주문목록 담기(Y/N)");
						
						runChoice = true;
						while(runChoice) {
						choice = sc.next();
							if (choice.equals("Y") || choice.equals("y")) {
								OrdertList.products.add(new Product(ChickenList.chickens.get(1).getName() + "(" + FlavorList.flavors.get(2).getName() + ")", ChickenList.chickens.get(1).getPrice()));
								System.out.println(ChickenList.chickens.get(1).getName() + "(" + FlavorList.flavors.get(2).getName() + ")" + " 담기완료!");
								return; 
							} else if (choice.equals("N") || choice.equals("n")) {
								System.out.println("취소하셨습니다.");
								return;
							} else {
								System.out.println("잘못 선택하셨습니다 다시 선택하세요.");
							}
						}
					case "b":
						return;
					default:
						System.out.println(taste + "는(은) 없습니다 다시 선택하세요.");
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
				runChikenType = false;
				break;

			case "3": // 갈릭치킨
				System.out.println("=======================");
				System.out.println(ChickenList.chickens.get(2).getName() + "을 선택하셨습니다.");
				System.out.println("주문목록 담기(Y/N)");
				
				runChoice = true;
				while(runChoice) {
				choice = sc.next();
					if (choice.equals("Y") || choice.equals("y")) {
						OrdertList.products.add(new Product(ChickenList.chickens.get(2).getName(), ChickenList.chickens.get(2).getPrice()));
						System.out.println(ChickenList.chickens.get(2).getName() + " 담기완료!");
						return; 
					} else if (choice.equals("N") || choice.equals("n")) {
						System.out.println("취소하셨습니다.");
						return;
					} else {
						System.out.println("잘못 선택하셨습니다 다시 선택하세요.");
					}
				}
			case "4": // 바베큐치킨
				System.out.println("=======================");
				System.out.println(ChickenList.chickens.get(3).getName() + "을 선택하셨습니다.");
				System.out.println("주문목록 담기(Y/N)");
				
				runChoice = true;
				while(runChoice) {
				choice = sc.next();
					if (choice.equals("Y") || choice.equals("y")) {
						OrdertList.products.add(new Product(ChickenList.chickens.get(3).getName(), ChickenList.chickens.get(3).getPrice()));
						System.out.println(ChickenList.chickens.get(3).getName() + " 담기완료!");
						return; 
					} else if (choice.equals("N") || choice.equals("n")) {
						System.out.println("취소하셨습니다.");
						return;
					} else {
						System.out.println("잘못 선택하셨습니다 다시 선택하세요.");
					}
				}
			case "b":
				runChikenType = false;
				break;
			default:
				System.out.println(chickenType + "는(은) 없습니다 다시 선택하세요.");
				System.out.println("-----------------------");
				for (Product c : chickens) {
					c.info();
				}
				System.out.println("-----------------------");
				System.out.println("뒤로가기 : b");
				System.out.println("-----------------------");
				System.out.print("종류를 선택하세요 : ");
			}
		}
	}
}
