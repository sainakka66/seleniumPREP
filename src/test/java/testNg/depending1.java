package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class depending1 
{
	@Test
	void open()
	{
		Assert.assertTrue(true);
	}
	
	
	@Test(dependsOnMethods= {"open"})
	void login()
	{
		Assert.assertTrue(false);
	}
	
	
	@Test(dependsOnMethods= {"login"})
	void search()
	{
		Assert.assertTrue(true);
	}
	
	
	@Test(dependsOnMethods= {"login"})
	void Advsearch()
	{
		Assert.assertTrue(true);
	}
	
	
	@Test(dependsOnMethods= {"login"})
	void logout()
	{
		Assert.assertTrue(true);
	}
	
}
