package classArr;

import java.util.Scanner;

public class quizeArr2 {

	public static void main(String[] args) {
		// 사용자 입력을 받아 과자 4개를 입력받아 출력하는 프로그램을 만들어보자 
		// 문자열을 처리하는 방법
		Scanner sc = new Scanner(System.in);
		String str[] = new String[4];
		
		for(int i=0; i<4; i++) {
			System.out.print("과일 4개를 입력하세요:");
			str[i]=sc.nextLine();
		}
		for(int i=0; i<4; i++) {
			System.out.print(str[i]);
		}
		

	}

}
