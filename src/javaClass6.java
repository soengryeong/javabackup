
public class javaClass6 {

	public static void main(String[] args) {
		//else if
		//90이상 "수"
		//80이상"우"
		//70이상"미"
		//나머지는 "양"
		
//		int i=100;
//		if(i>=90) {
//			System.out.println("수");
//		}else if(i>=80) {
//			System.out.println("우");
//		}else if(i>=70) {
//			System.out.println("미");
//		}else {
//			System.out.println("양");
//		}
		//switch
		// 11/10==1
		//월을 입력받아서 해당 월이 몇일인지 출력하시오.
		
		int month=0;
		int day=0;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("월(month)을 입력하세요:");
		month = sc.nextInt();
		switch(month) {
		case 1:
			System.out.println("1월입니다");
		case 2:
			System.out.println("2월입니다");
		case 3:
			System.out.println("3월입니다");
		case 4:
			System.out.println("4월입니다");
		case 5:
			System.out.println("5월입니다");
		case 6:
			System.out.println("6월입니다");
		case 7:
			System.out.println("7월입니다");
		case 8:
			System.out.println("8월입니다");
		}
		
			
			
		
//		if(조건1) {
//			//조건1이 참일 때 실행
//		}else if(조건2) {
//			//조건2가 참일때 실행
//		}else if(조건3 ) {
//			//조건3이 참일때 실행
//		}else {
//			//조건1,2,3에 해당사항이 없으면 출력
//		}
		
		

		

	}

}
