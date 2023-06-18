package TestNG_google;

import org.testng.Assert;
import org.testng.annotations.Test;


public class GoogleExecution extends Business_Logic {
  @Test
  public void Verify_Launch() throws InterruptedException 
  {
	  Launch_Google();
	  String ActualTitle = driver.getTitle();
	  String ExpectedTitle = "Google two";	  
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
	  
	  
} 
  @Test
  public void e() throws InterruptedException 
  {
	  Google_Search(Google_TestData.Input_Text);
  }
}
