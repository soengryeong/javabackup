
public class javaStart9 {

	public static void main(String[] args) {
		// �迭 a�� 1,2,3 ���� �ʱ�ȭ�� �� �迭�� ���� 2�� ���� ������ ������ 
		// ������ �迭�� ������ ȭ�鿡 ����ϴ� �������� ���α׷��� �����Ͻÿ�.
		int a[]= {1,2,3};
		// �ش� �ε����� �о�ͼ� 2�� ���� ������ �ٽ� �ش� �ε����� �ִ´�.
		a[0]=a[0]+2;
		a[1]=a[1]+2;
		a[2]=a[2]+2;
		
		for(int i=0; i<3; i++) {
			a[i]=a[i]+2;
		}
		int sum=0;
		
		for(int i=0; i<3; i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		sum=0;
		for(int i:a) {
			System.out.println(i);
		}
		System.out.println(sum);
		
        sum=0;
		
		for(int i=0; i<3; i++) {
			if(a[i]%2!=0)
			sum=sum+a[i];
		}
		System.out.println(sum);
		sum=0;
		for(int i:a) {
			if(i%2!=0)
			sum=sum+i;
		}
		System.out.println(sum);
		//�迭�ȿ� ���� ū���� ���� ���� �� ���
		int max=a[0];
		int min=a[0];
		for(int i:a) {
			if(max<i)
			  max=i;
		}
		if(min>i) {
			min=i;
		}
		}
		System.out.println(min);
		System.out.println(max);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
