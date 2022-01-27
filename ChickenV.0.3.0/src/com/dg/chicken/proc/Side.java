package com.dg.chicken.proc;

import java.util.ArrayList;
import java.util.Scanner;

import com.dg.chicken.data.Product;
import com.dg.chicken.list.DrinkList;
import com.dg.chicken.list.OrdertList;
import com.dg.chicken.list.SideList;

public class Side {
	Scanner sc = new Scanner(System.in);
	public static String sideType;
	public static String choice;
	public static boolean runChoice;
	
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
		
		boolean runSideType = true;
		while (runSideType) {
			sideType = sc.next();
			switch (sideType) {
			case "1": //감자튀김
				System.out.println("=======================");
				System.out.println(SideList.sides.get(0).getName() + "을 선택하셨습니다.");
				System.out.println("주문목록 담기(Y/N)");
				
				runChoice = true;
				while(runChoice) {
				choice = sc.next();
					if (choice.equals("Y") || choice.equals("y")) {
						OrdertList.products.add(new Product(SideList.sides.get(0).getName(), SideList.sides.get(0).getPrice()));
						System.out.println(SideList.sides.get(0).getName() + " 담기완료!");
						return; 
					} else if (choice.equals("N") || choice.equals("n")) {
						System.out.println("취소하셨습니다.");
						return;
					} else {
						System.out.println("잘못 선택하셨습니다 다시 선택하세요.");
					}
				}
			case "2": //새우튀김
				System.out.println("=======================");
				System.out.println(SideList.sides.get(1).getName() + "을 선택하셨습니다.");
				System.out.println("주문목록 담기(Y/N)");
				
				runChoice = true;
				while(runChoice) {
				choice = sc.next();
					if (choice.equals("Y") || choice.equals("y")) {
						OrdertList.products.add(new Product(SideList.sides.get(1).getName(), SideList.sides.get(1).getPrice()));
						System.out.println(SideList.sides.get(1).getName() + " 담기완료!");
						return; 
					} else if (choice.equals("N") || choice.equals("n")) {
						System.out.println("취소하셨습니다.");
						return;
					} else {
						System.out.println("잘못 선택하셨습니다 다시 선택하세요.");
					}
				}
			case "3": //치즈스틱
				System.out.println("=======================");
				System.out.println(SideList.sides.get(2).getName() + "을 선택하셨습니다.");
				System.out.println("주문목록 담기(Y/N)");
				
				runChoice = true;
				while(runChoice) {
				choice = sc.next();
					if (choice.equals("Y") || choice.equals("y")) {
						OrdertList.products.add(new Product(SideList.sides.get(2).getName(), SideList.sides.get(2).getPrice()));
						System.out.println(SideList.sides.get(2).getName() + " 담기완료!");
						return; 
					} else if (choice.equals("N") || choice.equals("n")) {
						System.out.println("취소하셨습니다.");
						return;
					} else {
						System.out.println("잘못 선택하셨습니다 다시 선택하세요.");
					}
				}
			case "4": //떡볶이
				System.out.println("=======================");
				System.out.println(SideList.sides.get(3).getName() + "를 선택하셨습니다.");
				System.out.println("주문목록 담기(Y/N)");
				
				runChoice = true;
				while(runChoice) {
				choice = sc.next();
					if (choice.equals("Y") || choice.equals("y")) {
						OrdertList.products.add(new Product(SideList.sides.get(2).getName(), SideList.sides.get(2).getPrice()));
						System.out.println(SideList.sides.get(2).getName() + " 담기완료!");
						return; 
					} else if (choice.equals("N") || choice.equals("n")) {
						System.out.println("취소하셨습니다.");
						return;
					} else {
						System.out.println("잘못 선택하셨습니다 다시 선택하세요.");
					}
				}
			case "b":
				runSideType = false;
				break;
			default:
				System.out.println(sideType + "는(은) 없습니다 다시 선택하세요.");
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
