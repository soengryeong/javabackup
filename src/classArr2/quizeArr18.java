package classArr2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class quizeArr18 {

	public static void main(String[] args) {
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
		System.out.println(a[i] + "°¡ ³ª¿Â È½¼ö " + count);

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
