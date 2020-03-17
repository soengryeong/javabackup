package com.human.ex1;

public class quize02 {

	public static void main(String[] args) {
		// 1부터 차례대로 더하여 사용자가 입력한 수를 넘을 경우 종료되는 break문 작성
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

