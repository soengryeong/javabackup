package com.human.ex;
class Circle{
	public static double pi=3.14;
	
	public double r=0; //������
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
		// ���� ���̿� ���Ǹ� ���ϴ� Ŭ����
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
		
		//���α׷� �߰��� pi���� 3.141592 �� ����
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














