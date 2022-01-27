package com.dg.chicken.proc;

import java.util.Scanner;

import com.dg.chicken.data.Product;
import com.dg.chicken.list.ChickenList;
import com.dg.chicken.list.OrderList;

public class OrderHistory {
	Scanner sc = new Scanner(System.in);
	public static int n = 1;
	public static int i = 1;

	public void proc() {
		System.out.println("=======================");
		System.out.println("4.주문내역");
		boolean runOrder = true;
		while (runOrder) {
			System.out.println("-----------------------");
			n = 1;
			for (Product p : OrderList.products) {
				System.out.print(n + ". ");
				p.info();
				n++;
			}

			if (OrderList.products.size() > 0) {
				System.out.println("-----------------------");
				int sum = 0;
				for (Product p : OrderList.products) {
					sum += p.getPrice();
				}
				System.out.println("총금액 : " + sum + "원");
			}
			if (OrderList.products.size() == 0) {
				System.out.println("주문내역이 없습니다.");
				break;
			} else {
				System.out.print("\n1.주문하기 2.삭제하기 b.뒤로가기 c.초기화");
			}

			String choice = sc.next();
			switch (choice) {
			case "1": // 주문하기
				System.out.println("주문완료 했습니다.");
				OrderList.products.clear();
				runOrder = false;
				break;
			case "2": // 삭제하기
				deleteChoice();
				break;
			case "b": // 뒤로가기
				runOrder = false;
				break;
			case "c": // 초기화
				System.out.println("초기화 되었습니다.");
				OrderList.products.clear();
				runOrder = false;
				break;
			default:
				System.out.println("잘못 선택하셨습니다 다시 선택하세요.");
			}
		}
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	private void deleteChoice() { // 삭제하기 선택
		boolean delOrder = true;
		while (delOrder) {
			System.out.println("-----------------------");
			System.out.println("b.뒤로가기");
			System.out.print("삭제할 상품 이름입력 : ");

			String deleteProducts = sc.next();
			int delIndex = -1;

			for (i = 0; i < OrderList.products.size(); i++) {
				if (OrderList.products.get(i).getName().equals(deleteProducts)) {
					delIndex = i;
					break;
				}
			}

			if (deleteProducts.equals("b")) {
				delOrder = false;
				break;
			} else if (delIndex == -1) {
				System.out.println("\n잘못 선택하셨습니다 다시 선택하세요.");
				System.out.println("-----------------------");
				n = 1;
				for (Product p : OrderList.products) {
					System.out.print(n + ". ");
					p.info();
					n++;
				}
			} else {
				OrderList.products.remove(delIndex);
				System.out.println("삭제되었습니다.");
				delOrder = false;
				break;
			}
		}		
	}
}
