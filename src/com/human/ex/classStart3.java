package com.human.ex;

public class classStart3 {

	public static void main(String[] args) {
		// ������ 1�� ȯ��
		double exchageRate=1200;
		double exchangeTax=0.05;
		double dollor=20;
		double won=20000;
		double rDollor=0;
		double rWon=0;
		
		//exchageWonToDollar
		rDollor=won/exchageRate*(1-exchangeTax);
		//exchangeDollorToWon
		rWon=dollor*exchageRate*(1-exchangeTax);
		
		System.out.println("exRate:"+exchageRate);
		System.out.println("exTax:"+exchangeTax);
		System.out.println("dollor:"+dollor);
		System.out.println("rdollor:"+rDollor);
		System.out.println("won:"+won);
		System.out.println("rwon:"+rWon);
		
		
		//ȯ�� 1,200 exchageRate
		//ȯ���� 0.05 exchangeTax

	}

}
