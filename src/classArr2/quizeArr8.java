package classArr2;

public class quizeArr8 {

	public static void main(String[] args) {
		// 특정한 값 탐색하기
		
				int b3[] = {10,20,30,40,50,60,70,80,90,100};
				java.util.Scanner sc=new java.util.Scanner(System.in);
				System.out.println("탐색할 값을 입력하시요. 10~100 10단위");
				int input = Integer.parseInt(sc.nextLine());
				for(int i=0; i<10; i++) {
					if(b3[i]==input) {
						System.out.println("탐색성공 인덱스 값 : "+(i+1));
					}

	}
	}
}
