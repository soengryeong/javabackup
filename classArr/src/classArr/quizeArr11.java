package classArr;

import java.util.Scanner;

public class quizeArr11 {

	public static void main(String[] args) {
		// Ű����� 5���� ���� ������ �Է��ϰ� �ְ� ������ ����ϴ� �ڵ带 �־����.
		int score[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("������ �Է��ϼ���:");
		for(int i=0; i<5; i++) {
		score[i]=sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		for(int i=0; i<5; i++) {
		System.out.print(i);
		System.out.print("��° ����� ������");
		System.out.print(score[i]);
		System.out.println("�Դϴ�.");
		if(max<score[i]) {
		max=score[i];
		}
		}
		System.out.println("�ְ� ������");
		    System.out.println(max);
		    System.out.println("�Դϴ�");
		}

	}


