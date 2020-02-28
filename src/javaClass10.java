import java.util.Arrays;
class Cat{
	public int age=0;
	public String name="없음";
	@Override
	public String toString() {
		return "Cat [age=" + age + ", name=" + name + "]";
	}
	
}
public class javaClass10 {

	public static void main(String[] args) {
		//배열-> 같은 자료 형을 여러개 선언할 때 사용
		//int a1,a2,a3 ; ->만약 1000개 선언하려면? 
		//int [] arrI=new int[5]; ->이렇게 한번에 5개 생성가능.
		//배열의 값에 접근하려면 인덱스를 사용한다.
		//arrInt[0] arrInt[1] 
		//인텍스는 0부터 시작한다.
		//new int[5]; ->여기서 인덱스는 0~4까지 이다. 
		// arrInt[5]는 안된다!!
		
//		boolean b1=true;
//		boolean b2=false;
//		boolean [] bArray=new boolean[4]; //0~3
//		bArray[0]=false; //안에 0이있으면 공간 하나다 ..위에는 공간 여러개 
//		bArray[1]=b1;
//		bArray[2]=bArray[0];
//		bArray[3]=true;
//		
//		System.out.println(bArray[0]+":"+bArray[1]+":"+
//				bArray[2]+":"+bArray[3]);
//		System.out.println(java.util.Arrays.toString(bArray));
		
		//정수형 
		//int를 저장할 수 있는 배열 선언하려면?
//		int i1=5;
//		int i2=23;
//		int iArray[]=new int[4];
//		iArray[0]=1;
//		iArray[1]=i1;
//		iArray[2]=iArray[0]+iArray[1];
//		iArray[3]=iArray[2]+4;
//		System.out.println(Arrays.toString(iArray));
		
//		double d1=5;
//		double d2=23;
//		double dArray[]=new double[4];
//		dArray[0]=1;
//		dArray[1]=d1;
//		dArray[2]=dArray[0]+dArray[1];
//		dArray[3]=dArray[2]+4;
//		System.out.println(Arrays.toString(dArray));
		
		//string 배열 출력
//		String str1="hello1";
//		String str2=new String("hello2"); //Stirng은 참고자료형이라고 했지만 new String 넣어줘야함..
//		String []sArray=new String[4];
//		sArray[0]=str1;
//		sArray[1]=str2+str1;
//		sArray[2]=sArray[0];
//		sArray[3]=sArray[0]+"world";
//		System.out.println(sArrays[0].toString(sArray));
		//bArray->참조 자료형. 메모리 스택에는 주소가 있고 실제적인 것은 heap에 있음! 
		//[] ->대가로는 주소연산자라고 불림!
		
//		String st1="hello1";
//		String st2="hello1";
//		String st3=new String("hello1");
//		String st4=new String("hello1");
//		
//		System.out.println(sr1==st2);
//		System.out.println(sr1==st3);
//		System.out.println(sr3==st4);
//		
//		System.out.println(st1.equals(st2));
//		System.out.println(st1.equals(st3));
//		System.out.println(st3.equals(st4));
		
		Cat cat1=new Cat();
		cat1.name="고1";
		cat1.age=18;
		Cat cat2=cat1;
		cat2.name="고2";
		cat2.age=19;
		Cat cat3=new Cat();
		cat3.name="고3";
		cat3.age=20;
		
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);
		
		//Cat 클래스 array를 만들어 사용해보자.
		Cat [] cArr=new Cat[3]; 
		//Cat a; //스택에 주소를 저장할 수 있는 공간a
		//Cat a=new Cat(); 
		//스택에 주소를 저장할 수 있는 공간a도 잡히고
		//실제 고양이 데이터를 저장할 수 있는 공간이 힙에도 잡힘.
		//cArr[0].age=10; //null point exception
		cArr[0]=new Cat();
		cArr[0].age=11;
		cArr[0].name="고1";
		cArr[1]=cat1;
		cArr[2]=cat3;
		System.out.println(Arrays.toString(cArr));
		
		//객체 배열의 복사.
	
		
		
		
		
	
		
	
		

	}

}
