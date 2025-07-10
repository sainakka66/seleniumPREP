package BasicPrograms;

import java.util.Arrays;

public class SecondLargestSORTING {

	public static void main(String[] args) 
	{
		
		// Sorting:- Sorting means arranging elements in a specific order — usually: Ascending && Descending order
		
        int[] arr = {10, 20, 4, 20, 10, 5};
        Arrays.sort(arr); // 5,4,10,10,20,20

        int n = arr.length;
        int max = arr[n - 1]; //5,4,10,10,20 : max = 20;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != max) {
                System.out.println("Second largest: " + arr[i]);
                return;
            }
        }

        System.out.println("No second largest found.");
		
	}

}
