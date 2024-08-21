package array;

public class maxSubArray {

	public static void main(String[] args) {
		  int arr[]= {-2,-5,6,-2,-3,1,5,-6};
		    int num=findMaxSumValue(arr);
		    System.out.println(num);
		    

	}

	private static int findMaxSumValue(int[] arr) {
	  int currArrayMax_value=arr[0];
	  int maxSubArray_value=arr[0];
	  
	  for(int i=0;i<arr.length;i++) {
		 currArrayMax_value=Math.max(arr[i],currArrayMax_value+arr[i]);
		maxSubArray_value=Math.max(currArrayMax_value, maxSubArray_value);
	  }
	  
		return maxSubArray_value;
	}

}
