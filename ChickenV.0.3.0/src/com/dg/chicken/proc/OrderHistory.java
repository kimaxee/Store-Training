package com.dg.chicken.proc;

import java.util.Scanner;

import com.dg.chicken.data.Product;
import com.dg.chicken.list.OrdertList;

public class OrderHistory {
	Scanner sc = new Scanner(System.in);

	public void proc() {
		System.out.println("\n==============");
		System.out.println("4.주문내역");
		System.out.println("--------------");
		for (Product p : OrdertList.products) {
			p.info();
		}
		if (OrdertList.products.size() == 0) {
			System.out.println("주문내역이 없습니다.");
		} else {
			System.out.println("\n1.구매하기 b.뒤로가기 c.초기화");
			boolean runOrder = true;
			while (runOrder) {
				String choice = sc.next();
				switch (choice) {
				case "1":
					System.out.println("주문완료 했습니다.");
					runOrder = false;
					OrdertList.products.clear();
				case "b":
					runOrder = false;
					break;
				case "c":
					OrdertList.products.clear();
					runOrder = false;
					break;
				default:
					System.out.println("잘못 선택하셨습니다 다시 선택하세요.");
				}
			}
		}
	}
}
