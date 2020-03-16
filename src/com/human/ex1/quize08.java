package com.human.ex1;

public class quize08 {

	public static void main(String[] args) {
		//시험 점수를 입력받고 그 합계를 출력하는 코드 작성 (0입력받으면 종료)
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("시험 점수를 입력하세요:");
		int a=0;
		int sum=0;
		while(true) {
			a = Integer.parseInt(sc.nextLine());
			sum = sum + a;
			if(a==0) break;
		}
		System.out.println("시험 점수 합계는"+sum+"입니다");
		sc.close();

	}

}
