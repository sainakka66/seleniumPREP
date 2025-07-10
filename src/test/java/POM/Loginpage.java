package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage 
{
	
	WebDriver driver;
	
	//CONSTRUCTOR:
	Loginpage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//LOCATORS:
	
	//driver.findElement(By.name("username")).sendKeys("admin");
	By username_loc = By.name("username");
	By password_loc = By.name("password");
	By button_loc = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
	
	
	//ACTION METHODS:
	public void setusername(String usernamee)
	{
		driver.findElement(username_loc).sendKeys(usernamee);
	}
	
	public void setpassword(String passwordd)
	{
		driver.findElement(password_loc).sendKeys(passwordd);
	}
	
	public void clickLognbtn()
	{
		driver.findElement(button_loc).click();
	}
	
	
	
	
}
