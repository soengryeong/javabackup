package classArr2;

public class quizeArr8 {

	public static void main(String[] args) {
		// Ư���� �� Ž���ϱ�
		
				int b3[] = {10,20,30,40,50,60,70,80,90,100};
				java.util.Scanner sc=new java.util.Scanner(System.in);
				System.out.println("Ž���� ���� �Է��Ͻÿ�. 10~100 10����");
				int input = Integer.parseInt(sc.nextLine());
				for(int i=0; i<10; i++) {
					if(b3[i]==input) {
						System.out.println("Ž������ �ε��� �� : "+(i+1));
					}

	}
	}
}
