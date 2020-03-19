package classMethod;
class Cat{
	String name;
	int age;
}
public class classMethod09 {
    public static Cat catFunc(Cat c) {
    	Cat rValue=c;
    	rValue.age= rValue.age+1;
    	return null;
    }
    
	public static void main(String[] args) {
		Cat cat1=new Cat();
		cat1.name="go1";
		cat1.age=10;
		Cat cat2;
		cat2=catFunc(cat1);
		System.out.println(cat1.age);
		System.out.println(cat2.age);
		
		


	}

}
