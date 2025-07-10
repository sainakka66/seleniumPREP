package BasicPrograms;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) 
	{
		
//In Java, the nextInt() method is used to read an integer input from the user using the Scanner class.
		int num, rem;
		System.out.println("Enter the Num: ");
		Scanner scnr = new Scanner(System.in);
		num = scnr.nextInt();
		scnr.close();
		
		rem = num % 2;
		
		if(rem == 0)
		{
			System.out.println(num + " " + "Is an Even Number");
		}
		else
		{
			System.out.println(num + " " + "Is an Odd Number");
		}
		
	}

}
