
public class javaClass {

	public static void main(String[] args) {
		//19. 자판기 기능이 가능한 순서도를 만들어 보자. 
		//잔돈과 선택한 음료가 최종 결과로 출력 되도록 만들어 보자.
		// 콜라=500원 사이다=200원 환타=100원
		int input=1000; //넣는 잔돈
		int a=500; //콜라
		int b=200; //사이다
		int c=100; //환타
		int sum=0; //결과
		System.out.println("잔돈을 넣어주세요:");
		java.util.Scanner sc=new java.util.Scanner(System.in);
		input = Integer.parseInt(sc.nextLine());
		System.out.println("음료를 선택하세요/n 콜라(1번) 사이다(2번) 환타(3번):");
		a = Integer.parseInt(sc.nextLine());
		b = Integer.parseInt(sc.nextLine());
		c = Integer.parseInt(sc.nextLine());
		switch(input=0) {
			case 1 :
				    input = input-a;
			 		System.out.println("콜라를 선택하셨습니다 거스름돈은"+input+"입니다");
					
				}
				
			
		}
	
		



	}
}
