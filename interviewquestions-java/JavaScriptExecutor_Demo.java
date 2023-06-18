package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor_Demo 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		// get return type void  
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/checkboxradio/");
		driver.switchTo().frame(0);
		WebElement radbutton =  driver.findElement(By.xpath("/html/body/div/fieldset[1]/label[3]/span[1]"));
		WebElement cb1 =  driver.findElement(By.xpath("/html/body/div/fieldset[2]/label[1]/span[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", radbutton);
		js.executeScript("arguments[0].click()", cb1);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Autocomplete")).click();
		driver.switchTo().frame(0);
		WebElement tb = driver.findElement(By.id("tags"));
		js.executeScript("arguments[0].value='naveen';", tb);
		
		js.executeScript("alert('Text is entered successfully');");
	}

}
