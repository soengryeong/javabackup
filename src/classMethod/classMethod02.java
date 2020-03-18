 package classMethod;

 public class classMethod02 {
	 //문제1 4칙 연산을 실행하는 함수를 만들어서 사용해보자
	    public static int add(int a, int b) {
	    	int add=0;
	    	add = a+b;
	    	return add;
            }
	    public static int sub(int a, int b) {
	    	int sub=0;
	    	sub = a-b;
	    	return sub;
            }
	    public static int mul(int a, int b) {
	    	int mul=0;
	    	mul = a+b;
	    	return mul;
            }
	    public static int div(int a, int b) {
	    	int div=0;
	    	div = a/b;
	    	return div;
            }
	    public static void main(String[] args) {
			int a=add(1,2);
			int b=a+div(2,2);
			System.out.println(a+b);
		}
 }
 
 
 
