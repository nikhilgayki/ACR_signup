package commonMethods;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LocalBrowserFactory {

	public static WebDriver driver = null;
	public static PropertyFileReader pro = null;
	static String driverPath = "Z:/Automation1/ACR-Signup_Work_space/POM/driver/";
	
	public LocalBrowserFactory(){
		pro = new PropertyFileReader();
	}

	public static WebDriver createInstance(String BrowserName) {
		
		switch (BrowserName.toLowerCase()) {
		
		case "ie" :
			File a = new File(driverPath+"IEDriverServer.exe");
			if (a!= null) {
			System.setProperty("webdriver.geckodriver.driver", driverPath+"IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.get(pro.getUrl());
			driver.manage().window().maximize();
			break;		
			}
		
		case "firefox" :
			File b = new File(driverPath+"geckodriver.exe");
			if (b!= null) {
			System.setProperty("webdriver.gecko.driver",driverPath+"geckodriver.exe");
			driver=new FirefoxDriver();
			pro = new PropertyFileReader();
			driver.get(pro.getUrl());
			driver.manage().window().maximize();
			break;
			}
			
		default :
			File c = new File(driverPath+"chromedriver.exe");
			if (c!= null) {
			System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
			driver = new ChromeDriver();
			pro = new PropertyFileReader();
			driver.get(pro.getUrl());
			driver.manage().window().maximize();
			break;
			}
		}

		return driver;
		}
	
	public static void tearDown(){
		driver.quit();
	}

}
