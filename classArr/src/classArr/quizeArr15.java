package classArr;

import java.util.Scanner;

public class quizeArr15 {

	public static void main(String[] args) {
		// 출석 관리하는 배열을 만들어서 16 명이 출석  여부를 출력하는 배를 만들자.
		// 출석상항을 판별하자. 
		// 출석 입력 2.결석 입력 3.초기화 (모두 출석 혹은 결석으로 만든다)
		// 4 출석정보 출력. 5 프로그램 종료
		Scanner sc = new Scanner(System.in);
		int join[] = new int[16];
		boolean joinFlag = true;
		int count = 0;
		
		for(int i=0;i<join.length;i++) {
			System.out.print((i+1)+"번째 강의에 출석하셨나요? <출석은 1, 결석은 0>: ");
			if(sc.nextLine().equals("0")) {
				joinFlag = false;
			}
			if(joinFlag) {
				count++;
			}
		}
		
		double joinRate = (double) (100*count)/join.length;
		if(joinRate>=80) {
			System.out.println("수업 일수 충족입니다. "+"<출석률 :"+joinRate+"%>");
		}else {
			System.out.println("수업 일수 부족입니다. "+"<출석률 :"+joinRate+"%>");
		}
		
		
		sc.close();


	}

}
