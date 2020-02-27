
public class javaClass12 {

	public static void main(String[] args) {
		//사용자 입력 중에 가장 큰 수와 가장 작은 수 구하기
		//5번
		java.util.Scanner sy=new java.util.Scanner(System.in);
		int max,min; ///초기화
		max=0;min=0;//-5,-3 ->마이너스도 0으로 나오는 오류.
		max=Integer.MIN_VALUE; //Integer중에 가장 작은 수라는 의미
		min=Integer.MAX_VALUE; //Integer중에 가장 큰수라는 의미
		
		for(int i=0;i<5;i++) {
			System.out.print("수입력>>");
			int input=Integer.parseInt(sy.nextLine());
			if(max<input) {
				max=input;
			}
			if(min>input) {
				min=input;
			}
		
		}
	   System.out.println("큰수:"+max+"작은수:"+min);

	}

}
