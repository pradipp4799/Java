package string;

import java.util.Arrays;

public class sortStringUsingCompareTo {
	
	public static void main(String[]args) {
		
		String [] sArray= {"amit","sumit","Amar","rohit"};
	     String str,str1;
	     int count=0;
	     
	     while(count<sArray.length) {
		
		for(int i=count;i< sArray.length-1;i++) {
			
			str=sArray[i] ; 
			str1=sArray[i+1];
			if(str.compareTo(str1)>0) {
				
				sArray[i]=str1;
				sArray[i+1]=str;
			}
			
			
			
			
		}
		count++;
	     }
		
	     System.out.println(Arrays.toString(sArray));
	}

}
