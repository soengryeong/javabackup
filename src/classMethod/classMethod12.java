package classMethod;

public class classMethod12 {
	//���� ���ڿ��� �����´ٰų� �����Ͽ� �����ʰ� ���� �����Ͽ� ����. 
	//String�� �������ߺ��� ��.
	public static String stringFunc(String a) {
		String s = null;
		s = a + "�ϼ���";
		return s;
	}

	public static void main(String[] args) {
		String s = "�ȳ�";
		s = stringFunc(s);
		System.out.println(s);
	}

}
