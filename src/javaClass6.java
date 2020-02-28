
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
		
		//다음과 같이 사람의 몸무게와 키를 입력받아 비만도를 출력하는 프로그램을 작성하세요.
		//그리고 비만도가 20이하면 '저체중', 20이상 25 미만이면 '표준체중', 25이상이면
		//'과체중'이 출력되도록 하세요. 비만도는 (키/100)*(키/100)으로 계산합니다.
		java.util.Scanner sp=new java.util.Scanner(System.in);
		System.out.println("몸무게와 키를 입력하세요:");
		int a=Integer.parseInt(sp.nextLine());
		int b=Integer.parseInt(sp.nextLine());
		int c=(a/100)*(a/100); //이게 비만도
		if(19<c&&c>25) {
			System.out.println(c+"로 표준체중입니다.");
		}else if(c<21) {
			System.out.println(c+"저체중입니다.");
		}else
			System.out.println(c+"과체중입니다.");
			
		
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
