package com.human.ex1;

public class quize02 {

	public static void main(String[] args) {
		// 1���� ���ʴ�� ���Ͽ� ����ڰ� �Է��� ���� ���� ��� ����Ǵ� break�� �ۼ�
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("�����Է�>>");
		int user = sc.nextInt();
		int sum = 0;
		for (int i = 1;; i++) {
		sum = sum + i;
		if (sum > user) {
		break;
		} else {
		System.out.println(i + ":" + sum);
		}System.out.println("���α׷��� �����մϴ�");
		}
		}

	}

