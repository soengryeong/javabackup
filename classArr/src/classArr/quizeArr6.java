package classArr;

import java.util.Arrays;
import java.util.Random;

public class quizeArr6 {

	public static void main(String[] args) {
		// 배열에 랜덤한 숫자를 넣고 그 중에서 , 배열에서 가장 큰수 구하기 ,배열에서 가장 작은수 구하기
		int b1[] = new int[10];
		Random d1 = new Random();
		int b1max=-1;
		int b1min=100;
		
		for(int i=0; i<10; i++) {
			b1[i]=d1.nextInt(100);
			if(b1max<b1[i]) {
				b1max=b1[i];
				if(b1min>b1[i]) {
					b1min=b1[i];
				}
			}
			System.out.println(Arrays.toString(b1));
			System.out.println("최대값:"+b1max);
		}   System.out.println("최소값:"+b1min);
		

	}

}
