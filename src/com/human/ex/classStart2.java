package com.human.ex;

import java.util.Scanner;



public class classStart2 {
	    public static double exchangeTax=0.05;
	    public static int exchangeRate=1200;
	
        double outcash=0; //ȯ�� �� �ݾ�
	
	    public static void ExchangeWonToDollar(double won) {
		double exchangeTax=0.05;
		int exchangeRate=1200;
		double outcash = won;
		double outcash1=won/exchangeRate*(1-exchangeTax);
		System.out.println("ȯ���� �޷���"+outcash1+"�Դϴ�");
	    }
		
		
		public static void ExchangeDollarToWon(double dollor) {
		double exchangeTax=0.05;
		int exchangeRate=1200;
		double outcash=dollor;
		double outcash1=dollor/exchangeRate*(1-exchangeTax);
		System.out.println("ȯ���� ��ȭ��"+outcash1+"�Դϴ�");
	   
	    //rDollor=won/exchageRate*(1-exchangeTax);
	    
	}
	public static void main(String[] args) {
	
		Scanner re=new Scanner(System.in);
		System.out.println("1. ��ȭ->�޷� 2.�޷�->��ȭ");
		int num1 = re.nextInt();
		if(num1==1) {
			System.out.println("��ȭ->�޷��� ȯ����û�ϼ̽��ϴ�.");
			System.out.println("ȯ���ϰ��� �ϴ� ��ȭ�ݾ��Է�:");
			double num2 = re.nextInt();
			ExchangeWonToDollar(num2);
		}
		if(num1==2) {
			double dollor;
			System.out.println("�޷�->��ȭ�� ȯ����û�ϼ̽��ϴ�.");
			System.out.println("ȯ���ϰ��� �ϴ� �޷��ݾ��Է�:");
			double num2 = re.nextInt();
			ExchangeDollarToWon(num2);
		}
		

		//ȯ��1,200 exchangeRate
		//ȯ���� 0.05 exchangeTax
		//������ 20�޷� dollor
		//��ȭ won
		//ȯ���ϴ� ���α׷��� �����غ���.
		//exchangeWonToDollar
		//exchangeDollarToWon


	}

}
