package classMethod;

import java.util.Scanner;

public class classMethod08 {
	// �޷��� ����� �Լ��� ������.
	public static void calendar() {
		 Scanner sc = new Scanner(System.in);
		  
	      /*
	       * monthSet�� �� �޿� ���� ��¥���� ������ �迭,
	       * year�� ����, month�� ��, week�� ����, day�� ��, i�� �ݺ����� ����ϱ� ����         ����.
	       */
	      int year=0, month=0, week=0, day=0, i=0; 
	      int monthSet[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	  
	  
	      while(true) {
	       System.out.println("���ϴ� ������ �Է��ϼ���. (0�� ������ ���α׷��� �����մϴ�.)");
	       year = sc.nextInt();
	       if(year==0) {
	        System.exit(0);
	        break;
	       }
	       System.out.println("���ϴ� ���� �Է��ϼ���.");
	       month = sc.nextInt();
	       if(month<1 || month>12) {
	        System.out.println("1������ 12�� ������ ���� �Է����ּ���.");
	        return;
	       }
	       System.out.println("");
	   
	       if(year%4 == 0 && year%100 != 0 || year%400 == 0) // ������ ����.
	        monthSet[1] = 29; // �����̸� 2�� (monthSet[1])�� 29��,
	       else
	        monthSet[1] = 28; // ������ �ƴϸ� 2���� 28���̴�.
	   
	       // 01�� 1�� 1�Ϻ��� ���.
	       day = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
	       for(i=0;i<month-1;i++) {
	        day += monthSet[i];  
	       }
	       week=day%7; // ���ϰ��� �ϴ� ���� ������(1��)�� ������ ����.
	   
	       System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t\n", "��", "ȭ", "��",     "��", "��", "��", "��");   
	       for(i=0;i<week;i++) {
	        System.out.print("\t"); // 1���� �����ϱ� �� ������ ���� �ݺ���.
	       }
	       for(i=1;i<=monthSet[month-1];i++) {
	        System.out.printf("%d\t", i); // i�� �Է��� ���� �ϼ���ŭ ����.
	        week++;   
	        if(week%7 == 0)        // ������ �Ͽ����� ������
	         System.out.println(); // ���� �ٲ�.
	    
	       }
	       if(week%7 != 0) {
	    	   calendar();
	       }
	      }
		
	}
   
	public static void main(String[] args) {
		calendar();

	}

}
