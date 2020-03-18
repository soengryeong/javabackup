package classArr;

import java.util.Scanner;

public class quizeArr11 {

	public static void main(String[] args) {
		// 키보드로 5명의 시험 점수를 입력하고 최고 점수를 출력하는 코드를 넣어보세요.
		int score[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("점수를 입력하세요:");
		for(int i=0; i<5; i++) {
		score[i]=sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		for(int i=0; i<5; i++) {
		System.out.print(i);
		System.out.print("번째 사람의 점수는");
		System.out.print(score[i]);
		System.out.println("입니다.");
		if(max<score[i]) {
		max=score[i];
		}
		}
		System.out.println("최고 점수는");
		    System.out.println(max);
		    System.out.println("입니다");
		}

	}


