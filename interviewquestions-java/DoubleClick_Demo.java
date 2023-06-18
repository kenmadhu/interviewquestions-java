package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_Demo 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Payslip\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		// get return type void  
		driver.get("http://omayo.blogspot.com/");
		Actions a = new Actions(driver);
		WebElement DouClick = driver.findElement(By.xpath("//button[text()=\" Double click Here   \"]"));

		a.moveToElement(DouClick).build().perform();
		a.doubleClick().build().perform();
		
		//a.contextClick(DouClick).build().perform();
		//a.click(DouClick).build().perform();
		//driver.switchTo().alert().accept();
	}
}
