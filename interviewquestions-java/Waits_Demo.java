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
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits_Demo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Payslip\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		// get return type void  
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;

		driver.get("https://www.techlistic.com/2021/10/rest-api-testing-using-postman.html");
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"ez-accept-all\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()=\"OK\"]")).click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement lkTest = driver.findElement(By.linkText("Top 7 Web Development Trends"));
		FluentWait f=new FluentWait(driver).pollingEvery(2,TimeUnit.SECONDS)
				.withTimeout(10,TimeUnit.SECONDS);

		//WebDriverWait w = new WebDriverWait(driver, 30);
		f.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href=\"https://www.techlistic.com/2021/10/top-7-web-development-trends.html\"]")));
		lkTest.click();
		WebDriverWait ExplicitWait = new WebDriverWait(driver, 20);
		//ExplicitWait.until(null)
	}

}
