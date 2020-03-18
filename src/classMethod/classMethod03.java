package classMethod;

public class classMethod03 {
	// 문제2. 매개변수와 리턴 값이 없는 함수를 이용해서 "안녕하세요"이라는 내용을 출력하는 함수
	//    hello를 만들고 프로그램 시작을 의미하는 메인함수에서 헬로 함수를 여러번 호출하여
	//    "안녕하세요"를 출력하는 프로그램을 만들어서 사용해보자.
	public static void hello() {
		System.out.println("안녕하세요");
        }
	public static void main(String[] args) {
		hello();
		hello();
		hello();
		for(int i=0; i<3; i++) {
			hello();
		}
		
		

	}

}
