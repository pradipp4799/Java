package string;

import java.util.Arrays;
import java.util.Scanner;

public class stringDivideInEqualNumberOfParts {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for part");
		String str=sc.next();
		System.out.println("Enter the number for divide");
		int d=sc.nextInt();
		String [] strArr= new String[str.length()/d];
		int count=0;
		int y=0;
		System.out.println(str.length()-d);
		if(str.length()%d==0) {
			while(y<=str.length()-d) {
				
			
				strArr[count]=str.substring(y,y+d);
				System.out.println(y+""+(y+d));
				y=y+d;
				count++;
			}
		
		}
		System.out.println(Arrays.toString(strArr));

	}

}
