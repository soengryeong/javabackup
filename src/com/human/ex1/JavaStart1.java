package com.human.ex1;

public class JavaStart1 {

	public static void main(String[] args) {
		/*������ ���� �� ���� ������ �Է¹޾� ù��° ���� ����� �ι�° ����ŭ ����ϴ� ���α׷��� for���� �̿��Ͽ� �ۼ��Ͻÿ�.
		 * --------------------------������------------------------------------------
		 * ù��° �����Է� : 5
		 * �ι�° �����Է� : 7
		 * 5�� ��� 6�� ���
		 * 5,10,15,20,25,30,35
		*/
		
		int sum=0;

		System.out.print("ù��° ���� �Է�:");
		java.util.Scanner rd=new java.util.Scanner(System.in);
		int num1= Integer.parseInt(rd.nextLine());
		System.out.print("�ι�° ���� �Է�:");
		java.util.Scanner re=new java.util.Scanner(System.in);
		int num2= Integer.parseInt(re.nextLine());
		System.out.println(num1+"�� ���"+num2+"�� ���");
		int a=0;
		for(int i=1; i<=num2; i++) {
			a=num1*i;
			System.out.println(a);
		}
		
	
	
		

	}
		

		
	}

