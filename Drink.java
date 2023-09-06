package com.team.posinterface.GlobalIT_StudyTeamProject_POSver2;

import java.util.ArrayList;
import java.util.Scanner;

public class Drink extends Menu {

	public Drink(String name, int price) {
		super(name, price);
	}

	@Override
	public void choice() {
		Drink drink1 = new Drink("발렌타인 30년산", 1000000);
		Drink drink2 = new Drink("민트초코에이드", 3500);
		Drink drink3 = new Drink("복숭아독차\t", 112000);
		Drink drink4 = new Drink("막걸리\t", 5000);
		
		ArrayList<Drink> drinks = new ArrayList<Drink>(); 
		drinks.add(drink1);
		drinks.add(drink2);
		drinks.add(drink3);
		drinks.add(drink4);
		
		System.out.println("음료를 선택하였습니다.\n주문하실 음료의 번호를 선택해주세요.");
		for(int i = 0; i<= drinks.size()-1; i++) {
			System.out.printf("%d. %s\t%,d원\n", (i+1), drinks.get(i).getName(), drinks.get(i).getPrice());
		}
		System.out.println("0. 뒤로가기");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		switch(num1) {
			case 1 : 
				menuPrint(drink1);
				break;
			case 2 : 
				menuPrint(drink2);
				break;
			case 3 : 
				menuPrint(drink3);
				break;
			case 4 : 
				menuPrint(drink4);
				break;

			case 0 : 
				break;
			default : 
				System.err.println("잘못 선택했습니다. 다시 선택해 주세요.");
				
		}
	}
}
