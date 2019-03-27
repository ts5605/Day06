
package com.iu.Food;

import java.util.Scanner;

public class FoodMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Food food = new Food();
		FoodInput fi = new FoodInput();
		FoodMenu fm2 = new FoodMenu();
		FoodView fv2 = new FoodView();
		boolean check = true;
		
		Food[] foods = fi.menu();
		while(check){
		
		System.out.println("1. 주문");
		System.out.println("2. 결산");
		int select = sc.nextInt();
		if (select == 1) {
			fm2.input(foods);
			
		}else {
			fv2.view(foods, fm2.mc);
			check = !check;
			break;
		}
		}

	}

}