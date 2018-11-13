package commonFunctions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementCommon {
	
	public static boolean IsDisplayed(WebElement ele) {
		boolean isDisp = false;
		if(ele.isDisplayed()) {
			isDisp= true;
		}
		return isDisp;
	}
	
	public static boolean IsEnabled(WebElement ele) {
		boolean isEnab = false;
		if(ele.isEnabled()){
			isEnab=true;
		}
		return isEnab;
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
	
    public static boolean compareValidation(WebElement ele, WebDriver driver,String expectedmsg)
    {
        try{
        	String Data1 = ele.getText().toLowerCase();
        	String Data2 = expectedmsg.toLowerCase();
        	assertEquals(Data1,Data2);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

}
