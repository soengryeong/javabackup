
public class javaClass2 {
	public static void main(String[] args) {
		java.util.Scanner sr=new java.util.Scanner(System.in);
		int comNum = (int) (Math.random() * 3) + 1;  // 1 ~ 3 ������ ���� �߻�
		System.out.print("1����, 2����, 3�� �Է�: ");
		int myNum=sr.nextInt();  // int�� ����ڰ� �Է� �ޱ�
		System.out.print("��ǻ�Ͱ� ");
		if (comNum == 1) {
			System.out.print("����");
		} else if (comNum == 2) {
			System.out.print("����");			
		} else {
			System.out.print("��");
		}
		System.out.println("�� �½��ϴ�.");		
		System.out.print("����ڰ� ");

		if (myNum == 1) {
			System.out.print("����");
		} else if (myNum == 2) {
			System.out.print("����");			
		} else {
			System.out.print("��");
		}	

		System.out.println("�� �½��ϴ�.");		
		// �̰���ϴ�.
		// �����ϴ�.
		// �����ϴ�.
		if (comNum == myNum) { // ��ǻ�Ϳ� ����ڰ� ���� ���� �´ٸ�,
			System.out.println("�����ϴ�.");				
		} else if ((comNum == 1 && myNum == 2) || (comNum == 2 && myNum == 3) || (comNum == 3 && myNum == 1)) {
			System.out.println("�̰���ϴ�.");
		} else {
			System.out.println("�����ϴ�.");			
		}




		sr.close();  // Scanner ��� �� close ���ֱ�.

	}
}


