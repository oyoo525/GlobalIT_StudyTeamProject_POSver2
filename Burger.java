package com.team.posinterface.GlobalIT_StudyTeamProject_POSver2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Burger extends Menu {

	public Burger(String name, int price) {
		super(name, price);
	}
	public Burger(String name, int price, int amount) {
		super(name, price, amount);
	}
	
	
	
	@Override
	public void choice() {
		
		Burger burger1 = new Burger("물고기버거\t", 14000);
		Burger burger2 = new Burger("냉크리스피버거", 7600);
		Burger burger3 = new Burger("치약락스버거", 75000);
		Burger burger4 = new Burger("아프리칸버거", 29800);
		Burger burger5 = new Burger("구제버거\t", 100);
		
		ArrayList<Burger> burgers = new ArrayList<Burger>(); 
		burgers.add(burger1);
		burgers.add(burger2);
		burgers.add(burger3);
		burgers.add(burger4);
		burgers.add(burger5);
		
		System.out.println("햄버거를 선택하였습니다.\n주문하실 버거의 번호를 선택해주세요.\n");
		for(int i = 0; i<= burgers.size()-1; i++) {
			System.out.printf("%d. %s\t%,d원\n", (i+1), burgers.get(i).getName(), burgers.get(i).getPrice());
		}
		System.out.println("0. 뒤로가기");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		switch(num1) {
			case 1 : 
				menuPrint(burger1);
				break;
			case 2 : 
				menuPrint(burger2);
				break;
			case 3 : 
				menuPrint(burger3);
				break;
			case 4 : 
				menuPrint(burger4);
				break;
			case 5 : 
				menuPrint(burger5);
				break;
			case 0 : 
				break;
			default : 
				System.err.println("잘못 선택했습니다. 다시 선택해 주세요.");
				
		}
	}


}
