package com.human.ex1;

public class quize04 {

	public static void main(String[] args) {
		// �ټ� ���� ������ �Է¹޾� ������ ��� ����� �����Ͽ� ����ϴ� ���α׷��� ������.
		int num1, num2, num3, num4, num5;
		java.util.Scanner ro=new java.util.Scanner(System.in);
		System.out.print("ù���� ������ �Է��ϼ���:");
		num1 = Integer.parseInt(ro.nextLine());
		if(num1>0) {
			System.out.println(num1*(-1));
		}else {
			System.out.println(num1*-(-1));
		}
		System.out.print("�ι��� ������ �Է��ϼ���:");
		num2 = Integer.parseInt(ro.nextLine());
		if(num2>0) {
			System.out.println(num2*(-1));
		}else {
			System.out.println(num2*-(-1));
		}
		System.out.print("������ ������ �Է��ϼ���:");
		num3 = Integer.parseInt(ro.nextLine());
		if(num3>0) {
			System.out.println(num3*(-1));
		}else {
			System.out.println(num3*-(-1));
		}
		System.out.print("�׹��� ������ �Է��ϼ���:");
		num4 = Integer.parseInt(ro.nextLine());
		if(num4>0) {
			System.out.println(num4*(-1));
		}else {
			System.out.println(num4*-(-1));
		}
		System.out.print("�ټ����� ������ �Է��ϼ���:");
		num5 = Integer.parseInt(ro.nextLine());
		if(num5>0) {
			System.out.println(num5*(-1));
		}else {
			System.out.println(num5*-(-1));
		}
	
	}

}
