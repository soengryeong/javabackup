package classArr2;

import java.util.Arrays;
import java.util.Scanner;

public class quizeArr10 {

	public static void main(String[] args) {
		// �迭 �����ؼ� ����� �Է��� �޾� �� ����ŭ �������� �̵����� ���ְ� �������� 0�� ä���.
				int b5[] = {1,2,3,4,5,6,7,8,9,10};
				
				Scanner re=new Scanner(System.in);
				System.out.println("���� �Է��ϼ���:");
				int input2 = re.nextInt();
				
				for(int i=0; i<(10-input2); i++) {
					b5[i]=b5[i+input2];
				}
					for(int i=0; i<(input2); i++) {
						b5[10-input2+i]=0;
				
				}
					System.out.println(Arrays.toString(b5));
	    //���ʿ� 0�� ä��� ���·� ����.
	    //239���� �ش��� ��� 1000������ �ش���.

	}

}
