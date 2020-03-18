package classArr;

import java.util.Scanner;

public class quizeArr12 {

	public static void main(String[] args) {
		// 키보드로 5명의 시험 점수를 입력하고 70점 이상의 학생 수를 세어서 표시하는 프로그램을 만드시오.
		int score[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("점수를 입력하세요:");
		for(int i=0; i<5; i++) {
		score[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0; i<5; i++) {
			System.out.println(i+"번째 사람의 시험 점수는"+score[i]+"점입니다");
			if(70<=score[i]) {
				count++;
			}
		    }
		System.out.println("70점 이상인 학생은"+count+"명입니다");
		}

	}

