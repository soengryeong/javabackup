package classMethod;

public class classMethod04 {
	// 1. 메소드의 지역변수는 메소드가 실행이 되면 stack에 올라간다.
	// 2. 메소드 간 지역 변수는 공유되지 않는다.
	// 3. 메소드가 종료되면 메모리에서 사라진다.
	// 4. 코드블럭의 지역변수는 코드블럭이 종료되면 사라진다.
	
	// 문제3. 두 수 사이 수의 합을 구하는 함수를 만들어 사용해보자. 5,2   2,5
    public static int SumAll(int a, int b) {
    	int sum = 0;
    	if(a>b) {
    		int temp;
    		temp=a;
    		a=b;
    		b=temp;
    	} //b가 항상 큰수가 됨
        for(int i=a;i<=b;i++) {
        	sum=sum+i;
        }
    	return sum;
    }
	public static void main(String[] args) {
		int a=10, b=12;
		System.out.println(SumAll(a,b));
		System.out.println(SumAll(4,1));
		
		

	}

}
