package com.team.posinterface.GlobalIT_StudyTeamProject_POSver2;

import java.util.ArrayList;
import java.util.Scanner;

public class Side extends Menu {
	
	public Side(String name, int price) {
		super(name,price);
	}

	@Override
	public void choice() {
		Side side1 = new Side("신발튀김\t", 45000);
		Side side2 = new Side("붐바스틱\t", 4600);
		Side side3 = new Side("달쉬브라운\t", 2000);
		
		ArrayList<Side> sides = new ArrayList<Side>();
		sides.add(side1);
		sides.add(side2);
		sides.add(side3);
		
		System.out.println("사이드를 선택하였습니다.\n주문하실 사이드를 선택해주세요.\n");
		for(int i = 0; i<= sides.size()-1; i++) {
			System.out.printf("%d. %s\t%,d원\n", (i+1), sides.get(i).getName(), sides.get(i).getPrice());
		}
		System.out.println("0. 뒤로가기");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		switch(num1) {
			case 1 : 
				menuPrint(side1);
				break;
			case 2 : 
				menuPrint(side2);
				break;
			case 3 : 
				menuPrint(side3);
				break;

			case 0 : 
				break;
			default : 
				System.err.println("잘못 선택했습니다. 다시 선택해 주세요.");
				
		}	
	}
}
