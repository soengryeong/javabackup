package classArr2;

import java.util.Scanner;

public class quizeArr13 {

	public static void main(String[] args) {
		// 다음과 같이 5명의 국어, 영어, 수학 성적을 입력받아 각 과목별 총점과 평균을 출력하는 프로그램을 사용하여 작성하세요.
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[5][3];
		String[] subject = { "국어", "영어", "수학" };
		int[] total = { 0, 0, 0 };
		for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 3; j++) {
		System.out.print(i + 1);
		System.out.print("번 학생 ");
		System.out.print(subject[j]);
		System.out.print(" 성적 입력 : ");
		score[i][j] = sc.nextInt();
		total[j] += score[i][j];
		}
		}

		for (int i = 0; i < 3; i++) {
		System.out.print(subject[i]);
		System.out.print(" 총점 : ");
		System.out.print(total[i]);
		System.out.print(" 평균 : ");
		System.out.println(String.format("%.1f",(double)total[i] / 5));
		}

			}
		
	}


