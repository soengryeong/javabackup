package com.human.ex;

class Rectangle{
	private int width=0;
	private int height = 0;
	// height�� setter ���� �����ϴ� �޼ҵ�
	public void setHeight(int height) {
		if(height<0) {
			height=0;
			
		}
		this.height=height;
	// height�� getter ���� �����ϴ� �޼ҵ�	
	}
	public int getHeight() {
		return this.height;
	}
	// width�� setter ���� �����ϴ� �޼ҵ� 
	public void setWidth(int width) {
		if(width<0) {
			width=0;
		}
		this.width=width;
	}
	// width��getter ���� �о���� �޼ҵ�
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
	// �簢�� ���̸� ���ϴ� �޼ҵ带 ������ ��ü�� ����� ���簢�� ���̸� ���غ���
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
