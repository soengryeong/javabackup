package com.human.ex1;

public class quize12 {

	public static void main(String[] args) {
		// ����ڷκ��� ���� x,y�� �Է¹޾Ƽ� x���� y������ ���� ���ϴ� ���α׷��� ������!
		int sum = 0;
		java.util.Scanner ro = new java.util.Scanner(System.in);
		System.out.print("��������:");
		int num1 = Integer.parseInt(ro.nextLine());
		System.out.print("��������:");
		int num2 = Integer.parseInt(ro.nextLine());
		for (int i = 0; i <= num2; i++) {
			sum += i;
		}
		System.out.println("sum of" + num1 + "to" + num2 + "=" + sum);
	}

}
