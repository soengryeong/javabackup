
public class javaClass5 {

	public static void main(String[] args) {
		//if�� �ȿ� if�� ����� �� ����.
		//�� �� ���߿� �ϳ���
		//���� ���� ���� �� �׷��� �ǰ� �ȱ׷��� �ǰ�
		//������ �ذ� ���� �� �׷��� �ǰ� �ȱ׷��� �ǰ�
		String nowData="��";
//		if(nowData.equals("��")) {
//			System.out.println("��");
//		}else {
//			System.out.println("��");
//		}
		boolean isDay=true;//���̸� true
		boolean isStar=true; //true�� �� �׸���
		boolean isCloud=true; //true�� ���� �׸���
		
		if(isDay) {
			System.out.println("��");
		}else {
		    System.out.println("��");
			}
		if(isDay&&isCloud) { //isDay true isCloud==true
			System.out.println("����"); //$$�� �� ��� true�϶� ����Ǵ� ������
		}
		if(isDay==false&&isStar==true) {
			System.out.println("��");
		}
		// || ��  �Ѵ� false�� �� ����../
//		if(isDay) {
//			System.out.println("��");
//			if(isCloud) {
//				System.out.println("����");
//			}
//		}else {
//			System.out.println("��");
//			if(isStar) {
//				System.out.println("��");
//			}
			
		}
	}

	//System.out.println(true true&&false);}
