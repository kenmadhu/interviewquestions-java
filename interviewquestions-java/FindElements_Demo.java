package WebDriver_Methods;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_Demo 
{
	public static void main(String[] args) throws MalformedURLException 
	{

		
		// Default package for java is java.lang
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("httpk://www.efunda.com/units/convert_units.cfm?From=878");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		int n = Links.size();
		System.out.println("No of Links available in this page are " + n);
		
		for (WebElement webElement : Links) 
		{
			System.out.println(webElement.getText());
		}
	}
}
