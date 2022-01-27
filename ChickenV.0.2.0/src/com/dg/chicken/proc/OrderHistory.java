package com.dg.chicken.proc;

import com.dg.chicken.data.Product;
import com.dg.chicken.list.OrdertList;

public class OrderHistory {
	public void proc() {
		System.out.println("\n=========");
		System.out.println("4.주문내역");
		System.out.println("---------");
		if(OrdertList.products.size() == 0) {
			System.out.println("주문내역이 없습니다.");
		}
		for (Product p : OrdertList.products) {
			p.info();
		}
	}
}
