package com.human.ex1;
import java.util.Scanner;

public class quize16 {

	public static void main(String[] args) {
		// �������� �Է¹޾� �������� ����ϴ� ���α׷� �����(for���̿�)
		Scanner re=new Scanner(System.in);
		System.out.println("����� �������� �Է��ϼ���:");
		int num1 = Integer.parseInt(re.nextLine());
		for(int e=9;e>=1;e--)      
			System.out.println(num1+"*"+e+" = " +num1*e);
	}
}
