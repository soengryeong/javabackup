package com.human.ex;

import java.util.Scanner;

public class JavaStart00 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String inputString="";
		int acount=0;

		while(!inputString.contentEquals("0")) {

		System.out.println("1.�Ա� 2.��� 3.��ȸ 0.����");
		System.out.print(">>");
		inputString=sc.next();

		switch(inputString) {
		case "1":
			System.out.println("�Ա� �ڳ��Դϴ�");
			System.out.println("�Ա��� �ݾ��� �Է����ּ���");
			int inmoney=sc.nextInt();
			acount+=inmoney;
			System.out.println("�Ա� �� �ܾ��� "+acount+"�� �Դϴ�.");
			break;
		case "2":
			System.out.println("��� �ڳ��Դϴ�");
			System.out.println("����� �ݾ��� �Է����ּ���");
			int outmoney=sc.nextInt();
			if(acount<outmoney) {
				System.out.println("�ܾ��� �����մϴ�.");
				}
				else {
				acount-=outmoney;}
			System.out.println("��� �� �ܾ��� "+acount+"�� �Դϴ�.");
			break;
		case "3":
			System.out.println("��ȸ �ڳ��Դϴ�");
			System.out.println("���� �ܾ��� "+acount+"�� �Դϴ�.");
			break;
		case "0":
			System.out.println("����Ǿ����ϴ�");
			break;
		default:
			break;
	
				
			
		}

	}

	
	}
}
