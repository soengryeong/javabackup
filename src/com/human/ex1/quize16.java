package com.human.ex1;
import java.util.Scanner;

public class quize16 {

	public static void main(String[] args) {
		// 구구단을 입력받아 역순으로 출력하는 프로그램 만들기(for문이용)
		Scanner re=new Scanner(System.in);
		System.out.println("출력할 구구단을 입력하세요:");
		int num1 = Integer.parseInt(re.nextLine());
		for(int e=9;e>=1;e--)      
			System.out.println(num1+"*"+e+" = " +num1*e);
	}
}
