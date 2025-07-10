package exceptionhandling;

public class finale {

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
		finally
		{
			System.out.println("First End");
		}
		
		System.out.println("Second One");
		try
		{
			System.out.println("Try Block");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch Block");
		}
		finally
		{
			System.out.println("Second End");
		}
		
		
		System.out.println("Third One");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch Block");
		}
		finally
		{
			System.out.println("Third End");
		}
		
		
//		System.out.println("Fourth One");
//		try
//		{
//			System.out.println(10/0);
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println(10/0);
//		}
//		finally
//		{
//			System.out.println("Fourth End");
//		}
		
		
		
		System.out.println("Fifth One");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch Block");
		}
		finally
		{
			System.out.println(10/0);
		}
		
	}

}
