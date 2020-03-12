package com.human.ex;

import java.util.Scanner;

public class JavaStart00 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String inputString="";
		int acount=0;

		while(!inputString.contentEquals("0")) {

		System.out.println("1.입금 2.출금 3.조회 0.종료");
		System.out.print(">>");
		inputString=sc.next();

		switch(inputString) {
		case "1":
			System.out.println("입금 코너입니다");
			System.out.println("입금할 금액을 입력해주세요");
			int inmoney=sc.nextInt();
			acount+=inmoney;
			System.out.println("입금 후 잔액은 "+acount+"원 입니다.");
			break;
		case "2":
			System.out.println("출금 코너입니다");
			System.out.println("출금할 금액을 입력해주세요");
			int outmoney=sc.nextInt();
			if(acount<outmoney) {
				System.out.println("잔액이 부족합니다.");
				}
				else {
				acount-=outmoney;}
			System.out.println("출금 후 잔액은 "+acount+"원 입니다.");
			break;
		case "3":
			System.out.println("조회 코너입니다");
			System.out.println("현재 잔액은 "+acount+"원 입니다.");
			break;
		case "0":
			System.out.println("종료되었습니다");
			break;
		default:
			break;
	
				
			
		}

	}

	
	}
}
