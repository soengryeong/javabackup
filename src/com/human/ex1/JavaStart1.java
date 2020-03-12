package com.human.ex1;

public class JavaStart1 {

	public static void main(String[] args) {
		// 두 개의 정수를 입력 받아 두 수 사이 정수의 합을 구해라(두수포함)

		java.util.Scanner se=new java.util.Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요:");
		int num1 = Integer.parseInt(se.nextLine());
		System.out.println("두번째 정수를 입력하세요:");
		int num2 = Integer.parseInt(se.nextLine());
		
		int sum=0;
		
		for(int i= num1; i<=num2; ++i) {
			sum += i;
			
		}
		System.out.println("두 정수의 합은"+sum+"입니다");
	}
}
