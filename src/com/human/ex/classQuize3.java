package com.human.ex;

import java.util.Scanner;

class phone {
	public String model = "iphone9";
	public String number = "010-1234-5678";
	public String make = "iphone";
	Scanner re = new Scanner(System.in);

	public phone(int a) {
		if (a == 0) {
			System.out.println("���� ��ȣ �Է�:");
			String st = re.nextLine();
			System.out.println(st + "���� ��ȭ�� �Ŵ� ���Դϴ�");
		}
	}
}

class Tv {
	public String name = "60��ġ";
	public String make = "�Ｚ";
	public int ch = 5;
	Scanner sc2 = new Scanner(System.in);

	public Tv(int a) {
		if (a == 1) {
			System.out.print(ch + "����");
			this.ch = ch + 1;
			System.out.println(ch + "������ �̵�");
		}
		if (a == 2) {
			System.out.print(ch + "����");
			this.ch = ch - 1;
			System.out.println(ch + "������ �̵�");
		}
		if (a == 3) {
			System.out.print("ũ��:" + name + "�귣��:" + make);
		}
	}
}

class elevator {
	public String name = "����";
	public int weight = 40;
	public int ch = 1;
	Scanner sc2 = new Scanner(System.in);

	public elevator(int a) {
		if (a == 1) {
			System.out.print(ch + "���� ");
			this.ch = ch + 1;
			System.out.print(ch + "�� �̵�");
		}
		if (a == 2) {
			System.out.print("�귣��:" + name + "��������:" + weight);
		}
	}
}

class computer {
	public String name = "�����";
	public int size = 15;
	public double weight = 2.3;
	Scanner sc2 = new Scanner(System.in);

	public computer(int a) {
		if (a == 1) {
			System.out.print("�귣��:" + name + "����:" + weight);
		}
	}
}

public class classQuize3 {

	public static void main(String[] args) {
		// �츮 �ֺ��� �ִ� �繰�� ��ü�� ����� ����ϴ� ���α׷��� ������.
		// �ڵ���, TV, ����������, ������ �ϳ� �߰�.
		// �ڵ��� - �̸�,��ȣ,��ǰ��,��ȭ�ɱ�,�޽���������,�ڵ����������
		// ����=�ʵ� , ����=�޼ҵ�
	    Scanner sc=new Scanner(System.in);
		System.out.println("1.�ڵ��� 2.TV 3.���������� 4.��ǻ��");
		int num1 = sc.nextInt();

		if (num1 == 1) {
			System.out.println("1��ȭ�ɱ� 2�޼��������� 3 �ڵ��� �������");
			int a = Integer.parseInt(sc.nextLine());
			phone p1 = new phone(a);
		}
		if (num1 == 2) {
			System.out.println("1.����up 2.�Ʒ���down 3.����");
			int a = Integer.parseInt(sc.nextLine());
			Tv tv1 = new Tv(a);
		}
		if (num1 == 3) {
			System.out.println("1.����up 2.����");
			int a = Integer.parseInt(sc.nextLine());
			elevator e1 = new elevator(a);
		}
		if (num1 == 4) {
			System.out.println("1.����");
			int a = Integer.parseInt(sc.nextLine());
			computer c1 = new computer(a);
		}

	}

}
