package com.human.ex;

class MProduct{
	public static int totalCount=0; //��ü ��ǰ���� ����
	public String name; //��ǰ�̸�
	public int count = 0; //��ǰ����
	//�԰�,���,����
	public void add(int count) {
		this.count=this.count+count;
	}
	public void min(int count) {
		this.count=this.count-count;
	}
	public void display() {
		System.out.println("��ü ��ǰ���� ����:"+MProduct.totalCount);
		System.out.println("��ǰ �̸�:"+this.name);
		System.out.println("��ǰ ����:"+this.count);
	}
	//������
	public MProduct() {
		MProduct. totalCount++;
	}
	public MProduct(String name) {
		this(name,0);
	}
	public MProduct(String name, int count) {
		this();
		this.name=name;
		this.count=count;
	}
}

public class classStart15 {
	// Product Ŭ����
	// ������ ��ǰ���� ����
	// ��ǰ��
	// ��� ����
	// ��� �߰�
	// ��� ����
	// ProductManager Ŭ���� ��ǰ���� �����ϴ� ���α׷�

	public static void main(String[] args) {
		//����� �Է��� �޾��� ��
		MProduct p1 = new MProduct("�����",100);
		MProduct p2 = new MProduct("�ٳ���ű",100);
		MProduct p3 = new MProduct("����",100);
		//����� 4�� �Ǹ�
		p1.min(-4);
		//�ٳ���ű 10�� �԰�
		p2.add(10);
		
		p1.display();
		p2.display();
		p3.display();
		
		MProduct arr[] = new MProduct[5];
		arr[0]=p1;
		arr[1]=p2;
		arr[2]=p3;
	    arr[3]=new MProduct("��Ʈ",10); //<=���ο� ǰ�� ������ �̷��� ����
		
		//������� �Է��� �޾� �ش� ǰ�� ������ ȭ�鿡 �������.
	    System.out.println("------------------------");
	    String input="�ٳ���ű";
	    for(MProduct p:arr) {
	    	if(p!=null) {
	        if(p.name.equals(input)){
	        	p.display();
	        }
	    	}
	    }
	    //101������ ��ǰ ���� ����ϴ� ���α׷�
	    System.out.println("------------------------");
	    int number=101;
	    for(int i=0; i<MProduct.totalCount; i++) {
	    	if(arr[i].count<number){
	    	   arr[i].display();
	    	}
	    }
	   
	    

	}

}
















