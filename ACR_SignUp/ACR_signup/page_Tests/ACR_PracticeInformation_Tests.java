package page_Tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import commonFunctions.BaseClass;
import commonMethods.ExcelReader;
import commonMethods.PropertyFileReader;
import page_Verifications.ACR_LoginPage_Verifications;
import page_Verifications.ACR_PracticeInformation_Verifications;

public class ACR_PracticeInformation_Tests extends BaseClass{
	
	ExcelReader ex2 = null;
	PropertyFileReader pro1 = null;
	
	@Test
	public void test_ACR_PracticeInformation() {
		
		  ex2 = new ExcelReader();
		  pro1 = new PropertyFileReader();
		
		ACR_LoginPage_Verifications pageOneVer = new ACR_LoginPage_Verifications(driver);
		  pageOneVer.pageOneTask(ex2.getexceldata1(pro1.getDataProvider(),"Login", 1, "Login data"),ex2.getexceldata1(pro1.getDataProvider(),"Login", 2, "Login data"));
		  
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
		ACR_PracticeInformation_Verifications pageTwoVer = new ACR_PracticeInformation_Verifications(driver);
		pageTwoVer.pageTwoTask(
				ex2.getexceldata1(pro1.getDataProvider(),"PracticeInformation", 1, "Practice Information"),
				ex2.getexceldata1(pro1.getDataProvider(),"PracticeInformation", 2, "Practice Information"), 
				ex2.getexceldata1(pro1.getDataProvider(),"PracticeInformation", 3, "Practice Information"),
				ex2.getexceldata1(pro1.getDataProvider(),"PracticeInformation", 4, "Practice Information"), 
				ex2.getexceldata1(pro1.getDataProvider(),"PracticeInformation", 5, "Practice Information"), 
				ex2.getexceldata1(pro1.getDataProvider(),"PracticeInformation", 6, "Practice Information"),
				ex2.getexceldata1(pro1.getDataProvider(),"PracticeInformation", 7, "Practice Information"));
	}
}
