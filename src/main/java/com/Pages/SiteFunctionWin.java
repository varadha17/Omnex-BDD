package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Base.Base;
import com.Utilities.HighlightFailedElements;



public class SiteFunctionWin extends Base{

	public SiteFunctionWin() throws Exception {
		super();
	
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='btn_Grid_Businessunit_iladd']")
	WebElement SAdd;
	
	@FindBy(xpath="//input[@class='editable']")
	WebElement SAddUnit;
	
	@FindBy(id="btn_Grid_Businessunit_ilsave")
	WebElement SaveBtn;
	
	@FindBy(id="btn_Grid_Businessunit_ilcancel")
	WebElement CancelBtn;
	
	@FindBy(id="popup_ok")
	WebElement PopUpOk;
	
	@FindBy(xpath="//div[text()='Site Function Already Exists']")
	WebElement DuplicateError;
	
	@FindBy(id="btn_Grid_Businessunit_iledit")
	WebElement EditBtn;
	
	@FindBy(id="jqg_Grid_Businessunit_2")
	WebElement CheckBox;
	
	@FindBy(id="cb_Grid_Businessunit")
	WebElement OverallCheckBox;
	
	@FindBy(xpath="//input[@class='editable']")
	WebElement SecondUnit;
	
	@FindBy(id="del_Grid_Businessunit_top")
	WebElement DeleteBtn;
	
	@FindBy(id="Grid_Businessunitsearchevent")
	WebElement SearchBtn;
	
	@FindBy(xpath="//select[@class='opsel']")
	WebElement AllSearchClick;
	
	@FindBy(id="fbox_Grid_Businessunit_search")
	WebElement FindBtn;

	@FindBy(xpath="div[text()='Deleted successfully']")
	WebElement DeletedSuccessfully;
	
	@FindBy(xpath="div[text()='Dependency exist data cannot deleted']")
	WebElement DependencyExist;
	
	@FindBy(xpath="//div[text()='Please Select the row(s)']")
	WebElement EditError;
	
	@FindBy(xpath="//div[text()='Updated Successfully']")
	WebElement UpdatedMsg;
	
	@FindBy(xpath="//div[text()='Please select records to delete']")
	WebElement DeleteError;
	
public void AddSiteOpt() throws InterruptedException{
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", SAdd, driver);
		HighlightFailedElements.drawBorder(SAdd, driver);
		
		Thread.sleep(4000);
		
		SAdd.click();

		
	}

	public void AddData(String arg1) throws InterruptedException{
		
		Thread.sleep(6000);
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", SAddUnit, driver);
		HighlightFailedElements.drawBorder(SAddUnit, driver);
		Thread.sleep(4000);
		
		SAddUnit.sendKeys(arg1);
		
		SaveBtn.click();
		
		WebElement w = driver.findElement(By.xpath("//div[text()='Saved successfully']"));
		
		String s = w.getText();
		
		System.out.println(s);
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", PopUpOk, driver);
		HighlightFailedElements.drawBorder(PopUpOk, driver);
		Thread.sleep(8000);
		
		PopUpOk.click();
		
		Thread.sleep(4000);
		
	}

	public void DuplicateData(String arg1) throws InterruptedException{
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", SAdd, driver);
		HighlightFailedElements.drawBorder(SAdd, driver);
		Thread.sleep(2000);
		SAdd.click();
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", SAddUnit, driver);
		HighlightFailedElements.drawBorder(SAddUnit, driver);

		Thread.sleep(6000);
		
		SAddUnit.sendKeys(arg1);
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", SaveBtn, driver);
		HighlightFailedElements.drawBorder(SaveBtn, driver);
		Thread.sleep(3000);
		
		SaveBtn.click();
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", DuplicateError, driver);
		HighlightFailedElements.drawBorder(DuplicateError, driver);
		
		Thread.sleep(2000);
		
		String s = DuplicateError.getText();
		
		System.out.println(s);
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", PopUpOk, driver);
		HighlightFailedElements.drawBorder(PopUpOk, driver);
		
		Thread.sleep(8000);
		
		PopUpOk.click();
		
		Thread.sleep(4000);
		
		
		
	}

	public void Cancel() throws InterruptedException{
		HighlightFailedElements.changeColor("rgb(0,200,0)", SAdd, driver);
		HighlightFailedElements.drawBorder(SAdd, driver);
		
		Thread.sleep(2000);
		
		SAdd.click();

	}

