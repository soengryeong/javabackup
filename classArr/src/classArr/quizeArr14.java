package classArr;

import java.util.Arrays;
import java.util.Scanner;

public class quizeArr14 {

	public static void main(String[] args) {
		// �� �ڸ����� ���� �Է¹޾� �迭a(ũ��4)�� ��ҿ� ���ʴ�� �����ϰ�, ������ ���� ����ϴ� ���α׷��� ���弼��.
		Scanner sr=new Scanner(System.in);
		int a[]=new int[4];
		int b[] = new int[a.length];
		System.out.print("�� �ڸ����� ������ �Է��ϼ���:");
		int num = sr.nextInt();
		int d = a.length-1;
		
		a[0]=num/1000;
		a[1]=num%1000/100;
		a[2]=num%100/10;
		a[3]=num%10;
		
		for(int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "] �� �� " +a[i]);
		}
		
			for(int i = 0; i<b.length; i++ ) {
			b[i] = a[d];
			d--;
			}	
			System.out.println(Arrays.toString(b));
	        }
	


}
