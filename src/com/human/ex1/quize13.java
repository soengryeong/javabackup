package com.human.ex1;

public class quize13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("숫자입력>>");
		int user = sc.nextInt();
		int sum = 0;
		for (int i = 1;; i++) {
		sum = sum + i;
		if (sum > user) {
		break;
		} else {
		System.out.println(i + ":" + sum);
		}System.out.println("프로그램을 종료합니다");
		}
		}
		

	}

