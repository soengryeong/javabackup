package com.human.ex1;

public class quize12 {

	public static void main(String[] args) {
		// 사용자로부터 정수 x,y를 입력받아서 x에서 y까지의 합을 구하는 프로그램을 만들어라!
		int sum = 0;
		java.util.Scanner ro = new java.util.Scanner(System.in);
		System.out.print("시작정수:");
		int num1 = Integer.parseInt(ro.nextLine());
		System.out.print("종료정수:");
		int num2 = Integer.parseInt(ro.nextLine());
		for (int i = 0; i <= num2; i++) {
			sum += i;
		}
		System.out.println("sum of" + num1 + "to" + num2 + "=" + sum);
	}

}