	public void Cancel(String arg1) throws InterruptedException{
		HighlightFailedElements.changeColor("rgb(0,200,0)", SAddUnit, driver);
		HighlightFailedElements.drawBorder(SAddUnit, driver);
		
		Thread.sleep(2000);
		SAddUnit.sendKeys(arg1);
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", CancelBtn, driver);
		HighlightFailedElements.drawBorder(CancelBtn, driver);
		
		Thread.sleep(2000);
		
		CancelBtn.click();
		
		Thread.sleep(4000);
	}
	
public void EditBtnClick() throws InterruptedException{
		
	HighlightFailedElements.changeColor("rgb(0,200,0)",EditBtn, driver);
	HighlightFailedElements.drawBorder(EditBtn, driver);
	
	Thread.sleep(2000);
	
		EditBtn.click();
		
		
	}

	public void getErrormessage() throws InterruptedException{
		
		HighlightFailedElements.changeColor("rgb(0,200,0)",EditError, driver);
		HighlightFailedElements.drawBorder(EditError, driver);
		
		Thread.sleep(2000);
		
		String s = EditError.getText();
		
		System.out.println(s);
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", PopUpOk, driver);
		HighlightFailedElements.drawBorder(PopUpOk, driver);
		
		Thread.sleep(8000);
		
		PopUpOk.click();
		
		Thread.sleep(4000);
		
		
		
	}

	public void ClickCheckBox() throws InterruptedException{
		//Click Checkbox
		CheckBox.click();
		Thread.sleep(2000);
		
		//Uncheck checkBox
		CheckBox.click();
		Thread.sleep(2000);
		
		//Click Checkbox
		CheckBox.click();
		Thread.sleep(2000);
		
	}

	public void OverallCheckBoxTest() throws InterruptedException{
		
		//Click Checkbox
		OverallCheckBox.click();
		Thread.sleep(3000);
		
		//Uncheck checkBox
		OverallCheckBox.click();
		Thread.sleep(3000);
		
	}

	public void EditData() throws InterruptedException{
		
		HighlightFailedElements.changeColor("rgb(0,200,0)",EditBtn, driver);
		HighlightFailedElements.drawBorder(EditBtn, driver);
		
		Thread.sleep(2000);
		EditBtn.click();
		SecondUnit.clear();
		SecondUnit.sendKeys("Trick");
		
		HighlightFailedElements.changeColor("rgb(0,200,0)",SaveBtn, driver);
		HighlightFailedElements.drawBorder(SaveBtn, driver);
		
		Thread.sleep(2000);
		
		SaveBtn.click();
		
		HighlightFailedElements.changeColor("rgb(0,200,0)",UpdatedMsg, driver);
		HighlightFailedElements.drawBorder(UpdatedMsg, driver);
		
		Thread.sleep(2000);
		
		String s = UpdatedMsg.getText();
		
		System.out.println(s);
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", PopUpOk, driver);
		HighlightFailedElements.drawBorder(PopUpOk, driver);
		
		Thread.sleep(8000);
		
		PopUpOk.click();
		
		Thread.sleep(4000);
		
		
	}

	public void Delete() throws InterruptedException{
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", DeleteBtn, driver);
		HighlightFailedElements.drawBorder(DeleteBtn, driver);
		
		Thread.sleep(2000);
		
		DeleteBtn.click();
		
	}

	public void getErrormessage1() throws InterruptedException{
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", DeleteError, driver);
		HighlightFailedElements.drawBorder(DeleteError, driver);
		
		Thread.sleep(3000);
		
		String s = DeleteError.getText();
		
		System.out.println(s);
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", PopUpOk, driver);
		HighlightFailedElements.drawBorder(PopUpOk, driver);
		
		Thread.sleep(8000);
		
		PopUpOk.click();
		
		Thread.sleep(4000);
		
	}

	public void DeleteData() throws InterruptedException{
		
		CheckBox.click();
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", DeleteBtn, driver);
		HighlightFailedElements.drawBorder(DeleteBtn, driver);
		
		Thread.sleep(3000);
		
		DeleteBtn.click();

		WebElement w = driver.findElement(By.xpath("//div[text()='Are you sure to delete the selected item(s)?']"));
		System.out.println(w);
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", PopUpOk, driver);
		HighlightFailedElements.drawBorder(PopUpOk, driver);
		
		Thread.sleep(8000);
		
		PopUpOk.click();
		
		Thread.sleep(8000);
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", PopUpOk, driver);
		HighlightFailedElements.drawBorder(PopUpOk, driver);
		
		Thread.sleep(8000);
		
		PopUpOk.click();

		Thread.sleep(4000);
			
	}

	public void SearchButton() throws InterruptedException{
		
		SearchBtn.click();
		
		Thread.sleep(10000);
		
		Select s1 = new Select(AllSearchClick);
		
		s1.selectByValue("OR");
		
		Thread.sleep(6000);
		
		FindBtn.click();
		
		Thread.sleep(4000);
		
		
		
	}
	
	
}
