package com.human.ex1;

public class quize04 {

	public static void main(String[] args) {
		// 다섯 개의 정수를 입력받아 음수일 경우 양수로 변경하여 출력하는 프로그램을 만들어보자.
		int num1, num2, num3, num4, num5;
		java.util.Scanner ro=new java.util.Scanner(System.in);
		System.out.print("첫번재 정수를 입력하세요:");
		num1 = Integer.parseInt(ro.nextLine());
		if(num1>0) {
			System.out.println(num1*(-1));
		}else {
			System.out.println(num1*-(-1));
		}
		System.out.print("두번재 정수를 입력하세요:");
		num2 = Integer.parseInt(ro.nextLine());
		if(num2>0) {
			System.out.println(num2*(-1));
		}else {
			System.out.println(num2*-(-1));
		}
		System.out.print("세번재 정수를 입력하세요:");
		num3 = Integer.parseInt(ro.nextLine());
		if(num3>0) {
			System.out.println(num3*(-1));
		}else {
			System.out.println(num3*-(-1));
		}
		System.out.print("네번재 정수를 입력하세요:");
		num4 = Integer.parseInt(ro.nextLine());
		if(num4>0) {
			System.out.println(num4*(-1));
		}else {
			System.out.println(num4*-(-1));
		}
		System.out.print("다섯번재 정수를 입력하세요:");
		num5 = Integer.parseInt(ro.nextLine());
		if(num5>0) {
			System.out.println(num5*(-1));
		}else {
			System.out.println(num5*-(-1));
		}
	
	}

}
