package com.human.ex;

class Product{
	public static int totalCount=0; //전체 상품종류 개수
	public String name; //상품이름
	public int count = 0; //상품개수
	//입고,출고,내용
	public void add(int count) {
		this.count=this.count+count;
	}
	public void min(int count) {
		this.count=this.count-count;
	}
	public void display() {
		System.out.println("전체 상품종류 개수:"+Product.totalCount);
		System.out.println("상품 이름:"+this.name);
		System.out.println("상품 개수:"+this.count);
	}
	//생성자
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
	// Product 클래스
	// 생성한 상품개수 저장
	// 상품명
	// 재고 수량
	// 재고 추가
	// 재고 소진
	// ProductManager 클래스 상품들을 관리하는 프로그램

	public static void main(String[] args) {
		Product p1 = new Product("새우깡",100);
		Product p2 = new Product("바나나킥",100);
		Product p3 = new Product("젤리",100);
		//새우깡 4개 판매
		p1.min(-4);
		//바나나킥 10개 입고
		p2.add(10);
		
		p1.display();
		p2.display();
		p3.display();

	}

}
















