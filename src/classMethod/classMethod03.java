package classMethod;

public class classMethod03 {
	// ����2. �Ű������� ���� ���� ���� �Լ��� �̿��ؼ� "�ȳ��ϼ���"�̶�� ������ ����ϴ� �Լ�
	//    hello�� ����� ���α׷� ������ �ǹ��ϴ� �����Լ����� ��� �Լ��� ������ ȣ���Ͽ�
	//    "�ȳ��ϼ���"�� ����ϴ� ���α׷��� ���� ����غ���.
	public static void hello() {
		System.out.println("�ȳ��ϼ���");
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
