
public class javaClass3 {

	public static void main(String[] args) {
		java.util.Scanner scan=new java.util.Scanner(System.in); 
		//4-3 ���׿�����
		//���׿����� A? B : C; -> �̰� if���̶� ����
		//A=����, B�� ��, C�� ������ �� �����!
		
//		if(a>0) {
//			a=1;
//		}else {
//			a=-1;
//		}
//		System.out.println(a);
//		//�̸�ŭ�� ���׿����ڷ� �ٲٸ�?
//		a=(a>0)?a=1:-1; 
//		System.out.println(a);
		//�� �� ���ϴ� if�� -> ���� �����ڷ� �ٲٱ�
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
		System.out.printf("hap�� ��:%d\n",hap);
		return;

	}

}
