package page_Verifications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commonFunctions.WebElementCommon;
import page_Actions.ACR_LoginPage_Actions;
import page_Locators.ACR_LoginPage_Locators;

public class ACR_LoginPage_Verifications {
	
	WebDriver driver = null;
	WebElement element = null;
	ACR_LoginPage_Locators pageOneLoc = null;
	ACR_LoginPage_Actions pageOneAct = null;
	
	public ACR_LoginPage_Verifications(WebDriver driver){
		
		this.driver = driver;
		pageOneLoc = new ACR_LoginPage_Locators(driver);
		pageOneAct = new ACR_LoginPage_Actions(driver);
	}
	
	public void verify_enterUsername(String username){
		element = pageOneLoc.getUsername();
		if(element != null){
			if(WebElementCommon.IsDisplayed(element)){
				if(WebElementCommon.IsClickable(element, driver)){
					if(pageOneAct.enterUsername(username)){
						System.out.println("Username is entered");
					}else{
						System.out.println("Username is not entered");
					}	
				}else{
					System.out.println("Textbox for Username is not Clickable");
				}			
			}else{
				System.out.println("Textbox for Username is not Displayed");
			}		
		}else{
			System.out.println("Element for Username is not found");
		}
	}
	
	public void verify_enterPassword(String password){
		element = pageOneLoc.getPassword();
		if(element != null){
			if(WebElementCommon.IsDisplayed(element)){
				if(WebElementCommon.IsClickable(element, driver)){
					if(pageOneAct.enterPassword(password)){
						System.out.println("Password is entered");
					}else{
						System.out.println("Password is not entered");
					}	
				}else{
					System.out.println("Textbox for Password is not Clickable");
				}			
			}else{
				System.out.println("Textbox for Password is not Displayed");
			}		
		}else{
			System.out.println("Element for Password is not found");
		}
	}
	
	public void verify_clickLoginButton(){
		element = pageOneLoc.getLoginButton();
		if(element != null){
			if(WebElementCommon.IsDisplayed(element)){
				if(WebElementCommon.IsClickable(element, driver)){
					if(pageOneAct.clickLoginButton()){
						System.out.println("Login Button is Clicked");
					}else{
						System.out.println("Login Button is not Clicked");
					}	
				}else{
					System.out.println("Login Button is not Clickable");
				}			
			}else{
				System.out.println("Login Button is not Displayed");
			}		
		}else{
			System.out.println("Element for Login Button is not found");
		}
	}
	
	public ACR_LoginPage_Verifications pageOneTask(String username, String password){
		
		ACR_LoginPage_Verifications pageOneVer = null;
		
		try {
			verify_enterUsername(username);
			verify_enterPassword(password);
			verify_clickLoginButton();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return pageOneVer;
		
	}
}
