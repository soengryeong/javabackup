package classArr2;

import java.util.Arrays;
import java.util.Random;

public class quizeArr6 {

	public static void main(String[] args) {
		// �迭�� ������ ���ڸ� �ְ� �� �߿��� , �迭���� ���� ū�� ���ϱ� ,�迭���� ���� ������ ���ϱ�
		// �ʱ�ȭ
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
