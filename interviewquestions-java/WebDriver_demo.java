package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_demo 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		
		
		
		
		
		// Default package for java is java.lang
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		// get return type void  
		driver.get("https://katalon-demo-cura.herokuapp.com/"); 
		
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		//Thread.sleep(5000);
		//driver.findElement(By.id("L2AGLb")).click();
		driver.findElement(By.id("ez-accept-all")).click();
		driver.findElement(By.name("firstname")).sendKeys("Naveen");
		driver.findElement(By.name("lastname")).sendKeys("B");
		driver.findElement(By.id("sex-0")).click();
		driver.findElement(By.id("exp-2")).click();
		driver.findElement(By.id("datepicker")).sendKeys("20/05/1994");
		driver.findElement(By.id("profession-1")).click();
		driver.findElement(By.id("tool-2")).click();
		
		
		
		
		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
		
		
	}


}
