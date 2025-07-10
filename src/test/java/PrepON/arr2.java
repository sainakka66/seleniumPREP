package PrepON;

import java.util.Arrays;

public class arr2 {

	public static void main(String[] args) 
	{
		
//		//Program: Find Largest Element in Array
//		
//		int a[] = {1000,2500,500,7500,3000};
//		int larg = a[0];
//		
//		for(int i=1; i<a.length; i++)
//		{
//			if(a[i] > larg)
//			{
//				larg = a[i];
//			}
//		}
//		System.out.println("Max value: " + larg);
		
		
		//Program: Copy One Array to Another
		int a[] = new int[5];
		a[0] = 1000;
		a[1] = 2000;
		a[2] = 3000;
		a[3] = 4000;
		a[4] = 5000;
		
		int[] copy = new int[a.length];
		
		for(int i=0; i<a.length; i++)
		{
			copy[i] = a[i];
		}
		System.out.println(Arrays.toString(copy));
		System.out.println(Arrays.toString(a));
		
		
		
    }

}
