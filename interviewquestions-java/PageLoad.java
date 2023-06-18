package wa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoad 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		// get return type void  
		driver.get("https://web.whatsapp.com/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div[1]/div/div/div[2]/div/div[2]")).sendKeys("Naveen India No");
		Thread.sleep(500);
		//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div[1]/div/div/div[2]/div/div[2]")).sendKeys(Keys.ENTER);

		Thread.sleep(1000);
		
		System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/header[1]/div[2]/div[2]/span[1]")).getText());
		Boolean t = false;
		
		do {
			System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/header[1]/div[2]/div[2]/span[1]")).getText());
			Thread.sleep(1000);
		}
		while (t = true);
		
		/* logout
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/header/div[2]/div/span/div[3]/div/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/header/div[2]/div/span/div[3]/span/div/ul/li[4]/div[1]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/span[2]/div/div/div/div/div/div/div[3]/div/div[2]/div/div")).click();
		*/
	}
}
