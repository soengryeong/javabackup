package com.human.ex1;
import java.util.Scanner;

public class quize18 {

	public static void main(String[] args) {
		// ����ڷκ��� 1-50������ ���� 10���� �Է¹޾� ���ڸ�ŭ ��ǥ�� ����ϴ�
		// ���α׷��� ������ 
		while(true) {
		Scanner re=new Scanner(System.in);
		System.out.println("�����͸� �Է��ϼ���:");
		int num1 = Integer.parseInt(re.nextLine());
		for(int i=1; i<=num1; i++) {
			System.out.print("*");
		}
		}
		


	}

}
