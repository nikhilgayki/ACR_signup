package action;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Common.WebTextBox;
import locators.ACR_LoginPage_Locators;


public class ACR_Actions {
	
	WebDriver driver = null;
	ACR_LoginPage_Locators loc = null;
	WebElement element = null;
	
	public ACR_Actions(WebDriver driver){
		this.driver = driver;
		loc = new ACR_LoginPage_Locators(driver);
	}
	
	public void enterUsername(String Username){
		element = loc.getUsername();
		if(element!=null){
			if(WebTextBox.textbox_isDisplayed(element)){
				if(WebTextBox.IsClickable(element, driver)){
					
					WebTextBox.sendInput(element, Username);
					
				}else{
					System.out.println("element Not Clickable");
				}
			}else{
				System.out.println("element Not displayed");
			}
		}else{
			System.out.println("element absent");
		}
	}
	
	public void enterPassword(String Password){
		element = loc.getPassword();
		element.sendKeys(Password);
	}
	
	public void clickLoginButton(){
		element = loc.getLoginButton();
		element.click();
		}
	
	public ACR_Actions pageOneTask(String username, String password){
		
		ACR_Actions pageOne = null;
		
		try {
			enterUsername(username);
			enterPassword(password);
			clickLoginButton();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return pageOne;
		}

	}