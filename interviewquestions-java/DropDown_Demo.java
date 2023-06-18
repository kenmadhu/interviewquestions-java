package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Demo 
{
	public static void main(String[] args) throws InterruptedException 
	{


		System.setProperty("webdriver.chrome.driver", "E:\\Payslip\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		// get return type void  
		driver.get("http://omayo.blogspot.com/");
		WebElement DropDwn = driver.findElement(By.id("drop1"));
		
		
		Select s = new Select(DropDwn);
		/*List<WebElement> Options = s.getOptions();
		for (WebElement ele : Options) 
		{
			System.out.println(ele.getText());
		}*/
		
		//System.out.println(Options);
		
		//s.selectByIndex(2);
		s.selectByVisibleText("doc 4");
		Thread.sleep(2000);
		s.selectByValue("def");
		Thread.sleep(2000);
		s.getOptions();
		System.out.println(s.getFirstSelectedOption().getText());

		Boolean t = s.isMultiple();
		System.out.println(t);
		Thread.sleep(10000);
		driver.close();

		
		
	}
}
