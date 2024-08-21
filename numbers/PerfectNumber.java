package numbers;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=1;
		
		for(int i=2    ;i<n;i++) {
			
		if(n%i==0) {
			sum=sum+i;
		}
		
		}
		
		if(n==sum) {
			System.out.println("Number is Perfect Number");
		}
		else {
			System.out.println("Number is not perfect Number");
		}

	}

}
