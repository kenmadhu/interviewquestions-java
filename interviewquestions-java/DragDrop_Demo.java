package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class DragDrop_Demo 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "E:\\\\Payslip\\\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		// get return type void  
		driver.get("https://jqueryui.com/droppable/");

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		
		WebElement imgAngularPick = driver.findElement(By.id("draggable"));
		WebElement imgDrop = driver.findElement(By.id("droppable"));
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.dragAndDrop(imgAngularPick, imgDrop).build().perform();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.close();	}
}
