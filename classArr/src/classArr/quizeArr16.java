package classArr;

import java.util.Scanner;

public class quizeArr16 {

	public static void main(String[] args) {
		// 다섯명 심사위원의 점수를 입력하여 유효점수와 평균을 출력하는 프로그램을 작성합니다.
		// 유효점수는 최고점과 최저점을 제외한 점수이며 평균은 유효점수로 계산합니다.
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int sum=0;
		
		System.out.println("5명의 심사위원의 점수 입력:");
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
		
		System.out.print("유효점수:");
		for(int i=0;i<a.length;i++) {
		if(a[i]!=max&&a[i]!=min) {
		System.out.print(a[i]+" ");
		sum+=a[i];
		}
		}
		System.out.println();
		System.out.println("평균:"+(double)sum/3);
		
		sc.close();
		

	}

}
