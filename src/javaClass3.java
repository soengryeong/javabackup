
public class javaClass3 {

	public static void main(String[] args) {
		int brightness = 50;
		int p = 0;
		String color = "빨강";
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("색상을 입력하세요:");
		color = sc.next();
		for (;;) {
			System.out.println("밝기를 올려면 1번,내릴려면 2번을 눌러주세요");
			p = sc.nextInt();
			switch (p) {
			case 1: {
				brightness++;
				break;
			}
			case 2: {
				brightness--;
				break;
			}
			default: {
				System.out.println("현재 컬러는" + color + "현재 밝기는" + brightness + "이다");
				return;

			}
			}
			System.out.println("현재 밝기는:" + brightness);
		}

	}
}
