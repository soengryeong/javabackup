package classMethod;

import java.util.Scanner;


public class classMethod15 {
    public static void circle() {
        // 원의 넓이 공식=> (반지름)x(반지름)x2.14
        // 원의 넓이를 구하기위한 지름 변수 = int di
    	Scanner re=new Scanner(System.in);
    	System.out.println("구하고자 하는 원의 지름을 입력해주세요:");
    	int di = re.nextInt();
    	int c = di/2;
    	double d = (c*2)*3.14;
    	System.out.println("원의 넓이는"+d+"입니다");
    	}
    public static void quadrangle() {
    	// 삼각형 넓이 공식 = 밑변의길이x높이x2/1
    	// 삼각형의 넓이를 구하기 위해 필요한 변수
    	// -> int e,f;
    	Scanner re=new Scanner(System.in);
    	System.out.println("구하고자 하는 삼각형의 밑변의 길이와 높이를 입력해주세요:");
    	int e = re.nextInt();
    	int f = re.nextInt();
    	int g = (e*f)*1/2;
    	System.out.println("삼각형의 넓이는"+g+"입니다");
     	
	}
    public static void triangle() {
    	// 정사각형 넓이 공식 = 가로x세로
    	Scanner re=new Scanner(System.in);
    	System.out.println("구하고자 하는 정사각형의 길이와 높이를 입력해주세요:");
    	int h = re.nextInt();
    	int i = re.nextInt();
    	int j = h*i;
    	System.out.println("정사각형의 넓이는"+j+"입니다");
     	
    }

	public static void main(String[] args) {
		// 메뉴에 어떤 도형의 넓이를 구할 것인지 사용자에게 물어본 다음 
		// 원의 넓이 구하는 함수 /사각형의 넓이를 구하는 함수 /삼각형의
		// 넓이를 구하는 함수/를 이용하여 원을 구하는  함수를 만들어보자
		int sum=0;
		boolean a =true;
		Scanner re=new Scanner(System.in);
		System.out.println("어떤 도형의 넓이를 구하실건가요? (1:원, 2:삼각형, 3:사각형)");
		int num = re.nextInt();
		switch(num) {
		case 1: 
			System.out.println("원을 선택하셨습니다");
			circle();
			break;
		case 2:
			System.out.println("삼각형을 선택하셨습니다");
			quadrangle();
			break;
		case 3:
			System.out.println("사각형을 선택하셨습니다");
			triangle();
			break;
		default:
			System.out.println("잘못입력하셨습니다");
	
		}
	}

}
