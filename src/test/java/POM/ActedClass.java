package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ActedClass 
{
	WebDriver driver;
	Actions action;
	
	//Constructor
	ActedClass(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Locators
	 By textbox = By.id("content");
	 By capslock = By.xpath("//button[text()='UPPER CASE']");
	 
	 //Actions Methods
	 public void sendText(String text) //throws InterruptedException
	 {
		 driver.findElement(textbox).sendKeys(text);
		 //Thread.sleep(2400);		 
		 driver.findElement(capslock).click();
	 }
	 
	 public void select() //throws InterruptedException
	 {
		 //Thread.sleep(2400);
		 action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
	 }
	 
	 public void copy() //throws InterruptedException
	 {
		 //Thread.sleep(2400);
		 action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
	 }
	
}
