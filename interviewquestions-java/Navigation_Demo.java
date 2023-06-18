package WebDriver_Methods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Demo {

	public static void main(String[] args) throws InterruptedException, MalformedURLException 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		// get return type void  
		//driver.manage().window().maximize();
		/*
		driver.navigate().to("https://www.amazon.in/"); // POST method 
		String a = driver.getCurrentUrl();  // GET method 
		System.out.println(a); 
		Thread.sleep(2000);
		driver.navigate().refresh();   // POST method 
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com/");   // POST method 
		Thread.sleep(2000);
		driver.navigate().back();   // POST method 
		driver.navigate().forward();    // POST method 
		System.out.println(driver.getTitle());    // GET method 
		*/
		
		URL u = new URL("https://www.youtube.com/");
		driver.navigate().to(u);
		//driver.navigate().to(u);
		//driver.get(u.toString());
		
		System.out.println(u.getPort());
		System.out.println(u.getProtocol());
		System.out.println(u.getDefaultPort());
	}
}
