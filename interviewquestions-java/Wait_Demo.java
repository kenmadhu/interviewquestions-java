package WebDriver_Methods;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.Logs;

public class Wait_Demo 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); 
	// get return type void  
	driver.get("http://demo.automationtesting.in/Frames.html");
	

	//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
	Logs lg =  driver.manage().logs();
	System.out.println(lg);
	driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
	}
}
