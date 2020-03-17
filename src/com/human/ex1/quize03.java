package com.human.ex1;

public class quize03 {

	public static void main(String[] args) {
		//사용자가 “종료”를 입력할때 까지 무한 반복하는 프로그램을 3가지 방법으로 구현하시오
		java.util.Scanner re=new java.util.Scanner(System.in);
		
		//for문
		for( ; ; ) {
			System.out.println("입력하세요:");
			String a =re.next();
			if(a.equals("종료")) break;
		}
       //while문
//      	System.out.println("입력하세요:");
//      	String a =re.next();
//	        if(a.equals("종료")) break;
	   
	   //do ~ while문
//        do {
//			System.out.println("입력하세요:");
//			String a =re.next();
//			if(a.equals("종료")) break;
//        
//        }while(true); {
//        	
//        	System.out.println("끝");
//        	re.close();
        	
        }
	
		
	}


