package classMethod;

import java.util.Scanner;


public class classMethod15 {
    public static void circle() {
        // ���� ���� ����=> (������)x(������)x2.14
        // ���� ���̸� ���ϱ����� ���� ���� = int di
    	Scanner re=new Scanner(System.in);
    	System.out.println("���ϰ��� �ϴ� ���� ������ �Է����ּ���:");
    	int di = re.nextInt();
    	int c = di/2;
    	double d = (c*2)*3.14;
    	System.out.println("���� ���̴�"+d+"�Դϴ�");
    	}
    public static void quadrangle() {
    	// �ﰢ�� ���� ���� = �غ��Ǳ���x����x2/1
    	// �ﰢ���� ���̸� ���ϱ� ���� �ʿ��� ����
    	// -> int e,f;
    	Scanner re=new Scanner(System.in);
    	System.out.println("���ϰ��� �ϴ� �ﰢ���� �غ��� ���̿� ���̸� �Է����ּ���:");
    	int e = re.nextInt();
    	int f = re.nextInt();
    	int g = (e*f)*1/2;
    	System.out.println("�ﰢ���� ���̴�"+g+"�Դϴ�");
     	
	}
    public static void triangle() {
    	// ���簢�� ���� ���� = ����x����
    	Scanner re=new Scanner(System.in);
    	System.out.println("���ϰ��� �ϴ� ���簢���� ���̿� ���̸� �Է����ּ���:");
    	int h = re.nextInt();
    	int i = re.nextInt();
    	int j = h*i;
    	System.out.println("���簢���� ���̴�"+j+"�Դϴ�");
     	
    }

	public static void main(String[] args) {
		// �޴��� � ������ ���̸� ���� ������ ����ڿ��� ��� ���� 
		// ���� ���� ���ϴ� �Լ� /�簢���� ���̸� ���ϴ� �Լ� /�ﰢ����
		// ���̸� ���ϴ� �Լ�/�� �̿��Ͽ� ���� ���ϴ�  �Լ��� ������
		int sum=0;
		boolean a =true;
		Scanner re=new Scanner(System.in);
		System.out.println("� ������ ���̸� ���Ͻǰǰ���? (1:��, 2:�ﰢ��, 3:�簢��)");
		int num = re.nextInt();
		switch(num) {
		case 1: 
			System.out.println("���� �����ϼ̽��ϴ�");
			circle();
			break;
		case 2:
			System.out.println("�ﰢ���� �����ϼ̽��ϴ�");
			quadrangle();
			break;
		case 3:
			System.out.println("�簢���� �����ϼ̽��ϴ�");
			triangle();
			break;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�");
	
		}
	}

}
