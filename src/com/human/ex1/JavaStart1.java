package com.human.ex1;

public class JavaStart1 {

	public static void main(String[] args) {
		// �� ���� ������ �Է� �޾� �� �� ���� ������ ���� ���ض�(�μ�����)

		java.util.Scanner se=new java.util.Scanner(System.in);
		System.out.println("ù��° ������ �Է��ϼ���:");
		int num1 = Integer.parseInt(se.nextLine());
		System.out.println("�ι�° ������ �Է��ϼ���:");
		int num2 = Integer.parseInt(se.nextLine());
		
		int sum=0;
		
		for(int i= num1; i<=num2; ++i) {
			sum += i;
			
		}
		System.out.println("�� ������ ����"+sum+"�Դϴ�");
	}
}
