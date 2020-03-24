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
		// 국영수 과목 평균과 총점을 출력할 수 있는 객체를 만들어보자. student
		Student st=new Student(44,55,66);
		System.out.println(st.sum());
		System.out.println(st.avg());
		
	
		
				

	}

}
