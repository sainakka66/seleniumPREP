package PrepON;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ajio {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement fashion = driver.findElement(By.xpath("//img[@class='_2puWtW _3a3qyb' and @alt='Fashion']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(fashion).build().perform();
		
		WebElement men = driver.findElement(By.xpath("//a[text()='Men Footwear']"));
		action.moveToElement(men).build().perform();
		
		Thread.sleep(2500);
		driver.findElement(By.xpath("//a[text()='Shoe Care']")).click();
		
	}

}
