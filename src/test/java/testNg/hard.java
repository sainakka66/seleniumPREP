package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hard 
{
	
	String s1 = "Sai";
	String s2 = "Sai";
	
	@Test
	void m1()
	{
		System.out.println("Sai Nakka");
		System.out.println("Sai Nakka1");
		System.out.println("Sai Nakka2");
		System.out.println("Sai Nakka3");
		Assert.assertEquals(s1, s2);
	}
	
}
