import java.util.Random;

public class javaClass4 {

	public static void main(String[] args) {
		// 
//		java.util.Random ram=0~5;
//		new java.util.Ramdom();
//		int a=ran.nextInt(5)+5;
		//0이 가위 1이 바위 2가 보
        java.util.Scanner scan=new java.util.Scanner(System.in); 
		System.out.print("0~2중 하나만 입력해보세요:");
		int i1=Integer.parseInt(scan.nextLine());
		int a=i1;
		switch (a) {
	    case 0: 
	    System.out.println("가위");
	         break;
	    case 1: 
	    System.out.println("바위");
		     break;
	    case 2: 
	    System.out.println("보");
	         break;
	    default:
		System.out.println("제외입니다");   
		
		}

	}
}
		
  

