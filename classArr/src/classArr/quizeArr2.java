package classArr;

import java.util.Scanner;

public class quizeArr2 {

	public static void main(String[] args) {
		// ����� �Է��� �޾� ���� 4���� �Է¹޾� ����ϴ� ���α׷��� ������ 
		// ���ڿ��� ó���ϴ� ���
		Scanner sc = new Scanner(System.in);
		String str[] = new String[4];
		
		for(int i=0; i<4; i++) {
			System.out.print("���� 4���� �Է��ϼ���:");
			str[i]=sc.nextLine();
		}
		for(int i=0; i<4; i++) {
			System.out.print(str[i]);
		}
		

	}

}
