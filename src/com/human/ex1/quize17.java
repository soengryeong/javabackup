package com.human.ex1;

public class quize17 {

	public static void main(String[] args) {
		// �ݺ����� �̿��Ͽ� ���� 1~100������ ������ ���Ͽ� 
		//10�� �������� �����µ��� ȯ���ϴ� ǥ�� �ۼ��ض�
		System.out.println("=====================\nȭ���µ�\t\t�����µ�\n=====================\n");
		for (int i = 1; i <= 100; i++) {
		double b = ((double) 5/9)*(i-32);
		if (i % 10 == 0) {
		String ans = String.format("%d \t\t %.1f", i, b);
		System.out.println(ans);
		}
		}
	}

}
