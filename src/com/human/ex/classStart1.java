package com.human.ex;
//Card card�� ����, card�� �ʺ�, card�� ���, card�� ����
public class classStart1 {
//class Card{ 
//  Ŭ���� �ȿ� ������ �͵�	
//	1. �ν��Ͻ� �ʵ� (����,�ɹ�����)
//	2. Ŭ���� �ʵ� (����,static����, ��������)
//	3. �ν��Ͻ� �޼ҵ�
//  4. Ŭ���� �޼ҵ�
//  5. ������ �޼ҵ� 

//}
// Card c1=new Card(); // c1�� �ν��Ͻ�ȭ �Ǿ���.
// Card c2=new Card();
/* ��ü
 * �ν��Ͻ� ��ü�� ����� �� �ֵ��� �޸𸮿� �ö� ����
 * Ŭ���� ���� ���α׷����� ��ü ������ �� ����ϴ� Ű����
 * //  Ŭ���� �ȿ� ������ �͵�	
 *	1. �ν��Ͻ� �ʵ� (����,�ɹ�����)
 *     ->������ �ν��Ͻ����� ���� ���� ������ ����
 *	2. Ŭ���� �ʵ� (����,static����, ��������)
 *     ->��� �ν��Ͻ����� ���� �����ϴ� ����
 *	3. �ν��Ͻ� �޼ҵ�
 *  4. Ŭ���� �޼ҵ�
 *  5. ������ �޼ҵ�
 * 
 * 
 * �ν��Ͻ� Ŭ������ ������ ��ü
 * Ŭ���� ��ü������� �����س��� Ű����
 */
class Card{
	public static int width=100; //Ŭ�����ʵ�
	public static int height=200; //Ŭ�����ʵ�
	public String shape="�����̵�"; //�ν��Ͻ� �ʵ�
	public String number="2"; //�ν��Ͻ� �ʵ�
	//ī�忡 ���̸� �����ϴ� �Լ��� ������.
	// Ŭ���� �޼ҵ�
	public static int area() {
		return Card.height*Card.width;
	}
	//�ν��Ͻ� �޼ҵ�
	public String cardDisplay() {
		return shape+number;
	}
	
}
	public static void main(String[] args) {
		System.out.println(Card.area());
		//System.out.println(Card.cardDisplay());
		Card c=new Card();
		System.out.println(c.cardDisplay());

	}

}
