package com.human.ex1;

public class quiz01 {

	public static void main(String[] args) {
		// 아래와 같이 첫번째 문제 출력하시오.
		int total=100;
		while(true) {
			if(total>10) {
				break;
			}
			total = total-3;
		}
		System.out.println("합계는 %d\n", total);

	}

}
