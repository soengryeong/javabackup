package classArr2;

import java.util.Arrays;

public class quizeArr7 {

	public static void main(String[] args) {
		// �迭�� ���� 3�������Ѽ� ���� �迭�� �ֱ�
//				int b2[] = {1,2,3,4,5};
//				for(int i=0; i<5; i++) {
//					b2[i]=b2[i]+3;
//				}
//				System.out.println(Arrays.toString(b2));
		
		//������ ���� �־� �� ����ŭ ���� ���� �κ��� 0�ֱ�
	    int [] arr= {1,2,3,4,5,6,7,8,9,10};
	    int input=8;
	    for(int i=input; i<10; i++) {
	    	arr[i-input]=arr[i];
	    }
	    for(int i=10-input; i<10; i++) {
	    	arr[i]=0;
	    }
	    System.out.println(Arrays.toString(arr));

	}

}
