package classArr;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class quizeArr18 {

	public static void main(String[] args) {
		// 1~9사이의 숫자를 랜덤으로 받아서 각 숫자가 몇 번 출력되는지 출력하는 프로그램을 구현해보자.  
		// 빈도수가 가장 높은 숫자대로 순서대로 출력하자
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int a[] = new int[10];
		int b[] = new int[a.length];
		int c[] = new int[a.length];


		for(int i = 0; i<10 ; i++) {
		c[i] = i;
		}


		int x = 0;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
		x = rd.nextInt(10);
		a[i] = x;
		}
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
		if (a[i] == a[j]) {
		count++;
		}
		}
		System.out.println(a[i] + "가 나온 횟수 " + count);

		b[i] = count;
		count = 0;
		}

		int d = 0;
		int a1=0;
		int a2 =0;
		int a3 = 0;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		for(int i = 0; i<a.length; i++) {

		for(int j = 0; j<a.length; j++) {

		if(b[i]>b[j]) {
		int temp;

		temp = b[i];
		b[i] =b[j];
		b[j] = temp;

		a1 = a[i];
		a[i] = a[j];
		a[j] = a1;
		}
		}
		}
	}
}

		

