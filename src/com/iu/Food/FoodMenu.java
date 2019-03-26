package com.iu.Food;

import java.util.Scanner;

public class FoodMenu {
	public void input(Food [] foods) {
		Scanner sc = new Scanner(System.in);
		FoodInput menu = new FoodInput();
		System.out.println("1. 주문");
		System.out.println("2. 결산");
		int select = sc.nextInt();
		boolean check = true;
		int menu1=0;
		int menu2=0;
		int menu3=0;
		int mc1=0;
		int mc2=0;
		int mc3=0;
		if(select==1) {
			while(check) {
			for(int i=0;i<foods.length;i++) {
				System.out.println("\t메뉴\t 가격\t 재고\t");
				System.out.println(i+1+"\t"+foods[i].menu+"\t"+foods[i].prince+"\t"+foods[i].stock);
			}

			System.out.println("1. 라면 \t2.김밥\t3.떡볶이\t주문");
			int a =sc.nextInt();
			System.out.println("수량을 선택");
			int count = sc.nextInt();
			switch(a) {
			case 1:
				menu1 += foods[1].prince*count;
				foods[1].stock-= count;
				mc1 = mc1+count;
			break;
			case 2:
				
				menu2 += foods[2].prince*count;
				foods[2].stock-= count;
				mc2 = mc2+count;
				break;
			case 3:
				menu3 += foods[3].prince*count;
				foods[3].stock-= count;
				mc3=mc3+count;
				break;
				default:
					
			}
			System.out.println("다시 주문 하겠습니까");
			System.out.println("1.yes \t 2.no");
			int b= sc.nextInt();
			if(b==1) {
				
			}else {
				System.out.println("총 주문 내역");
				System.out.println("\t메뉴\t 가격\t \t");
				System.out.println("1\t"+foods[0].menu+"\t"+foods[0].prince+"\t"+foods[0].stock);
				System.out.println();
				check =!check;
			}
			}	
		}else {
			
		}
		
	}
}
