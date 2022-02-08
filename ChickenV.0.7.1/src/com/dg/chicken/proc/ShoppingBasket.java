package com.dg.chicken.proc;

import java.util.Scanner;

import com.dg.chicken.data.Product;
import com.dg.chicken.list.ChickenList;
import com.dg.chicken.list.OrderList;
import com.dg.chicken.list.ShoppingList;

public class ShoppingBasket {
	Scanner sc = new Scanner(System.in);
	public static String choice;
	public static int n = 1;
	public static int i = 1;

	public void proc() {
		System.out.println("=======================");
		System.out.println("4.장바구니");
		boolean runBasket = true;
		while (runBasket) {
			basketChoice();
			if (ShoppingList.products.size() == 0) {
				System.out.println("장바구니에 담긴 상품이 없습니다.");
				break;
			} else {
				System.out.print("\n1.주문하기 2.삭제하기 b.뒤로가기 c.초기화");
			}

			choice = sc.next();
			switch (choice) {
			case "1": // 주문하기
				orderChoice();
				runBasket = false;
				break;
			case "2": // 삭제하기
				deleteChoice();
				break;
			case "b": // 뒤로가기
				runBasket = false;
				break;
			case "c": // 초기화
				System.out.println("초기화 되었습니다.");
				ShoppingList.products.clear();
				runBasket = false;
				break;
			default:
				System.out.println("잘못 선택하셨습니다 다시 선택하세요.");
			}
		}
	}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	private void basketChoice() { // 장바구니 선택
		System.out.println("-----------------------");
		n = 1;
		for (Product p : ShoppingList.products) {
			System.out.print(n + ". ");
			p.info2();
			n++;
		}

		if (ShoppingList.products.size() > 0) {
			System.out.println("-----------------------");
			int sum = 0;
			for (Product p : ShoppingList.products) {
				sum += p.getPrice();
			}
			System.out.println("총금액 : " + sum + "원");
		}
	}

	private void orderChoice() { // 주문하기 선택
		boolean runOrder = true;
		while (runOrder) {
			System.out.print("결제 하기(Y/N)");

			choice = sc.next();
			if (choice.equals("Y") || choice.equals("y")) {
				System.out.println("-----------------------");
				for (Product p : ShoppingList.products) {
					p.info2();
				}

				int sum = 0;
				for (Product p : ShoppingList.products) {
					sum += p.getPrice();
				}
				System.out.println("-----------------------");
				System.out.println("총금액 : " + sum + "원");
				System.out.println("=======================");
				System.out.println("결제가 완료되었습니다.");
				OrderList.products.addAll(ShoppingList.products);
				ShoppingList.products.clear();
				return;
			} else if (choice.equals("N") || choice.equals("n")) {
				System.out.println("취소하셨습니다.");
				return;
			} else {
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
			System.out.print("삭제할 상품 번호입력 : ");

			String deleteProducts = sc.next();

			if (deleteProducts.equals("b")) {
				delOrder = false;
				break;
			} else if (Integer.parseInt(deleteProducts) > 0
					&& ShoppingList.products.size() >= Integer.parseInt(deleteProducts)) {
				Product d = ShoppingList.products.remove(Integer.parseInt(deleteProducts) - 1);
				System.out.println(d.getName() + "이(가) 삭제되었습니다.");
				delOrder = false;
				break;
			} else {
				System.out.println("\n잘못 선택하셨습니다 다시 선택하세요.");
				System.out.println("-----------------------");
				n = 1;
				for (Product p : ShoppingList.products) {
					System.out.print(n + ". ");
					p.info2();
					n++;
				}
			}
		}
	}
}
