package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest 
{
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	
	@Test
	void Login() throws InterruptedException
	{
		Loginpage lp = new Loginpage(driver);
		Thread.sleep(2500);
		lp.setusername("admin");
		Thread.sleep(2500);
		lp.setpassword("admin123");
		Thread.sleep(2500);
		lp.clickLognbtn();
	}
	
	
	@AfterClass
	void Logout() throws InterruptedException
	{
		Thread.sleep(2500);
		driver.quit();
	}
	
}
