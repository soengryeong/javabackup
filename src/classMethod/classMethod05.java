package classMethod;

public class classMethod05 {
	// 1. 프로그램 초창기 만든 삼각형 세 개를 화면에 출력하는 함수. 선언부 이름을 각각
	// 다음과 같이 만들고 triangle(), triangle2(), triangle3() 각 함수를
	// 호출해서 화면에 삼각형이 출력되도록 만들어 보자.
	
    public static void  triangle() {
    	for(int i=0;i<4;i++){
    		for(int j=0;j<3-i;j++){
    			System.out.print(" "); 
    		}
    		for(int j=0;j<2*i+1;j++){
    			System.out.print("*"); 
    		}
    		System.out.println("");
    	}
    	
    }
    public static void  triangle2() {
    	for(int i=1;i<5;i++){
    		for(int j=4;j>0;j--){
    			if(i<j){
    				System.out.print(" ");
    			}else{
    				System.out.print("*");
    			}
    		}
    		System.out.println("");
    	}
    }
    public static void  triangle3() {
    	for(int i=1;i<5;i++){
    		for(int j=0;j<i;j++){
    			System.out.print("*");
    		}
    		System.out.println("");
    	}
    }
	public static void main(String[] args) {
		triangle3();

	}

}
