package exceptionhandling;

public class Test {

	public static void main(String[] args) 
	{
		
		System.out.println("First One");
		
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(10/2);
		}
		
		System.out.println("Nakka Sai");
		System.out.println("Nakka Sai");
		
		
		System.out.println("Second One");
	
		try
		{
			System.out.println(10/0);
		}
		catch(NullPointerException e)
		{
			System.out.println(10/2);
		}
		
		System.out.println("Nakka Sai");
		System.out.println("Nakka Sai");
		
	}

}
