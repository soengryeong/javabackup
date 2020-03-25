package com.human.ex;

public class classStart5 {
    public static double exchangeWonToDollor(double won, double rate, double tax) {
    	return won*(1=tax)/rate;
    	
    	
    }
    public static double exchangeDollorToWon(double dollar, double rate, double tax) {
    	return dollor*rate*(1-tax);
    	
    	
    }
    public static void display(String user, double rate, double tax
    		, double dollor, double rDollor, double won, double rWon) {
    	System.out.println("exUser:"+user);
		System.out.println("exTax:"+rate);
		System.out.println("dollor:"+tax);
		System.out.println("rdollor:"+rDollor);
		System.out.println("won:"+won);
		System.out.println("rwon:"+rWon);
    }
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
				rDollor1=exchangeDollorToWon(won1, exchageRate1, exchangeTax1);
				rDollor2=exchangeDollorToWon(won2, exchageRate2, exchangeTax2);
				rDollor3=exchangeDollorToWon(won3, exchageRate3, exchangeTax3);
				
				//exchangeDollorToWon
				rWon1=exchangeDollorToWon(dollor1, exchageRate1, exchangeTax1);
				rWon2=exchangeDollorToWon(dollor2, exchageRate2, exchangeTax2);
				rWon3=exchangeDollorToWon(dollor3, exchageRate3, exchangeTax3);
				
				display("1",exchageRate1, exchangeTax1, dollor1, rDollor1,
						won1, rWon1);
				display("2",exchageRate2, exchangeTax2, dollor2, rDollor2,
						won2, rWon2);
				display("3",exchageRate3, exchangeTax3, dollor3, rDollor3,
						won3, rWon3);
			
			 
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
