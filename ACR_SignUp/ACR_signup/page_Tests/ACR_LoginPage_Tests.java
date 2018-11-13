package page_Tests;

import org.testng.annotations.Test;

import commonFunctions.BaseClass;
import commonMethods.ExcelReader;
import commonMethods.PropertyFileReader;
import page_Verifications.ACR_LoginPage_Verifications;

public class ACR_LoginPage_Tests extends BaseClass {
	
	ExcelReader exl = null;
	PropertyFileReader pro = null;
	
  @Test
  public void test_ACR_LoginPage() {
	  
	  exl = new ExcelReader();
	  pro = new PropertyFileReader();
	  
	  ACR_LoginPage_Verifications pageOneVer = new ACR_LoginPage_Verifications(driver);
	  pageOneVer.pageOneTask(
			  exl.getexceldata1(pro.getDataProvider(),"Login", 1, "Login data"),
			  exl.getexceldata1(pro.getDataProvider(),"Login", 2, "Login data"));
	  log.info("\nTest Case: TC_AutoLogin end");
  }
}
