package com.iu.Food;

import java.util.Scanner;

public class FoodInput {
	public Food[] menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 수 입력");
		int count = sc.nextInt();
		Food[] foods = new Food[count];

		for(int i=0;i<foods.length;i++) {
			Food food = new Food();
			System.out.println("메뉴명 : ");
			food.name = sc.next();
			System.out.println("가격 : ");
			food.price = sc.nextInt();
			System.out.println("재고 ");
			food.stock = sc.nextInt();
			foods[i]=food;

		}
		return foods;
	}
}
