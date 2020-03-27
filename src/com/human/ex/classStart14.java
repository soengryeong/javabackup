package com.human.ex;

//��ǰ���� ���α׷�
//1. ��ǰ���
//2. �԰�
//3. ���
//4. ��ǰ�˻�
//5. ��ǰ ��� Ȯ��

class ProductManager {
	public static java.util.Scanner sc = new java.util.Scanner(System.in);
	public int arrIndex = 0;
	public Product[] arrProduct = new Product[10];

	public void Start() {
		String menu="";
		registTestDate();
		while(!menu.equals("0")) {
		System.out.println("��ǰ ���� ���α׷�");
		System.out.println("1.��ǰ��� 2.�԰� 3.��� 4.��ǰ�˻� 5.��ǰ��� Ȯ�� 0.����");
		System.out.print(">>");
		menu=sc.nextLine();
		System.out.println("==============================");
		switch(menu) {
		case "1":
		registProduct();
		System.out.println("==============================");
		break;
		case "2":
		inputProduct();
		System.out.println("==============================");
		break;
		case "3":
		outputProduct();
		System.out.println("==============================");
		break;
		case "4":
		System.out.print("�˻��� ��ǰ�� �Է�: ");
		String name=sc.nextLine();
		searchProdcut(name).display();
		System.out.println("==============================");
		break;
		case "5":
		displayProdcut();
		System.out.println("==============================");
		break;
		case "0":
		System.out.println("���α׷� ����");
		break;
		}
		}
		}
	// 1.��ǰ���
	public void registTestDate() {
		Product p1 = new Product("���", 100);
		registProduct(p1);
		Product p2 = new Product("�ٳ���", 100);
		registProduct(p2);
		Product p3 = new Product("���", 100);
		registProduct(p3);
		Product p4 = new Product("ü��", 100);
		registProduct(p4);
	}
	public void registProduct(Product p) {
		arrProduct[arrIndex++] = p;
		// arrProduct[Product.totalCount-1] = p;
	}
	public void registProduct() {
		// arrProduct[0] = new Product("�ٳ���ű",10);
		System.out.println("��ǰ���������");
		System.out.println("��ǰ��>>");
		String name = sc.nextLine();
		System.out.println("��ϰ���>>");
		int count = Integer.parseInt(sc.next());
		arrProduct[arrIndex++] = new Product(name, count);
	}
	// 2. �԰�
	public void inputProduct() {
		System.out.println("�԰��� ��ǰ�Է�>>");
		String name = sc.nextLine();
		System.out.println("�԰��� ��ǰ�����Է�>>");
		int count = Integer.parseInt(sc.nextLine());

		Product p = searchProdcut(name);
		if (p == null) {
			System.out.println("���� ��ǰ�Դϴ�.");
		} else {
			p.count = p.count + count;
		}
		p.display();

	}

	// 3. ���
	public void outputProduct() {
		System.out.println("����� ��ǰ�Է�>>");
		String name = sc.nextLine();
		System.out.println("����� ��ǰ�����Է�>>");
		int count = Integer.parseInt(sc.nextLine());

		Product p = searchProdcut(name);
		if (p == null) {
			System.out.println("���� ��ǰ�Դϴ�.");
		} else {
			p.count = p.count - count;
		}
		p.display();

	}
    // 4. ��ǰ�˻�
	public Product searchProdcut(String name) {
		Product returnValue = null;
		for (int i = 0; i < arrIndex; i++) {
			if (arrProduct[i].name.equals(name)) {
				returnValue = arrProduct[i];
				break;
			}
			;
		}
		return returnValue;

	}
	// 5. ��ǰ��� Ȯ��
	public void displayProdcut() {
		for (int i = 0; i < Product.totalCount; i++) {
			arrProduct[i].display();
		}
	}
}
public class classStart14 {
	
	public static void main(String[] args) {
		 ProductManager pm=new ProductManager();
		 pm.Start();
		
	}
}
