package PrepON;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class customizedLocator {

	public static void main(String[] args)
	{
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		// tag#ID;
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Laptop");
		
		// tag.classname;
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Mobile");
		
	}

}
