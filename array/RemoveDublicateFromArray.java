package array;

import java.util.Arrays;

public class RemoveDublicateFromArray {

	public static void main(String[] args) {
		int arr[]= {1,2,2,4,6,7};
		int []arrNew=removeDublicateNumber(arr);
		arr=arrNew;
		System.out.println(Arrays.toString(arr));
	}

	private static int[] removeDublicateNumber(int[] arr) {
		int temp,count;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				count=i;
				while(count<arr.length-1) {
					arr[count]=arr[count+1];
					count++;
				}
				arr[arr.length-1]=0;
			}
		}
		return arr;
	}

}
