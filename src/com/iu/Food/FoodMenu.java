package com.iu.Food;

import java.util.Scanner;

public class FoodMenu {
	int mc[];
	int m[];
	public void input(Food [] foods) {
		Scanner sc = new Scanner(System.in);
		FoodInput menu = new FoodInput();
		boolean check = true;
		mc = new int[foods.length];
		m = new int[foods.length];
		int count = 0;
		while(check) {	
			System.out.println("메뉴\t가격\t재고");
			for(int i=0; i<foods.length; i++) {
				System.out.println(foods[i].name + "\t" + foods[i].price + "\t" + foods[i].stock);
			}
			System.out.println("========================");
			for(int i=0; i<foods.length; i++) {
				System.out.println(i+1 + "번 " + foods[i].name);
			}
			System.out.println(foods.length+1 + "번 결제");
			System.out.println("=======================");
			int select = sc.nextInt();
			if(select<=foods.length) {
				System.out.println("주문 수량");
				count = sc.nextInt();
				for(int i=0; i<foods.length; i++) {
					if(select-1 == i) {
						if(foods[i].stock>=count) {
							foods[i].stock -= count;
							mc[i] += count;
							m[i] = count;
						}else
							System.out.println("재고가 충분하지 않습니다.");
						break;
					}
				}
			}
			else {
				for(int i=0; i<foods.length; i++) {
					if(m[i] != 0) {
						System.out.println(foods[i].name + " " + m[i] + "인분" + "\t" + m[i]*foods[i].price + "원");				
					}
					check = !check;
					break;
				}
			}		
		}
	}
}