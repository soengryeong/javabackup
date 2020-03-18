package classArr2;

import java.util.Arrays;

public class quizeArr5 {

	public static void main(String[] args) {
		// 3의 배수 10개를 배열에 저장해서 출력하는 변수를 구해보자.
				int i4[] = new int[10];
				int i5=0;
				for (int i=0; i<30; i++) {
					if(i%3==0) {
						i4[i5]=i;
						i5++;
					}
				}
				System.out.println(Arrays.toString(i4));

	}

}
