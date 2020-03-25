package com.human.ex;

import java.util.Scanner;



public class classStart2 {
	    public static double exchangeTax=0.05;
	    public static int exchangeRate=1200;
	
        double outcash=0; //환전 후 금액
	
	    public static void ExchangeWonToDollar(double won) {
		double exchangeTax=0.05;
		int exchangeRate=1200;
		double outcash = won;
		double outcash1=won/exchangeRate*(1-exchangeTax);
		System.out.println("환전된 달러는"+outcash1+"입니다");
	    }
		
		
		public static void ExchangeDollarToWon(double dollor) {
		double exchangeTax=0.05;
		int exchangeRate=1200;
		double outcash=dollor;
		double outcash1=dollor/exchangeRate*(1-exchangeTax);
		System.out.println("환전된 원화는"+outcash1+"입니다");
	   
	    //rDollor=won/exchageRate*(1-exchangeTax);
	    
	}
	public static void main(String[] args) {
	
		Scanner re=new Scanner(System.in);
		System.out.println("1. 원화->달러 2.달러->원화");
		int num1 = re.nextInt();
		if(num1==1) {
			System.out.println("원화->달러로 환전요청하셨습니다.");
			System.out.println("환전하고자 하는 원화금액입력:");
			double num2 = re.nextInt();
			ExchangeWonToDollar(num2);
		}
		if(num1==2) {
			double dollor;
			System.out.println("달러->원화로 환전요청하셨습니다.");
			System.out.println("환전하고자 하는 달러금액입력:");
			double num2 = re.nextInt();
			ExchangeDollarToWon(num2);
		}
		

		//환율1,200 exchangeRate
		//환전세 0.05 exchangeTax
		//소지금 20달러 dollor
		//원화 won
		//환전하는 프로그램을 구현해보자.
		//exchangeWonToDollar
		//exchangeDollarToWon


	}

}
