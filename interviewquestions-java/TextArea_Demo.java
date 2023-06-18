package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextArea_Demo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// Default package for java is java.lang
				System.setProperty("webdriver.chrome.driver", "E:\\Payslip\\chromedriver_win32 (2)\\chromedriver.exe");
				WebDriver driver = new ChromeDriver(); 
				// get return type void  
				driver.get("http://omayo.blogspot.com/"); 
				driver.findElement(By.id("ta1")).sendKeys("Hi all");
				driver.findElement(By.id("ta1")).clear();
				
				String t = driver.findElement(By.xpath("//*[@id=\"HTML11\"]/div[1]/textarea")).getText();
				System.out.println(t);
				//Thread.sleep(10000);
				//driver.close();
				
	}

}
