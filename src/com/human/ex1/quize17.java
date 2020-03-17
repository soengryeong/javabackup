package com.human.ex1;

public class quize17 {

	public static void main(String[] args) {
		// 반복문을 이용하여 섭씨 1~100까지의 구간에 대하여 
		//10도 간격으로 섭씨온도로 환산하는 표를 작성해라
		System.out.println("=====================\n화씨온도\t\t섭씨온도\n=====================\n");
		for (int i = 1; i <= 100; i++) {
		double b = ((double) 5/9)*(i-32);
		if (i % 10 == 0) {
		String ans = String.format("%d \t\t %.1f", i, b);
		System.out.println(ans);
		}
		}
	}

}
