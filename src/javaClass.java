
public class javaClass {

	public static void main(String[] args) {
//		java.util.Scanner sr=new java.util.Scanner(System.in);
//		System.out.print("국어,영어,수학 성적을 입력하시오:");
//		int i1=Integer.parseInt(sr.nextLine());
//		int i2=Integer.parseInt(sr.nextLine());
//		int i3=Integer.parseInt(sr.nextLine());
//		int i4=(i1+i2+i3)/3;
//		if(i4<80) {
//			System.out.println("불합격입니다");
//		}else {
//			System.out.println("합격입니다");
//		}
  //﻿다음과 같이 5개의 수를 차례대로 입력받아 가장 작은 수와 가장 큰 수를 출력하는 프로그램을 작성하시오
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.print("첫 번째 수를 입력하세요:");
//		int first=Integer.parseInt(sc.nextLine());
//		System.out.print("두 번째 수를 입력하세요:");
//		int second=Integer.parseInt(sc.nextLine());
//		System.out.print("세 번째 수를 입력하세요:");
//		int third=Integer.parseInt(sc.nextLine());
//		System.out.print("네 번째 수를 입력하세요:");
//		int fourth=Integer.parseInt(sc.nextLine());
//		System.out.print("다섯 번째 수를 입력하세요:");
//		int fifth=Integer.parseInt(sc.nextLine());
//
//		int maxNum=0;
//		if(maxNum<first) {
//		maxNum=first;
//		}
//		if(maxNum<second) {
//		maxNum=second;
//		}
//		if(maxNum<third) {
//		maxNum=third;
//		}
//		if(maxNum<fourth) {
//		maxNum=fourth;
//		}
//		if(maxNum<fifth) {
//		maxNum=fifth;
//		}
//
//		if(first<second) {
//		second=first;
//		}
//		if(second<third) {
//		third=second;
//		}
//		if(third<fourth) {
//		fourth=third;
//		}
//		if(fourth<fifth) {
//		fifth=fourth;
//		}
//		int minNum=fifth;
//		System.out.println("가장 큰 수는:"+maxNum);
//		System.out.println("가장 작은 수는:"+minNum);
//	}
		//다음과 같이 정수 2개를 입력받아 두 정수의 절댓값을 더한 값을 출력하는 프로그램을 만들어라
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.print("첫 번째 수를 입력하세요:");
//		int i1=Integer.parseInt(sc.nextLine());
//		System.out.print("첫 번째 수를 입력하세요:");
//		int i2=Integer.parseInt(sc.nextLine());
//		if(i1<0) {
//			i1=i1*-1;
//			}else if(i2<0) {
//			i2=i2*-1;
//			}
//
//			System.out.println("두 수의 절대값의 합 : "+(i1+i2));
		java.util.Scanner sp=new java.util.Scanner(System.in);
		System.out.print("x값을 입력하시오:");
		double d1=Integer.parseInt(sp.nextLine());
		int sum;
		if (d1<=0) {
		     System.out.println(d1*d1*d1-9*d1+2);
		}else {
			 System.out.println(7*d1+2);
		}
	}
}
