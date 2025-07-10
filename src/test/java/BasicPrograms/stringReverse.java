package BasicPrograms;

import java.util.Scanner;

public class stringReverse {

	public static void main(String[] args) 
	{
		
		String name;
		String rev = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		name = scan.nextLine();
		
		for(int i=name.length()-1; i>=0; i--)
		{
			rev = rev + name.charAt(i);
		}
		
		System.out.println("Reverse String is: " + rev);
		
	}

}
