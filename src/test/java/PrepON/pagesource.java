package PrepON;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class pagesource {

	public static void main(String[] args) throws InterruptedException 
	{
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.w3schools.com/");
		driver.manage().window().maximize();
		
		String page = driver.getPageSource();
		System.out.println("The page source is: " + page);
		Thread.sleep(2900);
		driver.quit();
		
	}

}
