package com.team.posinterface.GlobalIT_StudyTeamProject_POSver2;

public class Card extends Menu{

	public Card(String name, int price) {
		super(name, price);
	}

	@Override
	public void pay() {
		System.out.println("결제가 완료되었습니다");
		cart.clear();
	};
}
