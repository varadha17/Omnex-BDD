package com.Pages;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Base.Base;

public class EntityPage extends Base {

	public EntityPage() throws Exception {
		super();
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@value='Entity Type']")
	WebElement EntityTypeBtn;
	
	@FindBy(id="tblEntityName")
	WebElement Entity;
	
	@FindBy(xpath="//input[@id='txtShortName']")
	WebElement EntityshortNmae;
	
	@FindBy(xpath="//span[text()='Select Entity Type']")
	WebElement EntityTypeOpt;
	
	@FindBy(xpath="//input[@value='Business Unit']")
	WebElement BusinessUnitBtn; 
	
	@FindBy(xpath="//input[@value='Site Function']")
	WebElement SiteFunctionBtn; 
	
	@FindBy(xpath="//input[@value='Refresh']")
	WebElement RefreshBtn;
	
	@FindBy(id="txtBusinessunit_chzn")
	WebElement BusinessUnitOpt;
	
	@FindBy(id="txtSitefun_chzn")
	WebElement SiteFunctionOpt;
	
	@FindBy(id="ddStatus")
	WebElement Status;
	
	@FindBy(id="ddIsSite")
	WebElement IsSite;
	
	@FindBy(id="txtAddressNew")
	WebElement AddressOpt;
	
	@FindBy(id="txtContactNoNew")
	WebElement ContactPerson;
	
	@FindBy(id="txtFaxNoNew")
	WebElement FaxDetails;
	
	@FindBy(id="Img1")
	WebElement CountryClick;
	
	@FindBy(id="Img2")
	WebElement StateClick;
	
	@FindBy(id="Img3")
	WebElement CityClick;
	
	@FindBy(id="txtBrachNoNew")
	WebElement BranchNumber;
	
	@FindBy(id="ddselCurrencyNew")
	WebElement CurrencyOpt;
	
	@FindBy(id="ddlRoute")
	WebElement Route;

	@FindBy(id="lblAddContactPer")
	WebElement AddContactPerson;
	
	@FindBy(id="AlinkS1")
	WebElement CorporateSite;
	
	@FindBy(id="Detailview")
	WebElement frames;
	
	@FindBy(xpath="//input[@id='btn_Grid_Businessunit_iladd']")
	WebElement EntityAdd;
	
	@FindBy(id="AlinkS1")
	WebElement CorporateLink;
	
	@FindBy(id="addparentEntitybtn")
	WebElement parent;
	
	
public EntityTypeWindow EntityButton() throws Exception{
		
		driver.switchTo().frame(frames);
		
		Thread.sleep(2000);
		
		EntityTypeBtn.click();
		
		Set<String> handle = driver.getWindowHandles();
		System.out.println(handle.size());
		
		Iterator<String> i1 = handle.iterator();

		String parent = i1.next();
		
		String child = i1.next();
		
		System.out.println(parent);
		System.out.println(child);
		
		driver.switchTo().window(child);
		Thread.sleep(6000);
		
		String s1 = driver.getTitle();
		
		System.out.println(s1);
		
		if(s1.equals("Business Unit")){
			
			System.out.println("Display Entity Window");
			
			
		}
		else{
			System.out.println("entity Window not displaying");
			
		}
		
		
		return new EntityTypeWindow();
	}

public BusinessUnitWindow BusinessUnitTest() throws Exception{
	
	driver.switchTo().frame(frames);
	
	Thread.sleep(2000);
	
	BusinessUnitBtn.click();
	
	Set<String> handle1 = driver.getWindowHandles();
	System.out.println(handle1.size());
	
	Iterator<String> i1 = handle1.iterator();
	
	String parent1 = i1.next();
	
	String child1 = i1.next();
	
	System.out.println(parent1);
	System.out.println(child1);
	
	driver.switchTo().window(child1);
	Thread.sleep(6000);
	
	String s = driver.getTitle();
	
	System.out.println(s);
	
	if(s.equals("Business Unit")){
		
		System.out.println("Business unit Window displayed");
		
		
	}else{
		
		System.out.println("Business unit Window not displayed");
		
	}
	
	return new BusinessUnitWindow();
	
	
}

public SiteFunctionWin siteFunctionTest() throws Exception{
	
	driver.switchTo().frame(frames);
	
	Thread.sleep(2000);
	
	SiteFunctionBtn.click();
	
	Set<String> handle2 = driver.getWindowHandles();
	System.out.println(handle2.size());
	
	Iterator<String> i1 = handle2.iterator();
	
	String parent2 = i1.next();
	String child2 = i1.next();
	
	System.out.println(parent2);
	System.out.println(child2);
	
	driver.switchTo().window(child2);
	Thread.sleep(6000);
	
	String s = driver.getTitle();
	
	System.out.println(s);
	
	if(s.equals("Business Unit")){
		
		System.out.println("Site Type Window is Displayed");
	} else{
		
		System.out.println("Site Type Window is not displayed");
	}
	
	
	return new SiteFunctionWin();
		
	
	
}

public void RightClick() throws InterruptedException{
	
	driver.switchTo().frame(frames);
	Thread.sleep(6000);
	Actions a1 = new Actions(driver);
	a1.contextClick(CorporateLink).build().perform();
	Thread.sleep(8000);
	
	
}

public AddEntitypage AddParentEntity() throws Exception{
	driver.switchTo().frame(frames);
	Thread.sleep(6000);
	Actions a1 = new Actions(driver);
	a1.contextClick(CorporateLink).build().perform();
	Thread.sleep(8000);
	
	WebElement w = driver.findElement(By.id("addparentEntitybtn"));
	
	String s = w.getText();
	
	System.out.println(s);
	
	WebElement lbl = driver.findElement(By.id("lblSelectedEntity"));
	
	String s1 = lbl.getText();
	
	Thread.sleep(10000);
	JavascriptExecutor je = (JavascriptExecutor)driver;
	je.executeScript("arguments[0].click();", w);
	
	Thread.sleep(4000);
	
	System.out.println(s1);
	
	if(s1.equals("Entity Path: Corporate")){
		
		System.out.println("Add Parent is Displayed");
		
	}else{
		System.out.println("Add parent is not Displayed");
	}
	

	return new AddEntitypage();
	
}




	

}
