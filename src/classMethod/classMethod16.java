package classMethod;

public class classMethod16 {

	public static void main(String[] args) {
		//3,6,9으로 끝나는수에 짝 , 10에 만세
		for(int i=1; i<100; i++) {
			if(i%10==0) {
				System.out.println(" 만세 ");
				continue;
			}
			if(i>=10 && i/10%10%3==0) {
				System.out.println("짝");
			}
			//%10하면 마지막수만 남음.
			if(i%10%3==0) {
				System.out.println("짝");
			}else if(i>=10 && i/10%10%3==0) {
			}else {
				System.out.println(" "+i+" ");
			}
		}
	}
}
