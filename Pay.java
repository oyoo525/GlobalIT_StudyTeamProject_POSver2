package com.team.posinterface.GlobalIT_StudyTeamProject_POSver2;

import java.util.ArrayList;
import java.util.Scanner;

public class Pay {

	Pay() {};

	Card card = new Card("카드",0);
	Cash cash = new Cash("현금",0);
	
	public void choice() {

		System.out.println("결제수단을 선택해주세요.\n1.카드  2.현금");

		Scanner scan = new Scanner(System.in);
		String pay;
		pay = scan.next();
		switch(pay) {
			case "1" : case "카드" : case "카드결제" :
				card.pay();
				break;
			case "2" : case "현금" : case "현금결제" :
				cash.pay();
				break;
			default :
				return;
		}
	}
}
