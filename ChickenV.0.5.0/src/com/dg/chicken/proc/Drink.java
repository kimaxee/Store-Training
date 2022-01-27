package com.dg.chicken.proc;

import java.util.ArrayList;
import java.util.Scanner;

import com.dg.chicken.data.Product;
import com.dg.chicken.list.ChickenList;
import com.dg.chicken.list.DrinkList;
import com.dg.chicken.list.OrderList;

public class Drink {
	Scanner sc = new Scanner(System.in);
	public static String drinkType;
	public static String choice;
	public static boolean runChoice;
	
	public void proc(ArrayList<Product> drinks) {
		System.out.println("=======================");
		System.out.println("3.음료를 선택하셨습니다.");
		boolean runDrinkType = true;
		while (runDrinkType) {
			System.out.println("-----------------------");
			int n = 1;
			for (Product d : drinks) {
				System.out.print(n + ". ");
				d.info();
				n++;
			}
			System.out.println("-----------------------");
			System.out.println("뒤로가기 : b");
			System.out.println("-----------------------");
			System.out.print("종류를 선택하세요 : ");
			
			drinkType = sc.next();
			switch (drinkType) {
			case "1": //콜라
				cokeChoice();
				runDrinkType = false;
				break;
			case "2": //사이다
				ciderChoice();
				runDrinkType = false;
				break;
			case "3": //생맥주
				draftBeerChoice();
				runDrinkType = false;
				break;
			case "b":
				runDrinkType = false;
				break;
			default:
				System.out.println(drinkType + "는(은) 없습니다 다시 선택하세요.");
			}
		}
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	private void draftBeerChoice() {
		System.out.println("=======================");
		System.out.println(DrinkList.drinks.get(2).getName() + "를 선택하셨습니다.");
		System.out.print("주문목록 담기(Y/N)");
		
		runChoice = true;
		while(runChoice) {
		choice = sc.next();
			if (choice.equals("Y") || choice.equals("y")) {
				OrderList.products.add(new Product(DrinkList.drinks.get(2).getName(), DrinkList.drinks.get(2).getPrice()));
				System.out.println(DrinkList.drinks.get(2).getName() + " 담기완료!");
				return; 
			} else if (choice.equals("N") || choice.equals("n")) {
				System.out.println("취소하셨습니다.");
				return;
			} else {
				System.out.println("잘못 선택하셨습니다 다시 선택하세요.");
			}
		}		
	}

	private void ciderChoice() {
		System.out.println("=======================");
		System.out.println(DrinkList.drinks.get(1).getName() + "를 선택하셨습니다.");
		System.out.print("주문목록 담기(Y/N)");
		
		runChoice = true;
		while(runChoice) {
		choice = sc.next();
			if (choice.equals("Y") || choice.equals("y")) {
				OrderList.products.add(new Product(DrinkList.drinks.get(1).getName(), DrinkList.drinks.get(1).getPrice()));
				System.out.println(DrinkList.drinks.get(1).getName() + " 담기완료!");
				return; 
			} else if (choice.equals("N") || choice.equals("n")) {
				System.out.println("취소하셨습니다.");
				return;
			} else {
				System.out.println("잘못 선택하셨습니다 다시 선택하세요.");
			}
		}		
	}

	private void cokeChoice() {
		System.out.println("=======================");
		System.out.println(DrinkList.drinks.get(0).getName() + "를 선택하셨습니다.");
		System.out.print("주문목록 담기(Y/N)");
		
		runChoice = true;
		while(runChoice) {
		choice = sc.next();
			if (choice.equals("Y") || choice.equals("y")) {
				OrderList.products.add(new Product(DrinkList.drinks.get(0).getName(), DrinkList.drinks.get(0).getPrice()));
				System.out.println(DrinkList.drinks.get(0).getName() + " 담기완료!");
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
