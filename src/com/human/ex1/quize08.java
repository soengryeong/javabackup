package com.human.ex1;

public class quize08 {

	public static void main(String[] args) {
		//���� ������ �Է¹ް� �� �հ踦 ����ϴ� �ڵ� �ۼ� (0�Է¹����� ����)
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���:");
		int a=0;
		int sum=0;
		while(true) {
			a = Integer.parseInt(sc.nextLine());
			sum = sum + a;
			if(a==0) break;
		}
		System.out.println("���� ���� �հ��"+sum+"�Դϴ�");
		sc.close();

	}

}
