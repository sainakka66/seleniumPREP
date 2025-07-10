package PrepON;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DatePicker1 {
	
	public static String uyear;
	public static String umonth;
	public static String udate;

	public static void main(String[] args) 
	{
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		uyear = "2027";
		umonth = "March";
		udate = "5";
		
		WebElement framee = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(framee);
		
		driver.findElement(By.id("datepicker")).click();
		
		while(true)
		{
			String amonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String ayear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(amonth.equals(umonth) && ayear.equals(uyear))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
		}
		
		//clicking DATE;
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement date:dates)
		{
			if(date.getText().equals(udate))
			{
				date.click();
				break;
			}
		}
		
	}

}
