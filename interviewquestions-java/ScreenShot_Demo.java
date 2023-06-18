package automation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;
import org.apache.commons.io.FileUtils;


public class ScreenShot_Demo 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Payslip\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		// get return type void  
		driver.manage().window().maximize();

		driver.get("https://www.techlistic.com/2021/10/rest-api-testing-using-postman.html");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"ez-accept-all\"]")).click();
		Thread.sleep(6000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()=\"OK\"]")).click();
		
		String path = "E:\\Screenshot.png";
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("E:\\Screenshot.png"), true);

		
		String p = "E:\\Screenshot1.png";
		TakesScreenshot t = (TakesScreenshot)driver;
		File screen = t.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshot, new File(p), true);
		File f = new File(p);
		f.delete();
		
	}

	private static File File(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
