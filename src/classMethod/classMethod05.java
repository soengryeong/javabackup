package classMethod;

public class classMethod05 {
	// 1. ���α׷� ��â�� ���� �ﰢ�� �� ���� ȭ�鿡 ����ϴ� �Լ�. ����� �̸��� ����
	// ������ ���� ����� triangle(), triangle2(), triangle3() �� �Լ���
	// ȣ���ؼ� ȭ�鿡 �ﰢ���� ��µǵ��� ����� ����.
	
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
