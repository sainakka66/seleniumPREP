package BasicPrograms;

import java.util.Arrays;

public class SortingPract {

	public static void main(String[] args) 
	{
		
		 int[] arr = {20,10,5,1,10,20};
		 Arrays.sort(arr);
//		 System.out.println(arr[0]);
//		 System.out.println(arr[1]);
//		 System.out.println(arr[2]);
//		 System.out.println(arr[3]);
//		 System.out.println(arr[4]);
//		 System.out.println(arr[5]);
		 
		 for(int i=0; i<arr.length; i++)
		 {
			 System.out.println(arr[i]);
		 }
		 
		 int n = arr.length;
		 int max = arr[n-1];
		 
		 for(int i = n - 2; i>=0; i--)
		 {
			 if(arr[i] != max)
			 {
	                System.out.println("Second largest: " + arr[i]);
	                return;
			 }
		 }
		 
		 System.out.println("No second largest found.");
		 
		
	}

}
