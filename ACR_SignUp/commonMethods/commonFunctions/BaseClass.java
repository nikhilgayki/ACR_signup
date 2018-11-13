package commonFunctions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import commonMethods.LocalBrowserFactory;
import commonMethods.PropertyFileReader;
import org.apache.log4j.Logger;

public class BaseClass {
	
	public WebDriver driver;
	public PropertyFileReader pro;
	public static Logger log =Logger.getLogger("rootLogger");
	  
	@BeforeMethod
	public void TestLaunch(){
		pro= new PropertyFileReader();
		this.driver = LocalBrowserFactory.createInstance(pro.getBrowserName());
		System.out.println("STEPS PERFORMED:");
		System.out.println("Browser opened");
	}
	
	@AfterMethod
	public void closeBrowser(){
		LocalBrowserFactory.tearDown();
	}
	
}
