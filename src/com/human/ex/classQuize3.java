package com.human.ex;

import java.util.Scanner;

class phone {
	public String model = "iphone9";
	public String number = "010-1234-5678";
	public String make = "iphone";
	Scanner re = new Scanner(System.in);

	public phone() {
		 
			System.out.println("상대방 번호 입력:");
			String st = re.nextLine();
			System.out.println(st + "에게 전화를 거는 중입니다");
		
	}
}

class Tv {
	public String name = "60인치";
	public String make = "삼성";
	public int ch = 5;
	Scanner sc2 = new Scanner(System.in);

	public Tv() {
	{
			System.out.print(ch + "에서");
			this.ch = ch + 1;
			System.out.println(ch + "번으로 이동");
		
		
			System.out.print(ch + "에서");
			this.ch = ch - 1;
			System.out.println(ch + "번으로 이동");
			System.out.print("크기:" + name + "브랜드:" + make);
		
	}
}

class elevator {
	public String name = "현대";
	public int weight = 40;
	public int ch = 1;
	Scanner sc2 = new Scanner(System.in);

	public elevator() {
	
			System.out.print(ch + "에서 ");
			this.ch = ch + 1;
			System.out.print(ch + "로 이동");
	
	}
}

class Computer {
	public String name = "레노버";
	public int size = 15;
	public double weight = 2.3;
	Scanner sc2 = new Scanner(System.in);

	public computer() {
		if (a == 1) {
			System.out.print("브랜드:" + name + "무게:" + weight);
		}
	}
}

public class classQuize3 {

	public static void main(String[] args) {
		Computer c1 = new Computer();
		System.out.println(c1.size);
	
		
	}

}
