package com.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.Base.Base;

public class waitdriver extends Base {

	public waitdriver() throws Exception {
		super();
		
	}
	
	public static void ExpWait(WebDriver driver, WebElement element, int timeout){
		
	new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));	
	element.click();	
	}
	
	
	
	

}
