package PrepON;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetwindowHandle {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.w3schools.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Try it Yourself']")).click();
		
		Set<String> setID = driver.getWindowHandles();
		System.out.println(setID);
		List<String> windowid = new ArrayList(setID);
		
		String parent = windowid.get(0);
		System.out.println(parent);
		
		String child = windowid.get(1);
		System.out.println(child);
		
		
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		
		Thread.sleep(2500);
		
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
