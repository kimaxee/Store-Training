package com.dg.chicken.proc;

import com.dg.chicken.data.Product;
import com.dg.chicken.list.OrderList;
import com.dg.chicken.list.ShoppingList;

public class OrderHistory {
	public void proc() {
		System.out.println("=======================");
		System.out.println("5.주문내역");
		System.out.println("-----------------------");
		int n = 1;
		for (Product p : OrderList.products) {
			System.out.print(n + ". ");
			p.info3();
			n++;
		}
		if (OrderList.products.size() == 0) {
			System.out.println("주문내역이 없습니다.");
			return;
		}
	}
}
