package com.human.ex;
class Circle{
	public static double pi=3.14;
	
	public double r=0; //반지름
	public Circle() {}
	public Circle(double r) {
		this.r=r;
	}
	public double border() {
		return 2*pi*r;
	}
	public double area() {
		return 2*pi*r*r;
	}
}
public class classStart10 {

	public static void main(String[] args) {
		// 원의 넓이와 부피를 구하는 클래스
		double r=5;
		Circle c = new Circle(r);
		c.area();
		c.border();
		
		double r1=6;
		Circle c1 = new Circle(r1);
		c1.area();
		c1.border();
		
		double r2=7;
		Circle c2 = new Circle(r2);
		c2.area();
		c2.border();
		
		//프로그램 중간에 pi값을 3.141592 로 변경
		//c.pi=3.141592;
		Circle.pi=3.141592;
		c.area();
		c.border();
		
		//c1.pi=3.141592;
		c1.area();
		c1.border();
		
		//c2.pi=3.141592;
		c2.area();
		c2.border();
		
		System.out.println(c.area());
		System.out.println(c.border());
		
		System.out.println(c1.area());
		System.out.println(c1.border());
		
	
		
	}
}














