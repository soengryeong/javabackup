import java.util.Arrays;
class Cat{
	public int age=0;
	public String name="����";
	@Override
	public String toString() {
		return "Cat [age=" + age + ", name=" + name + "]";
	}
	
}
public class javaClass10 {

	public static void main(String[] args) {
		//�迭-> ���� �ڷ� ���� ������ ������ �� ���
		//int a1,a2,a3 ; ->���� 1000�� �����Ϸ���? 
		//int [] arrI=new int[5]; ->�̷��� �ѹ��� 5�� ��������.
		//�迭�� ���� �����Ϸ��� �ε����� ����Ѵ�.
		//arrInt[0] arrInt[1] 
		//���ؽ��� 0���� �����Ѵ�.
		//new int[5]; ->���⼭ �ε����� 0~4���� �̴�. 
		// arrInt[5]�� �ȵȴ�!!
		
//		boolean b1=true;
//		boolean b2=false;
//		boolean [] bArray=new boolean[4]; //0~3
//		bArray[0]=false; //�ȿ� 0�������� ���� �ϳ��� ..������ ���� ������ 
//		bArray[1]=b1;
//		bArray[2]=bArray[0];
//		bArray[3]=true;
//		
//		System.out.println(bArray[0]+":"+bArray[1]+":"+
//				bArray[2]+":"+bArray[3]);
//		System.out.println(java.util.Arrays.toString(bArray));
		
		//������ 
		//int�� ������ �� �ִ� �迭 �����Ϸ���?
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
		
		//string �迭 ���
//		String str1="hello1";
//		String str2=new String("hello2"); //Stirng�� �����ڷ����̶�� ������ new String �־������..
//		String []sArray=new String[4];
//		sArray[0]=str1;
//		sArray[1]=str2+str1;
//		sArray[2]=sArray[0];
//		sArray[3]=sArray[0]+"world";
//		System.out.println(sArrays[0].toString(sArray));
		//bArray->���� �ڷ���. �޸� ���ÿ��� �ּҰ� �ְ� �������� ���� heap�� ����! 
		//[] ->�밡�δ� �ּҿ����ڶ�� �Ҹ�!
		
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
		cat1.name="��1";
		cat1.age=18;
		Cat cat2=cat1;
		cat2.name="��2";
		cat2.age=19;
		Cat cat3=new Cat();
		cat3.name="��3";
		cat3.age=20;
		
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);
		
		//Cat Ŭ���� array�� ����� ����غ���.
		Cat [] cArr=new Cat[3]; 
		//Cat a; //���ÿ� �ּҸ� ������ �� �ִ� ����a
		//Cat a=new Cat(); 
		//���ÿ� �ּҸ� ������ �� �ִ� ����a�� ������
		//���� ����� �����͸� ������ �� �ִ� ������ ������ ����.
		//cArr[0].age=10; //null point exception
		cArr[0]=new Cat();
		cArr[0].age=11;
		cArr[0].name="��1";
		cArr[1]=cat1;
		cArr[2]=cat3;
		System.out.println(Arrays.toString(cArr));
		
		//��ü �迭�� ����.
	
		
		
		
		
	
		
	
		

	}

}
