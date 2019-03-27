
package com.iu.Food;

public class FoodView {
	public void view(Food[] foods, int mc[]) {
		FoodMenu fm2 = new FoodMenu();
		int sum=0;
		System.out.println("하루 판매량");
		for(int i=0; i<foods.length; i++) {
			System.out.println(foods[i].name + " : " + mc[i]*foods[i].price);
			sum+=mc[i]*foods[i].price;
		}
		System.out.println("총 합계 : " + sum);
	}
}