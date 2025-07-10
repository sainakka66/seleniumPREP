package PrepON;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ISmethods {

	public static void main(String[] args) 
	{
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
//		//tag[attribute=”value”]
//		WebElement isdisp = driver.findElement(By.cssSelector("img[title=\"Flipkart\"]"));
//		System.out.println("The status is: " + isdisp.isDisplayed());
		
		boolean isdisp = driver.findElement(By.cssSelector("img[title=\"Flipkart\"]")).isDisplayed();
		System.out.println("The status is: " + isdisp);
		
	}

}
