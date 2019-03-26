package com.iu.Food;

import java.util.Scanner;

public class FoodInput {
	public void menu() {
	Scanner sc = new Scanner(System.in);
	System.out.println("메뉴 입력");
	Food[] foods = new Food[3];
	
	for(int i=0;i<foods.length;i++) {
		Food food = new Food();
		System.out.println("메뉴명 : ");
		food.menu = sc.next();
		System.out.println("가격 : ");
		food.prince = sc.nextInt();
		System.out.println("재고 ");
		food.stock = sc.nextInt();
		foods[i]=food;
	}
	}
}
