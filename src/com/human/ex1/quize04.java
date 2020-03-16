package com.human.ex1;

public class quize04 {

	public static void main(String[] args) {
		// 다섯 개의 정수를 입력받아 음수일 경우 양수로 변경하여 출력하는 프로그램을 만들어보자
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int num=0;
		int sum=0;
		while(num<5) {
		num++;
		System.out.printf("%d번째 정수를 입력하세요:",num);
		int input=sc.nextInt();
		sum=sum+input;
		}
		System.out.printf("합:"+sum);
		}

	}

