
public class quize20 {

	public static void main(String[] args) {
		// �ڵ��� ���� ��ũ���α׷��� �ùķ��̼��غ���.
		// �ʱⰪ�� 1000�����̰�, ����ڰ� ������ �ϸ� ���ᰡ �پ���.
		// �ݺ����� ����Ͽ� ����ڷκ��� ���� �Ǵ� ����� ���Ḧ �Է¹޾Ƽ�
		// ���� ��ũ�� �����ִ� ���ᰡ 10%�̸� �̸� ��� ����ϵ��� �Ѵ�.
		int oil=1000;
		int sum=0;
		System.out.println("�ʱ⿬�ᷮ:1,000");
		
		while(true) {
			for(;;) {
		System.out.print("���������� +,�Ҹ�� -�� �Է��ϼ���:");
		java.util.Scanner re=new java.util.Scanner(System.in);
	    int num1 = Integer.parseInt(re.nextLine());
	    oil = oil + num1;
	    System.out.println("���� �����ִ� ���� "+oil+"�Դϴ�");
	    
	    if(oil<=10) {
	    	System.out.println("���! ���ᰡ 10�������� �Դϴ�!");
	    
	    }else {
	    	break;
	    }
		}
		}
			
		
		
	}

}
