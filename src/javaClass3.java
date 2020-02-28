
public class javaClass3 {

	public static void main(String[] args) {
		java.util.Scanner scan=new java.util.Scanner(System.in); 
		//4-3 이항연산자
		//삼항연산자 A? B : C; -> 이건 if문이랑 같음
		//A=조건, B가 참, C가 거짓일 때 실행됨!
		
//		if(a>0) {
//			a=1;
//		}else {
//			a=-1;
//		}
//		System.out.println(a);
//		//이만큼을 삼항연산자로 바꾸면?
//		a=(a>0)?a=1:-1; 
//		System.out.println(a);
		//두 수 비교하는 if문 -> 삼항 연산자로 바꾸기
//		int a=10;
//		int b=8;
//		if(a>b) {
//			System.out.pritnln(a);
//		}else {
//			System.out.println(b);
//		}
//		
//		a=(a>b?10:8);
//		System.out.println(a)
		int count=2;
		int hap=0;
		switch (++count) {
		case 1: hap = hap +count++;
		case 2: hap = hap +count++;
		case 3: hap = hap +count++;
		case 4: hap = hap +count++;
		case 5: hap = hap +count++;
		}
		System.out.printf("hap의 값:%d\n",hap);
		return;

	}

}
