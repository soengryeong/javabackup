package com.human.ex1;

public class quize13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("�����Է�>>");
		int user = sc.nextInt();
		int sum = 0;
		for (int i = 1;; i++) {
		sum = sum + i;
		if (sum > user) {
		break;
		} else {
		System.out.println(i + ":" + sum);
		}System.out.println("���α׷��� �����մϴ�");
		}
		}
		

	}

