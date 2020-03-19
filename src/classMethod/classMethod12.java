package classMethod;

public class classMethod12 {
	//기존 문자열을 가져온다거나 변경하여 쓰지않고 새로 생성하여 만듬. 
	//String만 연산자중복이 됨.
	public static String stringFunc(String a) {
		String s = null;
		s = a + "하세요";
		return s;
	}

	public static void main(String[] args) {
		String s = "안녕";
		s = stringFunc(s);
		System.out.println(s);
	}

}
