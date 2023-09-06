package com.team.posinterface.GlobalIT_StudyTeamProject_POSver2;

import java.util.Scanner;

public class Cash extends Menu{

	public Cash(String name, int price) {
		super(name, price);
	}

	@Override
	public void pay() {
		System.out.println("지불할 금액을 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		int money = 0;
		money = scan.nextInt();
		int index = 0;
		int sum = 0;
		for(Menu m : cart) {
			sum += cart.get(index).getPrice();
			index++;
		}
		if(sum-money == 0) {
			System.out.println("결제가 완료되었습니다.");
			cart.clear();
		} else if (sum-money < 0) {
			System.out.printf("결제가 완료되었습니다.\n거스름돈 %,d원 입니다.\n", money - sum);
			cart.clear();
		} else if (sum-money > 0) {
			System.out.printf("결제금액이 %,d원 부족합니다.\n",sum - money);
			System.out.println("추가 지불하실 금액을 입력해주세요.");
			int low = sum-money; 
			int add = 0;
			while (low != 0) {
				low = low-add;
				Scanner scan2 = new Scanner(System.in);	
				add = scan2.nextInt();
				if(low > add) {
					System.out.printf("결제금액이 %,d원 부족합니다.", low - add);
					System.out.println("추가 지불하실 금액을 입력해주세요.");	
				} else if(low == add) {
					System.out.println("결제가 완료되었습니다.");
					break;
				} else if (low < add) {
					System.out.printf("결제가 완료되었습니다.\n거스름돈 %,d원 입니다.", add - low);
					break;
				}
				continue;
			}
			cart.clear();
		}
	}
}
