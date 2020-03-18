package classMethod;

public class classMethod07 {
	// 3. 배열을 매개변수로 합하여 배열내용의 합을 리턴해주는 함수를 만들어보자
	
    public static int[] addNumArray(int[] ar) {
    	
    	for(int i=0; i<ar.length; i++)
		ar[i] += 10;
		return ar;
	}
    public static void main(String[] args) {
		int[] numArr1 = {10, 20, 30, 40, 50};
		int[] numArr2;

		numArr2=addNumArray(numArr1);

		for(int i=0; i<numArr2.length; i++)
			System.out.println("numArr2[" + i + "]: " + numArr2[i]);

}
}