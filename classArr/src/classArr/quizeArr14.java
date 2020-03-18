package classArr;

import java.util.Arrays;
import java.util.Scanner;

public class quizeArr14 {

	public static void main(String[] args) {
		// 네 자릿수의 수를 입력받아 배열a(크기4)의 요소에 차례대로 저장하고, 다음에 역순 출력하는 프로그램을 만드세요.
		Scanner sr=new Scanner(System.in);
		int a[]=new int[4];
		int b[] = new int[a.length];
		System.out.print("네 자릿수의 정수를 입력하세요:");
		int num = sr.nextInt();
		int d = a.length-1;
		
		a[0]=num/1000;
		a[1]=num%1000/100;
		a[2]=num%100/10;
		a[3]=num%10;
		
		for(int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "] 의 값 " +a[i]);
		}
		
			for(int i = 0; i<b.length; i++ ) {
			b[i] = a[d];
			d--;
			}	
			System.out.println(Arrays.toString(b));
	        }
	


}
