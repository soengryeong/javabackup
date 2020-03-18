package classArr2;

import java.util.Arrays;

public class quizeArr9 {

	public static void main(String[] args) {
		//그림과 같이 배열 복사하기
//				String b4[] = new String[6];
//				b4[0]="A";
//				b4[1]="B";
//				b4[2]="C";
//				b4[3]="b4[2]";
//				b4[4]="b4[1]";
//				b4[5]="b4[0]";
		char arr[]= {'a','b','c','\0','\0','\0'};
		for(int i=2; i>=0; i--) {
			arr[5-i]=arr[i];
		}
		System.out.println(Arrays.toString(arr));
		


	}

}
