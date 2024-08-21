package starPattern;

import java.util.Scanner;

public class updownTringle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of colum fo pattern");
		int num=sc.nextInt();
		int count=0;
		
		for(int i=0;i<num;i++) {
			for(int j=i;j<num;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println();
			count=i+1;
		}
 //System.out.println(count);
		if (count>=num) {
		for(int i=1;i<num;i++) {
			for(int j=0;j<i+1;j++) {
			
				System.out.print(" ");
			}
			for(int k=i;k<num;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		}


	}

}
