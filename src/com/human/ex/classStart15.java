package com.human.ex;

class MProduct{
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
		System.out.println("전체 상품종류 개수:"+MProduct.totalCount);
		System.out.println("상품 이름:"+this.name);
		System.out.println("상품 개수:"+this.count);
	}
	//생성자
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
	// Product 클래스
	// 생성한 상품개수 저장
	// 상품명
	// 재고 수량
	// 재고 추가
	// 재고 소진
	// ProductManager 클래스 상품들을 관리하는 프로그램

	public static void main(String[] args) {
		//사용자 입력을 받았을 때
		MProduct p1 = new MProduct("새우깡",100);
		MProduct p2 = new MProduct("바나나킥",100);
		MProduct p3 = new MProduct("젤리",100);
		//새우깡 4개 판매
		p1.min(-4);
		//바나나킥 10개 입고
		p2.add(10);
		
		p1.display();
		p2.display();
		p3.display();
		
		MProduct arr[] = new MProduct[5];
		arr[0]=p1;
		arr[1]=p2;
		arr[2]=p3;
	    arr[3]=new MProduct("노트",10); //<=새로운 품목 들어오면 이렇게 설정
		
		//사용자의 입력을 받아 해당 품목 내용을 화면에 출력하자.
	    System.out.println("------------------------");
	    String input="바나나킥";
	    for(MProduct p:arr) {
	    	if(p!=null) {
	        if(p.name.equals(input)){
	        	p.display();
	        }
	    	}
	    }
	    //101이하인 상품 개수 출력하는 프로그램
	    System.out.println("------------------------");
	    int number=101;
	    for(int i=0; i<MProduct.totalCount; i++) {
	    	if(arr[i].count<number){
	    	   arr[i].display();
	    	}
	    }
	   
	    

	}

}
















