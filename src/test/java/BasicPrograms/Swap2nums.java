package BasicPrograms;

import java.util.Scanner;

public class Swap2nums {

	public static void main(String[] args) 
	{
		
		int n1,n2,temp;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number for num1: ");
		n1 = scan.nextInt();
		
		System.out.println("Enter number for num2: ");
		n2 = scan.nextInt();
		scan.close();
		
		System.out.printf("Before Swappng n1 = %d and n2 = %d\n",n1,n2);
		
		temp = n1;
		n1 = n2;
		n2 = temp;
		
		System.out.printf("After Swappng n1 = %d and n2 = %d\n",n1,n2);
		
	}

}
