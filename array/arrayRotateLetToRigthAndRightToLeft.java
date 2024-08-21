package array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class arrayRotateLetToRigthAndRightToLeft {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Rotaton For Left Enter 1 "
				+ " , For Right Enter 2");
		int choice=sc.nextInt();
		System.out.println("Enter the how many Rotation need");
		int num=sc.nextInt();
		int []arr= {12,57,34,56,45};
	
		
		if(choice==1) {
			
			arrayRotaionleftToRight(arr,num);
		}
		 else if (choice==2) {
			 arrayRotaionRightToLeft(arr,num);
		}
		 else {
			 System.out.println("You have choiced wrong key");
		 }
		
		
		
		
		
	}

	private static void arrayRotaionRightToLeft(int[] arr, int num) {
		int temp,count;
		count=0;
		
		System.out.println(num);
		System.out.println(count);
	while(count<num) {
		
		temp=arr[0];
	for(int i=0;i<arr.length-1;i++) {
		arr[i]=arr[i+1];
	}
	arr[arr.length-1]=temp;
	count++;
	
	
	}
	
	
	System.out.println(Arrays.toString(arr));
		
	}

	private static void arrayRotaionleftToRight(int[] arr, int num) {
	    int temp,count;
	    count=0;
	    while(count<num) {
	    temp=arr[arr.length-1];
	  
	    for(int i=arr.length-1;i<0;i--) {
	    	  
	    	arr[i]=arr[i-1];
	  
	    }
	    arr[0]=temp;
	    count++;
	    }
	    
	    System.out.println(Arrays.toString(arr));
		
	}

}
