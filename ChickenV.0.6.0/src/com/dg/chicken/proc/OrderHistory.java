package com.dg.chicken.proc;

import com.dg.chicken.data.Product;
import com.dg.chicken.list.OrderList;

public class OrderHistory {
	public void proc() {
		System.out.println("=======================");
		System.out.println("5.주문내역");
		System.out.println("-----------------------");
		int n = 1;
		for (Product p : OrderList.products) {
			System.out.print(n + ". ");
			p.info();
			n++;
		}
	}
}
