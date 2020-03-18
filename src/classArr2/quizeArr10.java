package classArr2;

import java.util.Arrays;
import java.util.Scanner;

public class quizeArr10 {

	public static void main(String[] args) {
		// 배열 생성해서 사용자 입력을 받아 그 수만큼 왼쪽으로 이동시켜 없애고 나머지는 0을 채운다.
				int b5[] = {1,2,3,4,5,6,7,8,9,10};
				
				Scanner re=new Scanner(System.in);
				System.out.println("수를 입력하세요:");
				int input2 = re.nextInt();
				
				for(int i=0; i<(10-input2); i++) {
					b5[i]=b5[i+input2];
				}
					for(int i=0; i<(input2); i++) {
						b5[10-input2+i]=0;
				
				}
					System.out.println(Arrays.toString(b5));
	    //왼쪽에 0을 채우는 형태로 변경.
	    //239게임 해답지 출력 1000이하의 해답지.

	}

}
