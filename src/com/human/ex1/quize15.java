package com.human.ex1;
import java.util.Scanner;

public class quize15 {

	public static void main(String[] args) {
		// 사용자가 입력한 모든 약수를 출력하는 프로그램을 만드시오.
		Scanner re=new Scanner(System.in);
		System.out.println("정수를 입력하세요:");
		int num1 = Integer.parseInt(re.nextLine());
		int i;
		for(i=1; i<=num1; i++) {
			if((num1%i)==0) {
				System.out.println(i);
			}
		}

	}

}
