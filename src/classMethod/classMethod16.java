package classMethod;

public class classMethod16 {

	public static void main(String[] args) {
		//3,6,9���� �����¼��� ¦ , 10�� ����
		for(int i=1; i<100; i++) {
			if(i%10==0) {
				System.out.println(" ���� ");
				continue;
			}
			if(i>=10 && i/10%10%3==0) {
				System.out.println("¦");
			}
			//%10�ϸ� ���������� ����.
			if(i%10%3==0) {
				System.out.println("¦");
			}else if(i>=10 && i/10%10%3==0) {
			}else {
				System.out.println(" "+i+" ");
			}
		}
	}
}
