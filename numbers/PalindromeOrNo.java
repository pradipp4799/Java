package numbers;

import java.util.Scanner;

public class PalindromeOrNo {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int n2=n;
		int rem;
		int sum=0;
		while(n>0) {
			rem=n%10;
			sum=rem+sum*10;
			n=n/10;
			
			}
		if (sum==n2) {
			System.out.println("Given number is palindome");
		}
		else {
			System.out.println("Given number is not palidrome");
		}
	}

}
