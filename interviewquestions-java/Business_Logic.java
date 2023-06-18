package TestNG_google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Business_Logic 
{
	public static WebDriver driver; 
	public static void Launch_Google() throws InterruptedException
	{
		System.setProperty(Google_TestData.driverKey, Google_TestData.driverPath);
		driver = new ChromeDriver(); 
		// get return type void  
		driver.get(Google_TestData.url);
		Thread.sleep(1000);
		driver.findElement(ElementRepository_Google.acceptCookies).click();
		driver.manage().window().maximize();
	}
	public static void Google_Search(String SearchItem) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(ElementRepository_Google.SearchItem).sendKeys(SearchItem);
		
		driver.findElement(ElementRepository_Google.SearchItem).sendKeys(Keys.ENTER);
		
	}
	
	

}
