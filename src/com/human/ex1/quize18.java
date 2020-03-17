package com.human.ex1;
import java.util.Scanner;

public class quize18 {

	public static void main(String[] args) {
		// 사용자로부터 1-50사이의 숫자 10개를 입력받아 숫자만큼 별표를 출력하는
		// 프로그램을 만들어보자 
		while(true) {
		Scanner re=new Scanner(System.in);
		System.out.println("데이터를 입력하세요:");
		int num1 = Integer.parseInt(re.nextLine());
		for(int i=1; i<=num1; i++) {
			System.out.print("*");
		}
		}
		


	}

}
