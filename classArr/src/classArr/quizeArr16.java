package classArr;

import java.util.Scanner;

public class quizeArr16 {

	public static void main(String[] args) {
		// �ټ��� �ɻ������� ������ �Է��Ͽ� ��ȿ������ ����� ����ϴ� ���α׷��� �ۼ��մϴ�.
		// ��ȿ������ �ְ����� �������� ������ �����̸� ����� ��ȿ������ ����մϴ�.
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int sum=0;
		
		System.out.println("5���� �ɻ������� ���� �Է�:");
		for(int i=0;i<a.length;i++) {
		int score=sc.nextInt();
		a[i]=score;
		if(a[i]>max) {
		max=a[i];
		}
		if(a[i]<min) {
		min=a[i];
		}
		}
		
		System.out.print("��ȿ����:");
		for(int i=0;i<a.length;i++) {
		if(a[i]!=max&&a[i]!=min) {
		System.out.print(a[i]+" ");
		sum+=a[i];
		}
		}
		System.out.println();
		System.out.println("���:"+(double)sum/3);
		
		sc.close();
		

	}

}
