package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	public static boolean textbox_isDisplayed(WebElement textbox) {
		return textbox.isDisplayed();
	}
	
	public static boolean textbox_isEnabled(WebElement textbox) {
		return textbox.isEnabled();
	}
	
	public static boolean IsClickable(WebElement ele, WebDriver driver) 
    {
        try{
            WebDriverWait wait = new WebDriverWait(driver, 6);
            wait.until(ExpectedConditions.elementToBeClickable(ele));
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}

