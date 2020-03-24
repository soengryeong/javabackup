package com.human.ex;

import java.util.Scanner;

class phone {
	public String model = "iphone9";
	public String number = "010-1234-5678";
	public String make = "iphone";
	Scanner re = new Scanner(System.in);

	public phone(int a) {
		if (a == 0) {
			System.out.println("상대방 번호 입력:");
			String st = re.nextLine();
			System.out.println(st + "에게 전화를 거는 중입니다");
		}
	}
}

class Tv {
	public String name = "60인치";
	public String make = "삼성";
	public int ch = 5;
	Scanner sc2 = new Scanner(System.in);

	public Tv(int a) {
		if (a == 1) {
			System.out.print(ch + "에서");
			this.ch = ch + 1;
			System.out.println(ch + "번으로 이동");
		}
		if (a == 2) {
			System.out.print(ch + "에서");
			this.ch = ch - 1;
			System.out.println(ch + "번으로 이동");
		}
		if (a == 3) {
			System.out.print("크기:" + name + "브랜드:" + make);
		}
	}
}

class elevator {
	public String name = "현대";
	public int weight = 40;
	public int ch = 1;
	Scanner sc2 = new Scanner(System.in);

	public elevator(int a) {
		if (a == 1) {
			System.out.print(ch + "에서 ");
			this.ch = ch + 1;
			System.out.print(ch + "로 이동");
		}
		if (a == 2) {
			System.out.print("브랜드:" + name + "한정무게:" + weight);
		}
	}
}

class computer {
	public String name = "레노버";
	public int size = 15;
	public double weight = 2.3;
	Scanner sc2 = new Scanner(System.in);

	public computer(int a) {
		if (a == 1) {
			System.out.print("브랜드:" + name + "무게:" + weight);
		}
	}
}

public class classQuize3 {

	public static void main(String[] args) {
		// 우리 주변에 있는 사물을 객체로 만들어 출력하는 프로그램을 만들어보자.
		// 핸드폰, TV, 엘리베이터, 본인이 하나 추가.
		// 핸드폰 - 이름,번호,제품명,전화걸기,메시지보내기,핸드폰정보출력
		// 상태=필드 , 동작=메소드
	    Scanner sc=new Scanner(System.in);
		System.out.println("1.핸드폰 2.TV 3.엘레베이터 4.컴퓨터");
		int num1 = sc.nextInt();

		if (num1 == 1) {
			System.out.println("1전화걸기 2메세지보내기 3 핸드폰 정보출력");
			int a = Integer.parseInt(sc.nextLine());
			phone p1 = new phone(a);
		}
		if (num1 == 2) {
			System.out.println("1.위로up 2.아래로down 3.정보");
			int a = Integer.parseInt(sc.nextLine());
			Tv tv1 = new Tv(a);
		}
		if (num1 == 3) {
			System.out.println("1.위로up 2.정보");
			int a = Integer.parseInt(sc.nextLine());
			elevator e1 = new elevator(a);
		}
		if (num1 == 4) {
			System.out.println("1.정보");
			int a = Integer.parseInt(sc.nextLine());
			computer c1 = new computer(a);
		}

	}

}
