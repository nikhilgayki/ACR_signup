package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import CommonFunctions.BaseClass;
import action.ACR_Actions;


public class NewTest extends BaseClass{
	
	WebDriver driver= null;
	
  @Test
  public void test() {
//	  System.setProperty("webdriver.chrome.driver","Z:/Automation1/ACR-Signup_Work_space/POM/driver/chromedriver.exe");
//	  driver = new ChromeDriver();
//	  driver.manage().window().maximize();
//	  driver.get("https://registry.rheumatology.org/DemoRiseSignup/Registry.aspx");
	  
	  
	  ACR_Actions act = new ACR_Actions(driver);
	  act.pageOneTask("Nikhil", "NIKHIL");
	  
	  driver.close();
	  
	  
  }
}
