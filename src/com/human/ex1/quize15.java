package com.human.ex1;
import java.util.Scanner;

public class quize15 {

	public static void main(String[] args) {
		// ����ڰ� �Է��� ��� ����� ����ϴ� ���α׷��� ����ÿ�.
		Scanner re=new Scanner(System.in);
		System.out.println("������ �Է��ϼ���:");
		int num1 = Integer.parseInt(re.nextLine());
		int i;
		for(i=1; i<=num1; i++) {
			if((num1%i)==0) {
				System.out.println(i);
			}
		}

	}

}
