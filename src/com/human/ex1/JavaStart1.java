package com.human.ex1;

public class JavaStart1 {

	public static void main(String[] args) {
		/*다음과 같이 두 개의 정수를 입력받아 첫번째 수의 배수를 두번째 수만큼 출력하는 프로그램을 for문을 이용하여 작성하시오.
		 * --------------------------실행결과------------------------------------------
		 * 첫번째 숫자입력 : 5
		 * 두번째 숫자입력 : 7
		 * 5의 배수 6번 출력
		 * 5,10,15,20,25,30,35
		*/
		
		int sum=0;

		System.out.print("첫번째 숫자 입력:");
		java.util.Scanner rd=new java.util.Scanner(System.in);
		int num1= Integer.parseInt(rd.nextLine());
		System.out.print("두번째 숫자 입력:");
		java.util.Scanner re=new java.util.Scanner(System.in);
		int num2= Integer.parseInt(re.nextLine());
		System.out.println(num1+"의 배수"+num2+"번 출력");
		int a=0;
		for(int i=1; i<=num2; i++) {
			a=num1*i;
			System.out.println(a);
		}
		
	
	
		

	}
		

		
	}

