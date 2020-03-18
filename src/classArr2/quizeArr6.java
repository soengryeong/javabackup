package classArr2;

import java.util.Arrays;
import java.util.Random;

public class quizeArr6 {

	public static void main(String[] args) {
		// 배열에 랜덤한 숫자를 넣고 그 중에서 , 배열에서 가장 큰수 구하기 ,배열에서 가장 작은수 구하기
		// 초기화
		Random rd=new Random();
		int arr[]=new int[10];
		for(int i=0; i<10; i++) {
			arr[i]=rd.nextInt(100);
		}
//		int max=Integer.MIN_VALUE;
//		int min=Integer.MAX_VALUE;
//		int max=-1;
//		int min=100;
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0; i<10;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}if(min>arr[i]) {
				min=arr[i];
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(max);
		System.out.println(min);
		

	}

}
