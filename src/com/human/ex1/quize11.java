package com.human.ex1;

public class quize11 {

	public static void main(String[] args) {
		// 사용자로부터 반복횟수를 입력받아 그 수 만큼 안녕하세요 출력하는 프로그램을 만드세요.
		java.util.Scanner re=new java.util.Scanner(System.in);
		System.out.println("몇 번이나 반복할까요?");
		int num1 = Integer.parseInt(re.nextLine());
		for(int i=1; i<=num1 ; i++) {
			System.out.println("안녕하세요");
		}
	

	}
}
