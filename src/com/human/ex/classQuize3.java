package com.human.ex;

import java.util.Scanner;

class phone {
	public String model = "iphone9";
	public String number = "010-1234-5678";
	public String make = "iphone";
	Scanner re = new Scanner(System.in);

	public phone() {
		 
			System.out.println("���� ��ȣ �Է�:");
			String st = re.nextLine();
			System.out.println(st + "���� ��ȭ�� �Ŵ� ���Դϴ�");
		
	}
}

class Tv {
	public String name = "60��ġ";
	public String make = "�Ｚ";
	public int ch = 5;
	Scanner sc2 = new Scanner(System.in);

	public Tv() {
	{
			System.out.print(ch + "����");
			this.ch = ch + 1;
			System.out.println(ch + "������ �̵�");
		
		
			System.out.print(ch + "����");
			this.ch = ch - 1;
			System.out.println(ch + "������ �̵�");
			System.out.print("ũ��:" + name + "�귣��:" + make);
		
	}
}

class elevator {
	public String name = "����";
	public int weight = 40;
	public int ch = 1;
	Scanner sc2 = new Scanner(System.in);

	public elevator() {
	
			System.out.print(ch + "���� ");
			this.ch = ch + 1;
			System.out.print(ch + "�� �̵�");
	
	}
}

class Computer {
	public String name = "�����";
	public int size = 15;
	public double weight = 2.3;
	Scanner sc2 = new Scanner(System.in);

	public computer() {
		if (a == 1) {
			System.out.print("�귣��:" + name + "����:" + weight);
		}
	}
}

public class classQuize3 {

	public static void main(String[] args) {
		Computer c1 = new Computer();
		System.out.println(c1.size);
	
		
	}

}
