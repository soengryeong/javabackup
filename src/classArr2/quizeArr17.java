package classArr2;

import java.util.Scanner;

public class quizeArr17 {

	public static void main(String[] args) {
		// 1부터 45까지의 수 중에 6개의 숫자를 입력하여 출력하는 프로그램을 작성합니다.
		// 단, 입력하는 중에 이미 입력한 번호와 같은 번호를 입력하면 중복 오류 메시지를 출력하고 새로 입력합니다.
		int[] lotto = new int[6];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < lotto.length; i++) {
		System.out.println("로또번호 입력: ");
		lotto[i] = sc.nextInt();

		for (int j = 0; j < i; j++) {
		if (lotto[i] == lotto[j]) {
		System.out.println("같은 번호가 있습니다!");
		i--;
		}
		}
		}
		System.out.print("입력된 로또 번호 : ");
		for(int i=0;i<lotto.length;i++) {
		System.out.print(lotto[i]+" ");
		}


	}

}
