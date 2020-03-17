
public class quize21 {

	public static void main(String[] args) {
		// 1~1000까지 출력하되 숫자 10개를 출력하고 행을 바꾸는 프로그램을 만드시오.
		int a;
		int b=0;
		for(a=1; a<=1000; a++) {
			System.out.print(a+"\t");
			b++;
			if(b%10==0) {
				System.out.println();
			}
		}
		}

	}


