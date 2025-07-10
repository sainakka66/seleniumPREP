package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class parameterization 
{
	WebDriver driver;
		
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	}
	
	@Test(dataProvider="dp")
	void login(String username, String password) throws InterruptedException
	{
		driver.get("https://github.com/login");
		driver.manage().window().maximize();
		Thread.sleep(2500);
		driver.findElement(By.id("login_field")).sendKeys(username);
		Thread.sleep(2500);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2500);
		driver.findElement(By.name("commit")).click();
	}
	
	
	@AfterClass
	void close() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
	
	@DataProvider(name="dp")
	Object[][] logindata()
	{
		Object data[][] = {
				{"sainakka66","test123"},
				{"sainakka66","test23"},
				{"sainakka66","test@123"},
				{"sainakka66","Sainakka6@"}
		};
		
		return data;
	}
	
	
}
