package com.human.ex1;

public class quize09 {

	public static void main(String[] args) {
		// 1���� �Է��� ���ڱ��� �����ϴ� ���α׷��� �����Ͻÿ�.
		java.util.Scanner re = new java.util.Scanner(System.in);
		System.out.println("1���� �����ϴ� ���α׷��Դϴ�.\n������ ���� �Է��ϼ���. \n1���� =>");
		int a = re.nextInt();
		System.out.println("1����" + a + "���� �����մϴ�");
		int sum = 0;

		for (int i = 1; i <= a; i++) {
			sum = sum + i;
			String ans = String.format("[%d]�� TotalNumber�� �� : %d",i-1,sum);
			System.out.println(ans);

		}
		System.out.println("\n1���� "+a+"������ ������"+sum+"�Դϴ�");
		re.close();

	}

}
