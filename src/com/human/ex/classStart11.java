package com.human.ex;

class Product{
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
		System.out.println("��ü ��ǰ���� ����:"+Product.totalCount);
		System.out.println("��ǰ �̸�:"+this.name);
		System.out.println("��ǰ ����:"+this.count);
	}
	//������
	public Product() {
		Product. totalCount++;
	}
	public Product(String name) {
		this(name,0);
	}
	public Product(String name, int count) {
		this();
		this.name=name;
		this.count=count;
	}
}

public class classStart11 {
	// Product Ŭ����
	// ������ ��ǰ���� ����
	// ��ǰ��
	// ��� ����
	// ��� �߰�
	// ��� ����
	// ProductManager Ŭ���� ��ǰ���� �����ϴ� ���α׷�

	public static void main(String[] args) {
		Product p1 = new Product("�����",100);
		Product p2 = new Product("�ٳ���ű",100);
		Product p3 = new Product("����",100);
		//����� 4�� �Ǹ�
		p1.min(-4);
		//�ٳ���ű 10�� �԰�
		p2.add(10);
		
		p1.display();
		p2.display();
		p3.display();

	}

}
















