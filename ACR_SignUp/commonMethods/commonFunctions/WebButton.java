package commonFunctions;

import org.openqa.selenium.WebElement;

public class WebButton {
	
	public static void click(WebElement button) {
		button.click();
	}
	
	public static void selectRadioButton(WebElement radioButton) {
		if(radioButton.isSelected()) {
		}else {
			radioButton.click();
		}
	}
	
	public static void check_CheckBox(WebElement checkbox) {
		if(checkbox.isSelected()) {
			
		}else {
			checkbox.click();
		}	
	}
	
	public static void uncheck_CheckBox(WebElement checkbox) {
		if(checkbox.isSelected()) {
			checkbox.click();
		}
	}
	
	public static boolean button_isDisplayed(WebElement button) {
		return button.isDisplayed();
	}
	
	public static boolean button_isSelected(WebElement button) {
		return button.isSelected();
	}
	
	public static boolean button_isEnable(WebElement button) {
		return button.isEnabled();
	}
	
	
}
