package classArr;

public class quizeArr3 {

}
	public static void main(String[] args) {
		// 강아지 클래스를 배열에 담아 출력해보자.
		dog dog1[] = new dog[3];
		dog1[0] = new dog();
		dog1[0].name = "몽몽이1";
		dog1[0].age = 11;
		dog1[1] = new dog();
		dog1[1].name = "몽몽이2";
		dog1[1].age = 11;
		dog1[2] = new dog();
		dog1[2].name = "몽몽이3";
		dog1[2].age = 19;
		
		for(int i=0; i<3; i++) {
			System.out.println(dog1[i].name);
			System.out.println(dog1[i].age);
			{
		
			}
		}
	}
	}
	



