
public class javaClass2 {

	public static void main(String[] args) {
		int brightness = 50;
		int p = 0;
		String color = "빨강";
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("색상을 입력하세요");
		color = sc.next();
		for(;;) {
		System.out.println("밝기를 올리려면 1번 낮추려면 2번 끝내려면 아무키나 눌러주세요");
		p = sc.nextInt();
		switch(p){
		case 1:{
		brightness++;
		break;
		}
		case 2:{
		brightness--;
		break;
		}
		default :{
		System.out.println("현재 색상은"+color+"밝기는"+brightness+"이다");
		return;
		}

		}
		System.out.println("현재 밝기:"+ brightness);
		}

		
		
			
		}
		
		

	}

