package classMethod;

public class ClassMethod01 {
    public static int sum(int a, int b) {
    	int sum=0;
    	sum = a+b;
    	return sum;
    	//sum = sum+1; ->리턴다음에 뭐가 오면 안됨	
    }
    public static int min(int a,int b) {
    	return a-b;
    }
    public static int mul(int a,int b) {
    	return a*b;
    }
    public static int div(int a,int b) {
    	return a/b;
    }
	public static void main(String[] args) {
		int a=sum(1,2);
		int b=a+sum(2,2);
		System.out.println(a+b);
		System.out.println(mul(a,b));
		
		
		

	}

}
