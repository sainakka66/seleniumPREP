package PrepON;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class scannerclass {

	public static void main(String[] args) 
	{
		
//		//Without ScannerClass;
//		String browser = "Edge";
//		RemoteWebDriver driver;
//		
//		if(browser.equalsIgnoreCase("Chrome"))
//		{
//			driver = new ChromeDriver();
//		}
//		
//		if(browser.equalsIgnoreCase("Edge"))
//		{
//			driver = new EdgeDriver();
//		}
//		
//		if(browser.equalsIgnoreCase("Firefox"))
//		{
//			driver = new FirefoxDriver();
//		}
		
		//With ScannerClass:
		String browser;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Valid browser name: ");
		
		browser = sc.nextLine();
		
		RemoteWebDriver driver;
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Please enter the Correct Browser");
		}
		
		
	}

}
