package classMethod;

public class classMethod07 {
	// 3. �迭�� �Ű������� ���Ͽ� �迭������ ���� �������ִ� �Լ��� ������
	
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