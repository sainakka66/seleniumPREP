package PrepON;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.guru99.com/selenium/newtours/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()=\"REGISTER\"]")).click();
		

        WebElement dpd = driver.findElement(By.xpath("//select[@name='country']"));
        Select lists = new Select(dpd);
        //Thread.sleep(2500);
//        lists.selectByVisibleText("ARGENTINA");
//        lists.selectByValue("ARUBA");
		List<WebElement> DDoptions = lists.getOptions();
		System.out.println("Number of countries are Totally: " + DDoptions.size());
		
		for(WebElement web:DDoptions)
		{
			System.out.println(web.getText());
		}
		
		
		
	}

}
