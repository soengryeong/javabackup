package classArr;

import java.util.Arrays;

public class quizeArr7 {

	public static void main(String[] args) {
		// 배열에 값을 3증가시켜서 현재 배열에 넣기
		int b2[] = {1,2,3,4,5};
		for(int i=0; i<5; i++) {
			b2[i]=b2[i]+3;
		}
		System.out.println(Arrays.toString(b2));

	}

}
