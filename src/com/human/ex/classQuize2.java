package com.human.ex;

class Student{
	public int kor;
	public int eng;
	public int math;
	public Student() {}
	public Student(int k,int e, int m) {
		kor=k;
		eng=e;
		math=m;
	}
	public double sum() {
		return kor+eng+math;
	}
	public double avg() {
		return sum()/3;
	}
}
public class classQuize2 {
	public static void main(String[] args) {
		// ������ ���� ��հ� ������ ����� �� �ִ� ��ü�� ������. student
		Student st=new Student(44,55,66);
		System.out.println(st.sum());
		System.out.println(st.avg());
		
	
		
				

	}

}
