package classArr;

import java.util.Scanner;

public class quizeArr12 {

	public static void main(String[] args) {
		// Ű����� 5���� ���� ������ �Է��ϰ� 70�� �̻��� �л� ���� ��� ǥ���ϴ� ���α׷��� ����ÿ�.
		int score[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("������ �Է��ϼ���:");
		for(int i=0; i<5; i++) {
		score[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0; i<5; i++) {
			System.out.println(i+"��° ����� ���� ������"+score[i]+"���Դϴ�");
			if(70<=score[i]) {
				count++;
			}
		    }
		System.out.println("70�� �̻��� �л���"+count+"���Դϴ�");
		}

	}

