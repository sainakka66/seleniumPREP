package BasicPrograms;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) 
	{
		
//		int num = 123;
//		int rem, rev = 0;
//		
//		while(num > 0)
//		{
//			rem = num % 10;
//			System.out.printf("%d -",rem);
//			num = num / 10;
//		}
		
		int num,rem;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Num: ");
		num = scan.nextInt();
		
		while(num > 0)
		{
			rem = num % 10;
			System.out.printf("%d -",rem);
			num = num / 10;
		}
		
		
	}

}
