package classMethod;

public class classMethod10 {
	// 메소드 오후 시간 추가 수업 내용
	// 자기 자신을 호출하는 함수를 재귀호출이라고 한다.
			
	public static void b() {
		System.out.println("b함수 시작");
    	System.out.println("b함수 종료");
	}
    public static void a() {
    	System.out.println("a함수 시작");
    	d();
    	System.out.println("a함수 종료");
    }
    public static void c() {
    	System.out.println("c함수 시작");
    	c();
    	System.out.println("c함수 종료");
    }
    public static void d() {
    	System.out.println("d함수 시작");
    	System.out.println("d함수 종료");
    }
	public static void main(String[] args) {
		a();
		c();
		d();

	}

}
