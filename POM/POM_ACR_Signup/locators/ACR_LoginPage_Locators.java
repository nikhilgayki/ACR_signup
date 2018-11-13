package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ACR_LoginPage_Locators {
	
	WebDriver driver = null;
	
	public ACR_LoginPage_Locators(WebDriver driver){
		
		this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "MainContent_txtExistingUserName")
	private WebElement Username;
	
	public WebElement getUsername(){
		return Username;
	}
	
	@FindBy(id="MainContent_txtExistingUserPassword")
	private WebElement Password;
	
	public WebElement getPassword(){
		return Password;
	}
	
	@FindBy(id="btnExistingUserLogin")
	private WebElement LoginButton;
	
	public WebElement getLoginButton(){
		return LoginButton;
	}
}
