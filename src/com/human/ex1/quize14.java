package com.human.ex1;
import java.util.*;

public class quize14 {

	public static void main(String[] args) {
		// �Ҽ����� �ƴ���. ���� �ϳ� �Է¹޾Ƽ� 
				// �Ҽ��� �ǹ̶�? 1�� �ڱ� �ڽ��� �����ϰ� �������� ��
				// 1,2,3,5,7,
				Scanner sc=new Scanner(System.in);
				System.out.println("����� �Ҽ� �Է�>>");
				int inputNumber=Integer.parseInt(sc.nextLine());
				boolean isOk=true;
				
				for(int i=2; i<inputNumber; i++) {
					if(inputNumber%i==0) {
						isOk=false;
						break;
					}
				}
				
				if(isOk==true) {
					System.out.println("�Ҽ��Դϴ�");
				}else {
					System.out.println("�Ҽ��� �ƴմϴ�.");
				}

	}

}
