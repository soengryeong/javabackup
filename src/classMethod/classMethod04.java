package classMethod;

public class classMethod04 {
	// 1. �޼ҵ��� ���������� �޼ҵ尡 ������ �Ǹ� stack�� �ö󰣴�.
	// 2. �޼ҵ� �� ���� ������ �������� �ʴ´�.
	// 3. �޼ҵ尡 ����Ǹ� �޸𸮿��� �������.
	// 4. �ڵ���� ���������� �ڵ���� ����Ǹ� �������.
	
	// ����3. �� �� ���� ���� ���� ���ϴ� �Լ��� ����� ����غ���. 5,2   2,5
    public static int SumAll(int a, int b) {
    	int sum = 0;
    	if(a>b) {
    		int temp;
    		temp=a;
    		a=b;
    		b=temp;
    	} //b�� �׻� ū���� ��
        for(int i=a;i<=b;i++) {
        	sum=sum+i;
        }
    	return sum;
    }
	public static void main(String[] args) {
		int a=10, b=12;
		System.out.println(SumAll(a,b));
		System.out.println(SumAll(4,1));
		
		

	}

}
