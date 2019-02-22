package com.Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Base.Base;
import com.Utilities.HighlightFailedElements;
import com.Utilities.waitdriver;


public class AddEntitypage extends Base {

	public waitdriver wait;
	
	public AddEntitypage() throws Exception {
		super();
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="tblEntityName")
	WebElement EntityName;
	
	@FindBy(id="txtShortName")
	WebElement ShortName;
	
	@FindBy(id="txtEntitytype_chzn")
	WebElement EntityType;
	
	@FindBy(id="txtBusinessunit_chzn")
	WebElement BusinessUnit;
	
	@FindBy(id="txtSitefun_chzn")
	WebElement SiteFunction;
	
	@FindBy(id="txtEntitytype_chzn_o_2")
	WebElement EntityDropdown;
	
	@FindBy(id="txtBusinessunit_chzn_o_1")
	WebElement BusinessUnitDropDown;
	
	@FindBy(id="txtSitefun_chzn_o_1")
	WebElement SiteFunctionDropDown;
	
	@FindBy(id="ddStatus")
	WebElement SiteDropdown;
	
	@FindBy(id="ddIsSite")
	WebElement IsSiteDropdown;
	
	@FindBy(id="txtAddressNew")
	WebElement Address;
	
	@FindBy(id="txtContactNoNew")
	WebElement Contacts;
	
	@FindBy(id="txtFaxNoNew")
	WebElement Fax;
	
	@FindBy(id="Img1")
	WebElement Country;
	
	@FindBy(id="CountryDropdown")
	WebElement CountryDropdown;
	
	@FindBy(id="StateDropdown")
	WebElement StateDropdown;
	
	@FindBy(id="CityDropdown")
	WebElement CityDropdown;

	@FindBy(id="btnDoneLocation")
	WebElement DoneBtn;
	
	
	public void EntityName(String arg1) throws InterruptedException{
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", EntityName, driver);
		HighlightFailedElements.drawBorder(EntityName, driver);
		EntityName.sendKeys(arg1);
		
		Thread.sleep(5000);
		
		
	}
	
	public void EntityShortName(String arg1) throws InterruptedException{
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", ShortName, driver);
		HighlightFailedElements.drawBorder(ShortName, driver);
		
		ShortName.sendKeys(arg1);

		Thread.sleep(5000);
	}
	
	public void EntityTypeDropdown() throws InterruptedException{
		
		Thread.sleep(5000);
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", EntityType, driver);
		HighlightFailedElements.drawBorder(EntityType, driver);
		
		EntityType.click();
		
		Thread.sleep(5000);
		
		EntityDropdown.click();
		
		Thread.sleep(5000);
		
		
	}
	
	public void BusinessUnitDropdown() throws InterruptedException{
		
		Thread.sleep(5000);
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", BusinessUnit, driver);
		HighlightFailedElements.drawBorder(BusinessUnit, driver);
		
		BusinessUnit.click();
		
		Thread.sleep(5000);
		
		BusinessUnitDropDown.click();
		
		Thread.sleep(5000);
	}
	
	public void SiteFunctionDropDown() throws InterruptedException{
		
		Thread.sleep(5000);
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", SiteFunction, driver);
		HighlightFailedElements.drawBorder(SiteFunction, driver);
		
		SiteFunction.click();
		
		Thread.sleep(5000);
		
		SiteFunctionDropDown.click();
		
		Thread.sleep(5000);
		
		
	}
	
	public void SiteDropDown() throws InterruptedException{
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", SiteDropdown, driver);
		HighlightFailedElements.drawBorder(SiteDropdown, driver);
		
		Select site = new Select(SiteDropdown);
		site.selectByValue("1");
		
		Thread.sleep(5000);
	}
	
public void IsSiteDropDown() throws InterruptedException{
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", IsSiteDropdown, driver);
		HighlightFailedElements.drawBorder(IsSiteDropdown, driver);
		
		Select Issite = new Select(IsSiteDropdown);
		Issite.selectByValue("1");
		
		Thread.sleep(5000);
	}

public void Address() throws InterruptedException{
	
	HighlightFailedElements.changeColor("rgb(0,200,0)", Address, driver);
	HighlightFailedElements.drawBorder(Address, driver);
	
	Address.sendKeys("Entity home");
	
	Thread.sleep(4000);
	
	
}

public void Contacts() throws InterruptedException{
	
	HighlightFailedElements.changeColor("rgb(0,200,0)", Contacts, driver);
	HighlightFailedElements.drawBorder(Contacts, driver);
	
	Contacts.sendKeys("12345678");
	
	Thread.sleep(4000);
	
}

public void Fax() throws InterruptedException{
	
	HighlightFailedElements.changeColor("rgb(0,200,0)", Fax, driver);
	HighlightFailedElements.drawBorder(Fax, driver);
	
	Fax.sendKeys("Entity");
	Thread.sleep(4000);
	
}

public void Country() throws InterruptedException{
	
	Country.click();
	
	Thread.sleep(4000);
	
	Set<String> countries = driver.getWindowHandles();
	
	System.out.println(countries.size());
	
	Iterator<String> i1 = countries.iterator();
	
	String parent = i1.next();
	
	String child = i1.next();
	
	driver.switchTo().window(child);
	
	String s = driver.getTitle();
	
	System.out.println(s);
	
	waitdriver.ExpWait(driver, CountryDropdown, 20);
		
		Select country = new Select(CountryDropdown);
		country.selectByValue("99");
		
		waitdriver.ExpWait(driver, StateDropdown, 20);
		
		Select state = new Select(StateDropdown);
		state.selectByValue("17");
		
		waitdriver.ExpWait(driver, CityDropdown, 20);
		
		Select city = new Select(CityDropdown);
		city.selectByValue("12");
		
		waitdriver.ExpWait(driver, DoneBtn, 20);
		
		DoneBtn.click();
		
		Thread.sleep(4000);
		
	
}


	
	
}
