package page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ACR_PracticeInformationPage_Locators {
	
	WebDriver driver = null;
	
	public ACR_PracticeInformationPage_Locators(WebDriver driver){
		
		this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='txtPracticeName']")
	private WebElement PracticeName;
	
	public WebElement getPracticeNametextbox(){
		return PracticeName;
	}
	
	@FindBy(id="txtAddress1")
	private WebElement Address1;
	
	public WebElement Address1textbox(){
		return Address1;
	}
	
	@FindBy(id="txtAddress2")
	private WebElement Address2;
	
	public WebElement Address2textbox(){
		return Address1;
	}

	@FindBy(id="txtZip")
	private WebElement zip;
	
	public WebElement ziptextbox(){
		return zip;
	}
	
	@FindBy(id="ddlStateProvince")
	private WebElement state;
	
	public WebElement statetextbox(){
		return state;
	}
	
	@FindBy(xpath="//input[@id='txtCityTown']")
	private WebElement city;
	
	public WebElement citytextbox(){
		return city;
	}
	
	@FindBy(id="ddlPracticeSetting")
	private WebElement PracticeSetting;
	
	public WebElement PracticeSettingBox(){
		return PracticeSetting;
	}
	
	@FindBy(id="btnRegisterClick")
	private WebElement SaveBtn;
	
	public WebElement SaveBtn(){
		return SaveBtn;
	}
	
}



