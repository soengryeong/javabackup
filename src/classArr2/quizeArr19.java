package classArr2;

import java.util.Scanner;

public class quizeArr19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a[] = new int[50];
		int b[] = new int[a.length];
		int count = 0;

		int x =0;

		System.out.println("수 입력");
		x=Integer.parseInt(sc.nextLine());

		System.out.println("a 배열");
		for(int i = 0; i<a.length; i++) {
		a[i] = i+1;
		System.out.printf("%3d",a[i]);
		count ++;
		if(count==10) {
		System.out.println("");
		count = 0;
		}
		}
		System.out.println("b 배열");
		for(int i = 0; i<a.length; i++) {
		b[i] = i+1;
		if((i+1)%x==0) {
		b[i] = 0;
		}


	}

}
}
