package classArr2;

import java.util.Scanner;

public class quizeArr17 {

	public static void main(String[] args) {
		// 1���� 45������ �� �߿� 6���� ���ڸ� �Է��Ͽ� ����ϴ� ���α׷��� �ۼ��մϴ�.
		// ��, �Է��ϴ� �߿� �̹� �Է��� ��ȣ�� ���� ��ȣ�� �Է��ϸ� �ߺ� ���� �޽����� ����ϰ� ���� �Է��մϴ�.
		int[] lotto = new int[6];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < lotto.length; i++) {
		System.out.println("�ζǹ�ȣ �Է�: ");
		lotto[i] = sc.nextInt();

		for (int j = 0; j < i; j++) {
		if (lotto[i] == lotto[j]) {
		System.out.println("���� ��ȣ�� �ֽ��ϴ�!");
		i--;
		}
		}
		}
		System.out.print("�Էµ� �ζ� ��ȣ : ");
		for(int i=0;i<lotto.length;i++) {
		System.out.print(lotto[i]+" ");
		}


	}

}
