
public class javaClass3 {

	public static void main(String[] args) {
		int brightness = 50;
		int p = 0;
		String color = "����";
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("������ �Է��ϼ���:");
		color = sc.next();
		for (;;) {
			System.out.println("��⸦ �÷��� 1��,�������� 2���� �����ּ���");
			p = sc.nextInt();
			switch (p) {
			case 1: {
				brightness++;
				break;
			}
			case 2: {
				brightness--;
				break;
			}
			default: {
				System.out.println("���� �÷���" + color + "���� ����" + brightness + "�̴�");
				return;

			}
			}
			System.out.println("���� ����:" + brightness);
		}

	}
}
