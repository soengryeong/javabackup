
public class javaClass5 {

	public static void main(String[] args) {
		//if문 안에 if문 사용할 수 있음.
		//해 달 둘중에 하나만
		//별은 달이 있을 때 그려도 되고 안그려도 되고
		//구름은 해가 있을 때 그려도 되고 안그려도 되고
		String nowData="낮";
//		if(nowData.equals("낮")) {
//			System.out.println("해");
//		}else {
//			System.out.println("달");
//		}
		boolean isDay=true;//낮이면 true
		boolean isStar=true; //true면 별 그리기
		boolean isCloud=true; //true면 구름 그리기
		
		if(isDay) {
			System.out.println("해");
		}else {
		    System.out.println("별");
			}
		if(isDay&&isCloud) { //isDay true isCloud==true
			System.out.println("구름"); //$$양 쪽 모두 true일때 연산되는 연산자
		}
		if(isDay==false&&isStar==true) {
			System.out.println("별");
		}
		// || 는  둘다 false일 때 리턴../
//		if(isDay) {
//			System.out.println("해");
//			if(isCloud) {
//				System.out.println("구름");
//			}
//		}else {
//			System.out.println("달");
//			if(isStar) {
//				System.out.println("별");
//			}
			
		}
	}

	//System.out.println(true true&&false);}
