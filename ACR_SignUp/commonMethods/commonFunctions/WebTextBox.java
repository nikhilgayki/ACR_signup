package commonFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebTextBox {
	
	public static void clearTextbox(WebElement textbox) {
		textbox.clear();
	}
	
	public static void sendInput(WebElement textbox, String text) {
		textbox.sendKeys(text);
	}
	
	public static void selectValueFromDropDown(WebElement dropDown, String visibleText) {
		Select dropdown = new Select(dropDown);
		dropdown.selectByVisibleText(visibleText);
	}
	
	public static void selectValueFromDropDownV(WebElement dropDown, String Value) {
		Select dropdown = new Select(dropDown);
		dropdown.selectByValue(Value);
	}
	
	public static boolean textbox_isDisplayed(WebElement textbox) {
		return textbox.isDisplayed();
	}
	
	public static boolean textbox_isEnabled(WebElement textbox) {
		return textbox.isEnabled();
	}
	
}
