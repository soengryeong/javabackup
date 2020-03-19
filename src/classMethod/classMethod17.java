package classMethod;

public class classMethod17 {
	public static int total=0; //모든 지역에서 사용할 수 있다. 밖에 있는 클래스에서도 가능..
	public static int add(int num1, int i) {
		int sum=num1+i;
		total=total+sum;
		return sum;
	}
	
	public static void main(String[] args) {
	       int result=0;
	       int num1=10;
	       result=add(num1,30);
	       System.out.println(result);
	       System.out.println(classMethod17.total);
	       result=add(num1,40);
	       System.out.println(result);
	       System.out.println(classMethod17.total);
	
		

	}

	

}
