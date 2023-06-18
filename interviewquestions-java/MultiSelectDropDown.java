package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		// get return type void  
		driver.get("http://omayo.blogspot.com/");
		WebElement DropDwn = driver.findElement(By.id("multiselect1"));
		
		Select q = new Select(DropDwn);
		if(q.isMultiple())
		{
		q.selectByIndex(1);
		q.selectByVisibleText("Hyundai");
		}
		
		q.deselectAll();
		q.deselectByIndex(1);
	}

}
