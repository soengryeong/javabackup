package com.human.ex1;

import java.util.Scanner;

public class quize19 {

	public static void main(String[] args) {
		// 한 숫자를 입력받아 그 숫자의 1부터 그 숫자의 제곱근까지의 값을 출력한다.
		int result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("n의 값을 입력하세요:");
		int num1 = Integer.parseInt(sc.nextLine());
		for(int i=0; i<=num1; i++) {
		result+= i*i;
		}
		System.out.println("계산값은"+result+"입니다");

		}


	}


