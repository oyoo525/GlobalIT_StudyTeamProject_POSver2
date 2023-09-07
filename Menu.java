package com.team.posinterface.GlobalIT_StudyTeamProject_POSver2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Menu implements Choice{

	private String name;
	private int price;
	private int amount;
	
	static ArrayList<Menu> cart = new ArrayList<Menu>();
	static HashMap<Menu, Integer> cart2 = new HashMap<>();
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public Menu(String name, int price, int amount) {
		this.name = name;
		this.price = price;
		this.setAmount(amount);
	}
	
	@Override
	public void choice() {}
	@Override
	public void pay() {}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public void menuPrint() {}
	public void menuPrint(Menu a) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\" "+ a.getName() + " \"의 주문수량을 입력해주세요.");
		int amount = scan.nextInt();
		Menu newOption = new Menu(a.getName(), a.getPrice()*amount, amount);
		
		if(cart.isEmpty()) {
			cart.add(newOption);
		} else {
			cart.add(newOption);
			int index = cart.size();
			for (int i = 0; i < cart.size()-1; i++) {
				if(cart.get(i).getName().equals(a.getName())) {
					Menu plus = new Menu(cart.get(i).getName(), 
							cart.get(i).getPrice()+newOption.getPrice(), 
							cart.get(i).getAmount()+newOption.getAmount());
					cart.set(i, (Menu)plus);
					cart.remove(index-1);
				}
			}	
		}
	}
	
	static public void cencel() {
		System.out.println("취소할 메뉴의 번호를 선택해주세요.");
		Scanner scan = new Scanner(System.in);
		int cencelNum = scan.nextInt();
		System.out.println(cart.get(cencelNum-1).getName() + " 메뉴가 삭제되었습니다.");
		cart.remove(cencelNum-1);
	}

	
}
