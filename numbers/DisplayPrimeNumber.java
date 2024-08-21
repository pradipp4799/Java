package numbers;

import java.util.Scanner;

public class DisplayPrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<n;i++) {
			flag=false;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=true;
					break;
				}
				
			}
			if(flag==false) {
			
				System.out.println(i);
			}
			
			
				
		}

	}

}
