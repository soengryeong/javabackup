package com.human.ex;

public class classStart4 {

	public static void main(String[] args) {
		// 절차적 3명이 환전
		// 절차적 
		double exchageRate1=1200,exchageRate2=1200,exchageRate3=1200;
		double exchangeTax1=0.05,exchangeTax2=0.05,exchangeTax3=0.05;
		double dollor1=20,dollor2=30,dollor3=40;
		double won1=20000,won2=30000,won3=40000;
		double rDollor1=0,rDollor2=0,rDollor3=0;
		double rWon1=0,rWon2=0,rWon3=0;
				
		//exchageWonToDollar
		rDollor1=won1/exchageRate1*(1-exchangeTax1);
		rDollor2=won2/exchageRate2*(1-exchangeTax2);
		rDollor3=won3/exchageRate3*(1-exchangeTax3);
		//exchangeDollorToWon
		rWon1=dollor1*exchageRate1*(1-exchangeTax1);
		rWon2=dollor2*exchageRate2*(1-exchangeTax2);
		rWon3=dollor3*exchageRate3*(1-exchangeTax3);
				
		System.out.println("exUser1:"+exchageRate1);
		System.out.println("exTax:"+exchangeTax1);
		System.out.println("dollor:"+dollor1);
		System.out.println("rdollor:"+rDollor1);
		System.out.println("won:"+won1);
		System.out.println("rwon:"+rWon1);
		System.out.println("-------------------------------------");
		
		System.out.println("exUser2:"+exchageRate2);
		System.out.println("exTax:"+exchangeTax2);
		System.out.println("dollor:"+dollor2);
		System.out.println("rdollor:"+rDollor2);
		System.out.println("won:"+won2);
		System.out.println("rwon:"+rWon2);
		System.out.println("-------------------------------------");
		
		System.out.println("exUser3:"+exchageRate3);
		System.out.println("exTax:"+exchangeTax3);
		System.out.println("dollor:"+dollor3);
		System.out.println("rdollor:"+rDollor3);
		System.out.println("won:"+won3);
		System.out.println("rwon:"+rWon3);
				
				
		//환율 1,200 exchageRate
		//환전세 0.05 exchangeTax
				

	}

}
