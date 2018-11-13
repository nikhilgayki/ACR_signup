package CommonFunctions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import commonMethods.LocalBrowserFactory;
import commonMethods.PropertyFileReader;

public class BaseClass {
	
	public WebDriver driver;
	public PropertyFileReader pro;
	
	@BeforeMethod
	public void LaunchBrowser(){
		pro= new PropertyFileReader();
		LocalBrowserFactory.createInstance(pro.getBrowserName());
	}
	
	@AfterMethod
	public void closeBrowser(){
		LocalBrowserFactory.tearDown();
	}
	
}