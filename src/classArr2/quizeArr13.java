package classArr2;

import java.util.Scanner;

public class quizeArr13 {

	public static void main(String[] args) {
		// ������ ���� 5���� ����, ����, ���� ������ �Է¹޾� �� ���� ������ ����� ����ϴ� ���α׷��� ����Ͽ� �ۼ��ϼ���.
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[5][3];
		String[] subject = { "����", "����", "����" };
		int[] total = { 0, 0, 0 };
		for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 3; j++) {
		System.out.print(i + 1);
		System.out.print("�� �л� ");
		System.out.print(subject[j]);
		System.out.print(" ���� �Է� : ");
		score[i][j] = sc.nextInt();
		total[j] += score[i][j];
		}
		}

		for (int i = 0; i < 3; i++) {
		System.out.print(subject[i]);
		System.out.print(" ���� : ");
		System.out.print(total[i]);
		System.out.print(" ��� : ");
		System.out.println(String.format("%.1f",(double)total[i] / 5));
		}

			}
		
	}


