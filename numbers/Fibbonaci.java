package numbers;

import java.util.Scanner;

public class Fibbonaci {

	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the number");
	int n=sc.nextInt();
    int a=1;
    int b=2;
    int c;
    c=a+b;
    System.out.print(" "+a);
    System.out.print(" "+b);
    
   while(c<=n) {
	   a=b;
	   System.out.print(" "+c );
	   b=c;
	   c=a+b;
   }


	
	}
}
