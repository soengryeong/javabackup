
public class javaClass12 {

	public static void main(String[] args) {
		//����� �Է� �߿� ���� ū ���� ���� ���� �� ���ϱ�
		//5��
		java.util.Scanner sy=new java.util.Scanner(System.in);
		int max,min; ///�ʱ�ȭ
		max=0;min=0;//-5,-3 ->���̳ʽ��� 0���� ������ ����.
		max=Integer.MIN_VALUE; //Integer�߿� ���� ���� ����� �ǹ�
		min=Integer.MAX_VALUE; //Integer�߿� ���� ū����� �ǹ�
		
		for(int i=0;i<5;i++) {
			System.out.print("���Է�>>");
			int input=Integer.parseInt(sy.nextLine());
			if(max<input) {
				max=input;
			}
			if(min>input) {
				min=input;
			}
		
		}
	   System.out.println("ū��:"+max+"������:"+min);

	}

}
