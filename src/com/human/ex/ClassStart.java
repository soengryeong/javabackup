package com.human.ex;

class Cat {
	public static int ageVaccination=5;
	public String name="이름";//인스턴스 필드
	public int age=0;
	public static void changeAgeVaccination(int ageVacc) {
		//static메소드에서는 인스턴스 필드에 접근할 수 없다.
		//static메소드에서는 static필드에 접근할 수 있다.
		//인스턴스 메소드에서는 static필드를 접근할 수 있다.
		Cat.ageVaccination=ageVacc;
	}
	public String isVaccination() {
		String returnValue="";
		if(Cat.ageVaccination<age) {
			returnValue="예방접종 대상자";
		}else {
			returnValue="예방접종 대상자가 아님";
		}
		return returnValue;
	}
	//생성자 메소드 : 인스턴스 변수의 값을 초기화하는데 사용
	// 1. 리턴값이 없다. 2. 클래스명과 이름이 동일하다.
	public Cat() {
		System.out.println("기본생성자함수실행");
	}
	public Cat(String name) {
		this(name,1); //다른생선자호출
	}
	public Cat(String name, int age) {
		//변수찾는 접근 순서 1. 지역변수 2. 인스턴스 필드 3. 클래스필드
		this.name=name;
		this.age=age;
	}
	// public default protected private 접근제어자
	//멤버 메소드 인스턴스 메소드
	public void catPrint() {
		System.out.println(name+":"+age);
	}
}

public class ClassStart {
	
	public static void catPrint(Cat c) {
		System.out.println(c.name+":"+c.age);
	}
	public static void catAddAge(int a) {
		age = age +a;
	}

	public static void main(String[] args) {
//		int age=3;
//		Cat c1 = new Cat();
//		c1.name="고1";
//		c1.age=12;
//		Cat c2 = new Cat();
//		c2.name="고2";
//		c2.age=13;
//		Cat c3 = new Cat();
//		c3.name="고3";
//		c3.age=14;
		// 고양이 나이가 5살 이하면 예방접종을 실시한다
		// 1. 법이 바뀌면 6살로 변경  
		// 인스턴스들이 공유할 수 있는 변수 static
		
		System.out.println(Cat.ageVaccination);
		Cat.changeAgeVaccinaton(10);
		System.out.println(Cat.ageVaccination);
		
		Cat c1=new Cat("고1",12);
		c1.age=3;
		System.out.println(c1.isVaccination());
		System.out.println(Cat.ageVaccination());
//		Cat c2=new Cat("고2",13);
//		Cat c3=new Cat("고3",14);
//		Cat c4=new Cat();
//		Cat c5=new Cat("고5");
//		c1.catPrint();
//		c2.catPrint();
//		c1.catPrint();
//		c5.catPrint();
		// 고양이 나이를 매개변수 만큼 증가시키거나 감소시키는 함수 만들어 보자
		// catAddAge
		
		
		//함수적 방식
//		catPrint(c1);
//		catPrint(c2);
//		catPrint(c3);
		
		//절차적 방식
//		System.out.println(c1.name+":"+c1.age);
//		System.out.println(c2.name+":"+c2.age);

	}

}
