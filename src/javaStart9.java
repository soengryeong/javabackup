
public class javaStart9 {

	public static void main(String[] args) {
		// 배열 a에 1,2,3 으로 초기화한 후 배열의 값에 2를 더한 값으로 변경한 
		// 다음에 배열의 내용을 화면에 출력하는 순서도와 프로그램을 구현하시오.
		int a[]= {1,2,3};
		// 해당 인덱스를 읽어와서 2를 더한 다음에 다시 해당 인덱스에 넣는다.
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
		//배열안에 가장 큰수와 가장 작은 수 출력
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
