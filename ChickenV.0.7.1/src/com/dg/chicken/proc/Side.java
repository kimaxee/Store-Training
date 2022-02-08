package com.dg.chicken.proc;

import java.util.ArrayList;
import java.util.Scanner;

import com.dg.chicken.data.Product;
import com.dg.chicken.list.DrinkList;
import com.dg.chicken.list.ShoppingList;
import com.dg.chicken.list.SideList;

public class Side {
	Scanner sc = new Scanner(System.in);
	public static String sideType;
	public static String choice;
	public static boolean runChoice;

	public void proc(ArrayList<Product> sides) {
		System.out.println("=======================");
		System.out.println("2.사이드를 선택하셨습니다.");

		boolean runSideType = true;
		while (runSideType) {
			sdieChoice(sides);

			sideType = sc.next();
			switch (sideType) {
			case "1": // 감자튀김
				frenchFriesChoice();
				runSideType = false;
				break;
			case "2": // 새우튀김
				friedShrimpChoice();
				runSideType = false;
				break;
			case "3": // 치즈스틱
				cheeseStickChoice();
				runSideType = false;
				break;
			case "4": // 떡볶이
				tteokbokkiChoice();
				runSideType = false;
				break;
			case "b":
				runSideType = false;
				break;
			default:
				System.out.println(sideType + "는(은) 없습니다 다시 선택하세요.");
			}
		}
	}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	private void sdieChoice(ArrayList<Product> sides) { // 사이드 선택
		System.out.println("-----------------------");
		int n = 1;
		for (Product s : sides) {
			System.out.print(n + ". ");
			s.info();
			n++;
		}
		System.out.println("-----------------------");
		System.out.println("뒤로가기 : b");
		System.out.println("-----------------------");
		System.out.print("종류를 선택하세요 : ");
	}

	private void tteokbokkiChoice() { // 떡볶이 선택
		System.out.println("=======================");
		System.out.println(SideList.sides.get(3).getName() + "를 선택하셨습니다.");
		System.out.println("선택목록 담기(Y/N)");

		runChoice = true;
		while (runChoice) {
			choice = sc.next();
			if (choice.equals("Y") || choice.equals("y")) {
				ShoppingList.products.add(new SideList(SideList.sides.get(3).getCode(), SideList.sides.get(3).getName(),
						SideList.sides.get(3).getPrice(), SideList.sides.get(3).getEa()));
				System.out.println(SideList.sides.get(3).getName() + " 담기완료!");
				return;
			} else if (choice.equals("N") || choice.equals("n")) {
				System.out.println("취소하셨습니다.");
				return;
			} else {
				System.out.println("잘못 선택하셨습니다 다시 선택하세요.");
			}
		}
	}

	private void cheeseStickChoice() { // 치즈스틱 선택
		System.out.println("=======================");
		System.out.println(SideList.sides.get(2).getName() + "을 선택하셨습니다.");
		System.out.println("선택목록 담기(Y/N)");

		runChoice = true;
		while (runChoice) {
			choice = sc.next();
			if (choice.equals("Y") || choice.equals("y")) {
				ShoppingList.products.add(new SideList(SideList.sides.get(2).getCode(), SideList.sides.get(2).getName(),
						SideList.sides.get(2).getPrice(), SideList.sides.get(2).getEa()));
				System.out.println(SideList.sides.get(2).getName() + " 담기완료!");
				return;
			} else if (choice.equals("N") || choice.equals("n")) {
				System.out.println("취소하셨습니다.");
				return;
			} else {
				System.out.println("잘못 선택하셨습니다 다시 선택하세요.");
			}
		}
	}

	private void friedShrimpChoice() { // 새우튀김 선택
		System.out.println("=======================");
		System.out.println(SideList.sides.get(1).getName() + "을 선택하셨습니다.");
		System.out.println("선택목록 담기(Y/N)");

		runChoice = true;
		while (runChoice) {
			choice = sc.next();
			if (choice.equals("Y") || choice.equals("y")) {
				ShoppingList.products.add(new SideList(SideList.sides.get(1).getCode(), SideList.sides.get(1).getName(),
						SideList.sides.get(1).getPrice(), SideList.sides.get(1).getEa()));
				System.out.println(SideList.sides.get(1).getName() + " 담기완료!");
				return;
			} else if (choice.equals("N") || choice.equals("n")) {
				System.out.println("취소하셨습니다.");
				return;
			} else {
				System.out.println("잘못 선택하셨습니다 다시 선택하세요.");
			}
		}
	}

	private void frenchFriesChoice() { // 감자튀김 선택
		System.out.println("=======================");
		System.out.println(SideList.sides.get(0).getName() + "을 선택하셨습니다.");
		System.out.println("선택목록 담기(Y/N)");

		runChoice = true;
		while (runChoice) {
			choice = sc.next();
			if (choice.equals("Y") || choice.equals("y")) {
				ShoppingList.products.add(new SideList(SideList.sides.get(0).getCode(), SideList.sides.get(0).getName(),
						SideList.sides.get(0).getPrice(), SideList.sides.get(0).getEa()));
				System.out.println(SideList.sides.get(0).getName() + " 담기완료!");
				return;
			} else if (choice.equals("N") || choice.equals("n")) {
				System.out.println("취소하셨습니다.");
				return;
			} else {
				System.out.println("잘못 선택하셨습니다 다시 선택하세요.");
			}
		}
	}
}
