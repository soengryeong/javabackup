package classArr2;

import java.util.Arrays;

public class quizeArr12 {

	public static void main(String[] args) {
		// [1,2,3,1,2,3,1,2,3] �� ����Ͻÿ�
		int arr[]=new int[9];
		for(int i=0; i<9; i++) {
			arr[i]=i%3+1;
		}
		System.out.println(Arrays.toString(arr));

	}

}
