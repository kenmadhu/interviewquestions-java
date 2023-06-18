package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Slider_Demo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Payslip\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		// get return type void  
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		WebElement Block = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		a.dragAndDropBy(Block, 570, 0).build().perform();
		//a.dragAndDrop(Block, Block)
		System.out.println(Block.getLocation().getX() + "____" + Block.getLocation().getY() );
		
		
		driver.switchTo().defaultContent();

		/*
		driver.findElement(By.linkText("Vertical slider")).click();
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement VBlock = driver.findElement(By.xpath("//*[@id=\"slider-vertical\"]/span"));c3
		a.dragAndDropBy(VBlock, 0, 40).build().perform();
		*/
		System.out.println("Hi");
		a.contextClick(driver.findElement(By.linkText("Vertical slider"))).build().perform();

		//a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.keyDown(Keys.UP).build().perform();
		
	}

}
