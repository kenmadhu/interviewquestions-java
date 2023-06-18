package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Frames_Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		// get return type void  
		driver.get("http://demo.automationtesting.in/Frames.html"); 
		driver.switchTo().frame("SingleFrame");
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Naveen");

		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe")));

		WebElement a = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(a);
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Naveen");
	}

}
