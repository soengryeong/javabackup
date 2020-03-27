package com.human.ex;

//상품관리 프로그램
//1. 상품등록
//2. 입고
//3. 출고
//4. 상품검색
//5. 상품 재고 확인

class ProductManager {
	public static java.util.Scanner sc = new java.util.Scanner(System.in);
	public int arrIndex = 0;
	public Product[] arrProduct = new Product[10];

	public void Start() {
		String menu="";
		registTestDate();
		while(!menu.equals("0")) {
		System.out.println("상품 관리 프로그램");
		System.out.println("1.상품등록 2.입고 3.출고 4.상품검색 5.상품재고 확인 0.종료");
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
		System.out.print("검색할 상품명 입력: ");
		String name=sc.nextLine();
		searchProdcut(name).display();
		System.out.println("==============================");
		break;
		case "5":
		displayProdcut();
		System.out.println("==============================");
		break;
		case "0":
		System.out.println("프로그램 종료");
		break;
		}
		}
		}
	// 1.상품등록
	public void registTestDate() {
		Product p1 = new Product("사과", 100);
		registProduct(p1);
		Product p2 = new Product("바나나", 100);
		registProduct(p2);
		Product p3 = new Product("멜론", 100);
		registProduct(p3);
		Product p4 = new Product("체리", 100);
		registProduct(p4);
	}
	public void registProduct(Product p) {
		arrProduct[arrIndex++] = p;
		// arrProduct[Product.totalCount-1] = p;
	}
	public void registProduct() {
		// arrProduct[0] = new Product("바나나킥",10);
		System.out.println("상품등록페이지");
		System.out.println("상품명>>");
		String name = sc.nextLine();
		System.out.println("등록개수>>");
		int count = Integer.parseInt(sc.next());
		arrProduct[arrIndex++] = new Product(name, count);
	}
	// 2. 입고
	public void inputProduct() {
		System.out.println("입고할 상품입력>>");
		String name = sc.nextLine();
		System.out.println("입고할 상품개수입력>>");
		int count = Integer.parseInt(sc.nextLine());

		Product p = searchProdcut(name);
		if (p == null) {
			System.out.println("없는 상품입니다.");
		} else {
			p.count = p.count + count;
		}
		p.display();

	}

	// 3. 출고
	public void outputProduct() {
		System.out.println("출고할 상품입력>>");
		String name = sc.nextLine();
		System.out.println("출고할 상품개수입력>>");
		int count = Integer.parseInt(sc.nextLine());

		Product p = searchProdcut(name);
		if (p == null) {
			System.out.println("없는 상품입니다.");
		} else {
			p.count = p.count - count;
		}
		p.display();

	}
    // 4. 상품검색
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
	// 5. 상품재고 확인
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
