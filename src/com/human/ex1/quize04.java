package com.human.ex1;

public class quize04 {

	public static void main(String[] args) {
		// �ټ� ���� ������ �Է¹޾� ������ ��� ����� �����Ͽ� ����ϴ� ���α׷��� ������
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int num=0;
		int sum=0;
		while(num<5) {
		num++;
		System.out.printf("%d��° ������ �Է��ϼ���:",num);
		int input=sc.nextInt();
		sum=sum+input;
		}
		System.out.printf("��:"+sum);
		}

	}

