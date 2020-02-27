
public class javaClass3 {

	public static void main(String[] args) {
		java.util.Scanner scan=new java.util.Scanner(System.in); 
		int month=0;
		int day=0;
		System.out.print("월을 입력해주세요");
		month = scan.nextInt();
		System.out.print("일을 입력해주세요");
		day=scan.nextInt();
		
		switch(month) {
		case 1:
			if(day>=20) {
				System.out.println("물병자리");
			}else {
				System.out.println("염소자리");
			}
		    break;
		case 2:
			if(day>=19);
		}

	}

}
