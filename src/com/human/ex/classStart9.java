package com.human.ex;

class MyRectangle {
	private int width = 0; //음수 입력안되게 private로 선언 (외부 접근제어자)
	private int height = 0;
	// 둘레
	public static int border(int w, int h) {
		return 2 * w + 2 * h;
	}
	// 넓이
	public static int area(int w, int h) {
		return w * h;
	}
	// 둘레
     public int border() {
		return 2 * this.width + 2 * this.height;
	}
	// 넓이
	public int area() {
		return this.width * this.height;
		}
	// setter getter
	public void setWidth(int width) {
		if(width<0) {
			this.width=0;
		}else {
		    this.width=width;
     	}
	}
	public int getWidth() {
		return this.width;
	}
	// 생성자
	public MyRectangle() {}
	public MyRectangle(int length) {
		this(length,length);
	}
	
	public MyRectangle(int width, int height) {
		if(width<0 || height <0) { //음수 입력시 0으로 변경되도록 설정.
			this.width=0;
			this.height=0;
		}
		this.width = width;
		this.height = height;	
	}
}
public class classStart9 {

	public static void main(String[] args) {
		// 사각형 넓이와 둘레 구하는 프로그램 구현
		int x=10;
		int y=20;
		
		MyRectangle re = new MyRectangle(x,y);
		// re.width=10; private 다른 클래스에서 접근할 수 없다.
		// 캡슐화. 직접 접근하면 음수가 들어 갈 수 있다.
		// 막는 작업을 구현할 수 있는 메소드들을 setter getter라 말한다.
	
		int area = re.area();
		int border = re.border();
		
		System.out.println("출력:area="+area+"/"+"border="+border);
		
		//간단히 두 수의 넓이와 둘레는 메소드 구현
//		System.out.println(Math.max(100, 78));
		
		System.out.println("출력:area="+MyRectangle.area(15, 11)+
				"/"+"border="+MyRectangle.border(10, 5));

	}

}















