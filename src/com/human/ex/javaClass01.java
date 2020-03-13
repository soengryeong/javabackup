package com.human.ex;

import java.util.Arrays;
class Cat{
	public String name;
	public int age;
	
}

public class javaClass01 {

	public static void main(String[] args) {
		int a;
		a=1;
		Cat cat1;
		cat1=new Cat();
		cat1.name="고양이1";
		cat1.age=5;
		Cat cat2;
		cat2=new Cat();
		cat2.name="고양이2";
		cat2.age=2;
		Cat cat3=cat2;
		cat3.name="고양이3";
		cat3.age=5;
		
		System.out.println(cat2.name);
		
		Cat cArr[]=new Cat[3];
		cArr[0]=new Cat();
		cArr[0].name="고1";
		cArr[0].age=10;
		cArr[1]=new Cat();
		cArr[1].name="고2";
		cArr[1].age=11;
		cArr[2]=new Cat();
		cArr[2].name="고2";
		cArr[2].age=12;
		
		cArr[0]=cArr[2];
		cArr[0].name=cArr[2].name;
		cArr[0].age=cArr[2].age;
		
		for(int i=0; i<3; i++)
		{
			cArr[i]=new Cat();
			cArr[i].name="고"+i;
			cArr[i].age=i+10;
		}
		for(int i=0; i<3; i++)
		{
			System.out.println(cArr[i].name+":"+
			cArr[i].age);
		}
		//고양이의 나이에 총합을 구하시오.
		int sum=0;
		for(int i=0; i<cArr.length; i++) {
			sum=sum+cArr[i].age;
		}
		System.out.println(sum);
		sum=0;
		for(Cat cat:cArr) {
			sum=sum+cat.age;
			cat.age=1;
		}
		System.out.println(sum);

		// 배열 : 한번에 여러개의 데이터를 선언
		// int a1, a2, a3; int a[]=new int[3];
//		int a[];
//		a = new int[3];
//		a[0] = 0; // index는 0부터 시작한다.
//		a[1] = 1;
//		a[2] = 2;
//
//		int index = 1;
//		a[index] = 3;
//		
//		System.out.println(Arrays.toString(a));
//		for(int i=0; i<3; i++) {
//			a[i]=i;		
//		}
//		System.out.println(Arrays.toString(a));
//		a[0]=a[1]+a[2];
//		for(int i=0; i<a.length; i++) {
//			System.out.println(a[i]);
//		}
//		
//		int sum=0;
//		for(int i=0; i<a.length; i++) { //예전에 자주쓰던 문법
//			sum=sum+a[i];
//		}
//		System.out.println(sum);
//		
//		sum=0;
//		for(int i:a) { //이걸 자주 씀 
//			sum=sum+i;
//		}
//		
//		System.out.println(sum);
//		
//		
		
		
		

	}

}
