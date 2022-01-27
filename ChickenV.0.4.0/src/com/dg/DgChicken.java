package com.dg;

import java.util.ArrayList;
import java.util.Scanner;

import com.dg.chicken.data.Flavor;
import com.dg.chicken.data.Product;
import com.dg.chicken.diaplay.Title;
import com.dg.chicken.list.ChickenList;
import com.dg.chicken.list.DrinkList;
import com.dg.chicken.list.FlavorList;
import com.dg.chicken.list.OrderList;
import com.dg.chicken.list.SideList;
import com.dg.chicken.proc.Chicken;
import com.dg.chicken.proc.Drink;
import com.dg.chicken.proc.OrderHistory;
import com.dg.chicken.proc.Side;

public class DgChicken {

	public void proc() {
		System.out.println(Title.TITLE);
		Scanner sc = new Scanner(System.in);

		ChickenList.chickens = new ArrayList<Product>();
		ChickenList.list();

		SideList.sides = new ArrayList<Product>();
		SideList.list();

		DrinkList.drinks = new ArrayList<Product>();
		DrinkList.list();

		FlavorList.flavors = new ArrayList<Flavor>();
		FlavorList.list();

		OrderList.products = new ArrayList<Product>();

		boolean runMenu = true;
		while (runMenu) {
			System.out.print("\n메뉴를 입력하세요 : ( 1.치킨 | 2.사이드 | 3.음료 | 4.주문내역 )");
			String selectNo = sc.next();

			switch (selectNo) { // 메뉴 선택
			case "1": // 치킨
				Chicken chickenMenu = new Chicken();
				chickenMenu.proc(ChickenList.chickens);
				break;

			case "2": // 사이드
				Side sideMenu = new Side();
				sideMenu.proc(SideList.sides);
				break;

			case "3": // 음료
				Drink drinkMenu = new Drink();
				drinkMenu.proc(DrinkList.drinks);
				break;

			case "4": // 주문내역
				OrderHistory order = new OrderHistory();
				order.proc();
				break;

			default:
				System.out.println("잘못 선택하셨습니다 다시 선택하세요.");
			}
		}
	}
}
