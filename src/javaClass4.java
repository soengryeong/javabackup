import java.util.Random;

public class javaClass4 {

	public static void main(String[] args) {
		// 
//		java.util.Random ram=0~5;
//		new java.util.Ramdom();
//		int a=ran.nextInt(5)+5;
		//0�� ���� 1�� ���� 2�� ��
        java.util.Scanner scan=new java.util.Scanner(System.in); 
		System.out.print("0~2�� �ϳ��� �Է��غ�����:");
		int i1=Integer.parseInt(scan.nextLine());
		int a=i1;
		switch (a) {
	    case 0: 
	    System.out.println("����");
	         break;
	    case 1: 
	    System.out.println("����");
		     break;
	    case 2: 
	    System.out.println("��");
	         break;
	    default:
		System.out.println("�����Դϴ�");   
		
		}

	}
}
		
  

