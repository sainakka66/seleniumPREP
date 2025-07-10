package BasicPrograms;

public class arrayTest {

	public static void main(String[] args) 
	{
		
		int[] a = new int[5];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
		
//		int max = a[0];
//		
//		for(int i=1; i<a.length; i++)
//		{
//			if(a[i]>max)
//				max = a[i];
//		}
//		System.out.printf("Max: " + max); 
		
		//Reverse Array;
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.println("The Reverse Order is: " + a[i]);
		}
		
	}

}
