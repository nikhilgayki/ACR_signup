package page_Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commonFunctions.WebButton;
import commonFunctions.WebElementCommon;
import commonFunctions.WebTextBox;
import page_Locators.ACR_LoginPage_Locators;

public class ACR_LoginPage_Actions {
	
	WebDriver driver = null;
	WebElement element = null;
	ACR_LoginPage_Locators pageOneLoc = null;
	
	public ACR_LoginPage_Actions(WebDriver driver){
		this.driver = driver;
		pageOneLoc = new ACR_LoginPage_Locators(driver);
	}
	
	public boolean enterUsername(String Username){
		boolean IsTrue=false;
		element = pageOneLoc.getUsername();
		WebElement username = element;
		WebTextBox.clearTextbox(username);


			if(username != null){
				WebTextBox.sendInput(username, Username);
				IsTrue=true;
			}

		
		return IsTrue;
	}
	
	public boolean enterPassword(String password){
		boolean IsTrue=false;
		element = pageOneLoc.getPassword();
		
			if(element != null){
				WebTextBox.sendInput(element, password);
				IsTrue=true;
			}

		return IsTrue;
	}
	
	public boolean clickLoginButton(){
		boolean IsTrue=false;
		element = pageOneLoc.getLoginButton();
		if(element != null){
			WebButton.click(element);
			IsTrue=true;
		}
		return IsTrue;
	}

}
