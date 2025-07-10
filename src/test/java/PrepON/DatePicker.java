package PrepON;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DatePicker {

	public static String year;
	public static String month;
	public static String day;
	
	public static void main(String[] args) 
	{
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		WebElement module = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(module);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Year: ");
		year = scan.nextLine();
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the Month: ");
		month = scan1.nextLine();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter the Day: ");
		day = scan2.nextLine();
		
		
		driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();
		
		while(true)
		{
			String act_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String act_year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(act_month.equals(month) && act_year.equals(year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement dt:dates)
		{
			if(dt.getText().equals(day))
			{
				dt.click();
				break;
			}
		}
		
		
		
	}

}
