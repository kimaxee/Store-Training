package com.dg;

import java.util.ArrayList;
import java.util.Scanner;

import com.dg.chicken.data.Product;
import com.dg.chicken.diaplay.Title;
import com.dg.chicken.list.ChickenList;
import com.dg.chicken.list.DrinkList;
import com.dg.chicken.list.FlavorList;
import com.dg.chicken.list.SideList;
import com.dg.chicken.menu.Seasoning;
import com.dg.chicken.proc.ChickenMenu;
import com.dg.chicken.proc.DrinkMenu;
import com.dg.chicken.proc.SideMenu;

public class DgChicken {
	String name;
	String taste;

	public void proc() {
		System.out.println(Title.TITLE);
		Scanner sc = new Scanner(System.in);

		ArrayList<Product> chickens = new ArrayList<Product>();
		ChickenList chickenList = new ChickenList();
		chickenList.list(chickens);

		ArrayList<Product> sides = new ArrayList<Product>();
		SideList sideList = new SideList();
		sideList.list(sides);

		ArrayList<Product> drinks = new ArrayList<Product>();
		DrinkList drinkList = new DrinkList();
		drinkList.list(drinks);

		ArrayList<Product> flavors = new ArrayList<Product>();
		FlavorList flavorList = new FlavorList();
		flavorList.list(flavors);

		boolean run = true;
		while (run) {
			System.out.print("\n메뉴를 입력하세요 : ( 1.치킨정보 | 2.사이드정보 | 3.음료정보 | 4.주문내역 )");
			String selectNo = sc.next();
			
			switch (selectNo) { // 메뉴 선택
			case "1": // 치킨정보
				ChickenMenu chickenMenu = new ChickenMenu();
				chickenMenu.proc(chickens);
				break;
			
			case "2": // 사이드 정보
				SideMenu sideMenu = new SideMenu();
				sideMenu.proc(sides);
				break;
				
			case "3": // 음료 정보
				DrinkMenu drinkMenu = new DrinkMenu();
				drinkMenu.proc(drinks);
				break;

			case "4": // 주문내역
				System.out.println("\n=======================");
				System.out.println("4.주문내역을 선택하셨습니다.");
				System.out.println("-----------------------");
				break;

			default:
				System.out.println("잘못 선택하셨습니다 다시 선택하세요.");
			}
		}
	}
}
