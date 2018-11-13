package page_Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commonFunctions.WebButton;
import commonFunctions.WebTextBox;
import page_Locators.ACR_PracticeInformationPage_Locators;


public class ACR_PracticeInformationPage_Actions {
	
	WebDriver driver = null;
	WebElement element = null;

	ACR_PracticeInformationPage_Locators pageTwoLoc = null;
	
	public ACR_PracticeInformationPage_Actions(WebDriver driver){
		this.driver=driver;
		pageTwoLoc = new ACR_PracticeInformationPage_Locators(driver);
	}
	
	public boolean enterPracticeName(String practiceName){
		boolean IsTrue=false;
		element = pageTwoLoc.getPracticeNametextbox();
		if((element != null)){
			WebTextBox.clearTextbox(element);
			WebTextBox.sendInput(element, practiceName);
			WebTextBox.clearTextbox(element);
			WebTextBox.sendInput(element, practiceName);
			IsTrue=true;
		}
		return IsTrue;
	}
	
	public boolean enterAddress1(String address1){
		boolean IsTrue=false;
		element = pageTwoLoc.Address1textbox();
		if(element != null){
			WebTextBox.clearTextbox(element);
			WebTextBox.sendInput(element, address1);
			IsTrue=true;
		}
		return IsTrue;
	}
	
	public boolean enterAddress2(String address2){
		boolean IsTrue=false;
		element = pageTwoLoc.Address2textbox();
		if(element != null){
			WebTextBox.clearTextbox(element);
			WebTextBox.sendInput(element, address2);
			IsTrue=true;
		}
		return IsTrue;
	}
	
	public boolean enterZip(String zip){
		boolean IsTrue=false;
		element = pageTwoLoc.ziptextbox();
		if(element != null){
			WebTextBox.clearTextbox(element);
			WebTextBox.sendInput(element, zip);
			IsTrue=true;
		}
		return IsTrue;
	}
	
	public boolean enterCity(String city){
		boolean IsTrue=false;
		element = pageTwoLoc.citytextbox();
		if(element != null){
			WebTextBox.clearTextbox(element);
			WebTextBox.sendInput(element, city);
			IsTrue=true;
		}
		return IsTrue;
	}
	
	public boolean selectState(String state){
		boolean IsTrue=false;
		element = pageTwoLoc.statetextbox();
		if(element != null){
			WebTextBox.selectValueFromDropDown(element, "- Select -");
			WebTextBox.selectValueFromDropDown(element, state);
			IsTrue=true;
		}
		return IsTrue;
	}
	
	public boolean selectPracticeSetting(String practiceSetting){
		boolean IsTrue=false;
		element = pageTwoLoc.PracticeSettingBox();
		if(element != null){
			WebTextBox.selectValueFromDropDown(element, "- Select -");
			WebTextBox.selectValueFromDropDown(element, practiceSetting);
			IsTrue=true;
		}
		return IsTrue;
	}
	
	public boolean clickSaveButton(){
		boolean IsTrue=false;
		element = pageTwoLoc.SaveBtn();
		if(element != null){
			WebButton.click(element);
			IsTrue=true;
		}
		return IsTrue;
	}
}
