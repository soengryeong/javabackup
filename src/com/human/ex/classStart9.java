package com.human.ex;

class MyRectangle {
	private int width = 0; //���� �Է¾ȵǰ� private�� ���� (�ܺ� ����������)
	private int height = 0;
	// �ѷ�
	public static int border(int w, int h) {
		return 2 * w + 2 * h;
	}
	// ����
	public static int area(int w, int h) {
		return w * h;
	}
	// �ѷ�
     public int border() {
		return 2 * this.width + 2 * this.height;
	}
	// ����
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
	// ������
	public MyRectangle() {}
	public MyRectangle(int length) {
		this(length,length);
	}
	
	public MyRectangle(int width, int height) {
		if(width<0 || height <0) { //���� �Է½� 0���� ����ǵ��� ����.
			this.width=0;
			this.height=0;
		}
		this.width = width;
		this.height = height;	
	}
}
public class classStart9 {

	public static void main(String[] args) {
		// �簢�� ���̿� �ѷ� ���ϴ� ���α׷� ����
		int x=10;
		int y=20;
		
		MyRectangle re = new MyRectangle(x,y);
		// re.width=10; private �ٸ� Ŭ�������� ������ �� ����.
		// ĸ��ȭ. ���� �����ϸ� ������ ��� �� �� �ִ�.
		// ���� �۾��� ������ �� �ִ� �޼ҵ���� setter getter�� ���Ѵ�.
	
		int area = re.area();
		int border = re.border();
		
		System.out.println("���:area="+area+"/"+"border="+border);
		
		//������ �� ���� ���̿� �ѷ��� �޼ҵ� ����
//		System.out.println(Math.max(100, 78));
		
		System.out.println("���:area="+MyRectangle.area(15, 11)+
				"/"+"border="+MyRectangle.border(10, 5));

	}

}















