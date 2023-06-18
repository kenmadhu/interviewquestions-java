package WebDriver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasicWinOperations {

	public static void main(String[] args) 
	{

		// Default package for java is java.lang
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		// get return type void  
		driver.get("https://katalon-demo-cura.herokuapp.com/"); 
		/*
		// to find dim of the browser
		Dimension d = driver.manage().window().getSize();
		System.out.println(d);
		System.out.println(d.width);*/
		driver.manage().window().fullscreen();		//FullScreen
		Dimension dim = new Dimension(100, 945);
		driver.manage().window().setSize(dim);
		Point pa = new Point(500, 500);
		driver.manage().window().setPosition(pa);
		
		Point p = driver.manage().window().getPosition();
		System.out.println(p);
	}

}
