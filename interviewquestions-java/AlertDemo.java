package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		/*
		// Default package for java is java.lang
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		// get return type void  
		driver.get("https://tutorialshut.com/demo-website-for-selenium-automation-practice/"); 
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		/*driver.findElement(By.linkText("ACCEPT")).click();
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		// to accept the alert
		driver.switchTo().alert().accept();
		// to accept the dismiss
		//driver.switchTo().alert().dismiss();
		 
		 
		driver.findElement(By.xpath("//button[text()='Enter text in Alert Box']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Naveen");
		//button[text()='Generate Alert Box']
		*/
		
		// Default package for java is java.lang
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		// get return type void  
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts"); 
		driver.findElement(By.id("promtButton")).click();
		driver.switchTo().alert().sendKeys("Praveen");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/span/div")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Naveen");
		driver.findElement(By.id("lastName")).sendKeys("Praveen");
		driver.findElement(By.id("userEmail")).sendKeys("naveen@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
		
		driver.findElement(By.id("userNumber")).sendKeys("987654321");
		//driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]/div[2]/div")).sendKeys("Master's in England");
		driver.findElement(By.id("hobbies-checkbox-1")).click();
		
		
		//driver.quit();
		
	}

}
