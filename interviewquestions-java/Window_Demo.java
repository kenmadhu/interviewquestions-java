package WebDriver_Methods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Demo 
{

	public static void main(String[] args) throws InterruptedException 
	{

		// Default package for java is java.lang
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		// get return type void  
		driver.get("http://demo.automationtesting.in/Windows.html"); 

		driver.findElement(By.linkText("Open New Tabbed Windows")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Tabbed']/a/button")).click();
		Thread.sleep(2000);
		
		Set<String> windows = driver.getWindowHandles(); 
		List<String> ar = new ArrayList<>(windows);
		
		/*
		Set<String> windows = driver.getWindowHandles();    // to handle all windows
		List<String> a = List.copyOf(windows);		/// to convert set to list
		driver.switchTo().window(a.get(1));
		
		
		int windowsSize = windows.size();
		System.out.println(windowsSize);

		Iterator<String> it = windows.iterator();
		while (it.hasNext()) 
		{
			String ChildWindow = it.next();
			driver.switchTo().window(ChildWindow);
			
		}
		//String wh = driver.getWindowHandle();   // to handle active window
		//System.out.println(wh);
		*/
		
	}

}
