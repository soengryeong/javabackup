package classMethod;

import java.util.Scanner;

public class classMethod19 {
	 public static int input;
     public static void gugudan() {
    	    System.out.println();
		    System.out.println("***"+input+"��****");
		   
		    for(int i=1;i<=9; i=i+1){
		    System.out.println(input+"*"+i+"="+(input*i));
    	
     }
     }
	 public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		 
		    System.out.println("2~9������ ���ڸ� �ϳ� �Է� �� �ּ���");
		    input=sc.nextInt();
		    gugudan();
	 }
     
}
