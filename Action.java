package com.team.posinterface.GlobalIT_StudyTeamProject_POSver2;

import java.util.Scanner;

public class Action extends Menu {
	public Action(String name, int price) {
		super(name, price);
	}
	
	public static void main(String[] args) {

		Burger m1 = new Burger("햄버거메뉴",0, 0);
		Drink m2 = new Drink("음료메뉴",0);
		Side m3 = new Side("사이드메뉴",0);
		Pay m4 = new Pay();
	
		int option1 = 0;
		while(option1 != 4) {
			System.out.print("\tWelcome to \"골때리아\""
					+ "\n**** 원하시는 메뉴의 번호를 선택해주세요 ****"
					+ "\n1.햄버거\t 2.음료\t3.사이드\n");
			
			int sum = 0; // 총 결제금액
			if(!cart.isEmpty()) {
				System.out.print("4.결제하기\t 5.선택취소\t6.전체취소"
						+ "\n************ 주문 내역 ************\n");
				
				int index = 0;
				for(Menu m : cart) {
					System.out.printf(" %d. %s\t(%,d개) %,d원\n", index+1, cart.get(index).getName(), cart.get(index).getAmount(), cart.get(index).getPrice());
//					System.out.println(index+1 + "." + cart.get(index).getName() + "(" +cart.get(index).getAmount() +" 개)"+ "(" + cart.get(index).getPrice() + ")");
					sum += cart.get(index).getPrice();
					index++;
				}
				System.err.printf("*** 결제할 금액은 %,d원 입니다.***\n", sum);
			}
			
			
			Scanner scan = new Scanner(System.in);
			option1 = scan.nextInt();
			
			switch(option1) {
				case 1 :
					m1.choice();	
					break;
				case 2 : 
					m2.choice();
					break;	
				case 3 : 
					m3.choice();
					break;	
				case 4 : 
					if(sum == 0) {
						System.err.println("메뉴를 선택하지 않았습니다.");
					} else {
						m4.choice();
					}
					break;
				case 5 : 
					if(sum <=3) {
						System.out.println("잘못 선택했습니다. 다시 선택해주세요.");
					} else {
						cencel();
					}
					break;
				case 6 : 
					if(sum <=3) {
						System.out.println("잘못 선택했습니다. 다시 선택해주세요.");
					} else {
						cart.clear();
						System.out.println("주문하신 내역이 모두 취소되었습니다.");
					}
					break;
				default :
					System.out.println("잘못 선택했습니다. 다시 선택해주세요.");
			}	
		}
	}
}
