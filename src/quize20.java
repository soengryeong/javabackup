
public class quize20 {

	public static void main(String[] args) {
		// 자동차 연료 탱크프로그램을 시뮬레이션해보자.
		// 초기값은 1000리터이고, 사용자가 주행을 하면 연료가 줄어든다.
		// 반복문을 사용하여 사용자로부터 충전 또는 사용한 연료를 입력받아서
		// 연료 탱크에 남아있는 연료가 10%미만 이면 경고를 출력하도록 한다.
		int oil=1000;
		int sum=0;
		System.out.println("초기연료량:1,000");
		
		while(true) {
			for(;;) {
		System.out.print("연료충전은 +,소모는 -로 입력하세요:");
		java.util.Scanner re=new java.util.Scanner(System.in);
	    int num1 = Integer.parseInt(re.nextLine());
	    oil = oil + num1;
	    System.out.println("현재 남아있는 양은 "+oil+"입니다");
	    
	    if(oil<=10) {
	    	System.out.println("경고! 연료가 10리터이하 입니다!");
	    
	    }else {
	    	break;
	    }
		}
		}
			
		
		
	}

}
