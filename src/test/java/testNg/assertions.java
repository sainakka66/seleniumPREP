package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertions 
{
	@Test
	void test()
	{
		String s1 = "Sai";
		String s2 = "sai";
		
		if(s1.equals(s2))
		{
			System.out.println("Logic Pass");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Logic Fail");
			Assert.assertTrue(false);
		}
	}
	
}
