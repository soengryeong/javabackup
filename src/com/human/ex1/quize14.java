package com.human.ex1;
import java.util.*;

public class quize14 {

	public static void main(String[] args) {
		// 소수인지 아닌지. 값을 하나 입력받아서 
				// 소수의 의미란? 1과 자기 자신이 유일하게 나눠지는 수
				// 1,2,3,5,7,
				Scanner sc=new Scanner(System.in);
				System.out.println("사용자 소수 입력>>");
				int inputNumber=Integer.parseInt(sc.nextLine());
				boolean isOk=true;
				
				for(int i=2; i<inputNumber; i++) {
					if(inputNumber%i==0) {
						isOk=false;
						break;
					}
				}
				
				if(isOk==true) {
					System.out.println("소수입니다");
				}else {
					System.out.println("소수가 아닙니다.");
				}

	}

}
