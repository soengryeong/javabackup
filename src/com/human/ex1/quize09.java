package com.human.ex1;

public class quize09 {

	public static void main(String[] args) {
		// 1부터 입력한 숫자까지 덧셈하는 프로그램을 구현하시오.
		java.util.Scanner re = new java.util.Scanner(System.in);
		System.out.println("1부터 덧셈하는 프로그램입니다.\n마지막 값을 입력하세요. \n1부터 =>");
		int a = re.nextInt();
		System.out.println("1부터" + a + "까지 덧셈합니다");
		int sum = 0;

		for (int i = 1; i <= a; i++) {
			sum = sum + i;
			String ans = String.format("[%d]행 TotalNumber의 값 : %d",i-1,sum);
			System.out.println(ans);

		}
		System.out.println("\n1부터 "+a+"까지의 총합은"+sum+"입니다");
		re.close();

	}

}
