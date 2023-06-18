package dpexcel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class DataProviderWithExcel {

	WebDriver driver;
	 
    @BeforeMethod
    public void setUp() {
        System.out.println("Start test");
        System.setProperty("webdriver.chrome.driver", "E:\\Payslip\\chromedriver_win32 (2)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.bing.com");
        driver.manage().window().maximize(); 
    }
 
    @Test(dataProvider = "excelData", dataProviderClass = ExcelDataProvider.class)
    public void search(String uname, String password) {
    	driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);
 
		/*
		 * WebElement txtBox = driver.findElement(By.id("sb_form_q"));
		 * txtBox.sendKeys(keyWord1, " ", keyWord2);
		 * System.out.println("Keyword entered is : " + keyWord1 + " " + keyWord2);
		 * txtBox.sendKeys(Keys.ENTER);
		 * System.out.println("Search results are displayed.");
		 */
    }
 
    @AfterMethod
    public void burnDown() {
        driver.quit();
    }

}
