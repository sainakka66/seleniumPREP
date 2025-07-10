package PrepON;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardaction {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://text-compare.com/");
		Thread.sleep(2500);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("inputText1")).sendKeys("Maybe Today's your Day!");
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2100);
		
		action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2100);
		
		action.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		Thread.sleep(2100);
		
		action.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2100);
		
		driver.findElement(By.xpath("//div[text()='Compare!']")).click();
		
		
	}

}
