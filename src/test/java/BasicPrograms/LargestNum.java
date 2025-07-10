package BasicPrograms;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) 
	{
		
		int n1,n2,n3,large;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Num1: ");
		n1 = scan.nextInt();
		
		System.out.println("Enter the Num2: ");
		n2 = scan.nextInt();
		
		System.out.println("Enter the Num3: ");
		n3 = scan.nextInt();
		scan.close();
		
		if(n1>n2 && n1>n3)
			large = n1;
		else if(n2>n1 && n2>n3)
			large = n2;
		else
			large = n3;
		
		System.out.printf("Largest number among %d %d and %d is %d",n1,n2,n3,large);
		
	}

}
