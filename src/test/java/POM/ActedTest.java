package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActedTest 
{
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://convertcase.net/");
		driver.manage().window().maximize();
	}
	
	@Test
	void sendData() 
	{
		ActedClass ob = new ActedClass(driver);
		ob.sendText("keyboard action");
		ob.select();
		ob.copy();
	}
	
	@AfterClass
	void close() throws InterruptedException
	{
		Thread.sleep(2400);
		driver.quit();
	}
	
}
