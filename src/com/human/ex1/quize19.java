package com.human.ex1;

import java.util.Scanner;

public class quize19 {

	public static void main(String[] args) {
		// �� ���ڸ� �Է¹޾� �� ������ 1���� �� ������ �����ٱ����� ���� ����Ѵ�.
		int result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("n�� ���� �Է��ϼ���:");
		int num1 = Integer.parseInt(sc.nextLine());
		for(int i=0; i<=num1; i++) {
		result+= i*i;
		}
		System.out.println("��갪��"+result+"�Դϴ�");

		}


	}


