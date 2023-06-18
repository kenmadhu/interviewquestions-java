package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Scroll_Demo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Payslip\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		// get return type void  
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"ez-accept-all\"]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement r = driver.findElement(By.id("cookieChoiceDismiss"));
		r.click();
		//driver.findElement(By.id("cookieChoiceDismiss")).click();
		/*
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0);");
		WebElement gh = driver.findElement(By.xpath("//a[@aria-label=\"GitHub\"]"));
		js.executeScript("arguments[0].scrollIntoView();" , gh);
		*/
		WebElement disable =  driver.findElement(By.name("firstname"));
		js.executeScript("arguments[0].setAttribute('disabled', 'true');", disable);
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('disabled');", disable);
		disable.sendKeys("Naveen");
		
		

		WebElement ln =  driver.findElement(By.name("lastname"));
		js.executeScript("arguments[0].style.border='9px red solid';", ln);
		
	}

}
