package com.human.ex;

class Rectangle{
	private int width=0;
	private int height = 0;
	// height의 setter 값을 세팅하는 메소드
	public void setHeight(int height) {
		if(height<0) {
			height=0;
			
		}
		this.height=height;
	// height의 getter 값을 세팅하는 메소드	
	}
	public int getHeight() {
		return this.height;
	}
	// width의 setter 값을 세팅하는 메소드 
	public void setWidth(int width) {
		if(width<0) {
			width=0;
		}
		this.width=width;
	}
	// width의getter 값을 읽어오는 메소드
	public int getWidth() {
		return this.width;
	}
	
    public Rectangle() {}
	public Rectangle(int width, int height) {
		if(width<0) {
			width=0;
		}
		if(height<0) {
			height=0;
		}
		this.width=width;
		this.height=height;
	}
	public int area() {
		return width*height;
	}
}

public class classQuize {
	// 사각형 넓이를 구하는 메소드를 포함한 객체를 만들어 직사각형 넓이를 구해보자
	// Rectangle
	    public static void main(String[] args) {
		Rectangle re=new Rectangle(12,6);
		re.setWidth(3);
		re.setHeight(6);
//		re.width=-1;
//		re.height=5;
		int area=re.area();
		System.out.println(area);
	
	}

}
