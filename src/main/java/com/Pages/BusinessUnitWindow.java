package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Base.Base;
import com.Utilities.HighlightFailedElements;

public class BusinessUnitWindow extends Base {

	public BusinessUnitWindow() throws Exception {
		super();
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='btn_Grid_Businessunit_iladd']")
	WebElement BAdd;
	
	@FindBy(xpath="//input[@class='editable']")
	WebElement BAddUnit;
	
	@FindBy(id="btn_Grid_Businessunit_ilsave")
	WebElement SaveBtn;
	
	@FindBy(id="btn_Grid_Businessunit_ilcancel")
	WebElement CancelBtn;
	
	//Full Table id
	@FindBy(xpath="//tr[@role='row']")
	WebElement OverallTable;
	
	@FindBy(id="popup_ok")
	WebElement PopUpOk;
	
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
	
	
	public void AddBusinessOpt() throws InterruptedException{
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", BAdd, driver);
		HighlightFailedElements.drawBorder(BAdd, driver);
		
		Thread.sleep(4000);
		
		BAdd.click();

		
	}

	public void AddData(String arg1) throws InterruptedException{
		
		Thread.sleep(6000);
		
		BAddUnit.sendKeys(arg1);
		
		SaveBtn.click();
		
		WebElement w = driver.findElement(By.xpath("//div[text()='Saved successfully']"));
		
		String s = w.getText();
		
		System.out.println(s);
		
		Thread.sleep(8000);
		
		PopUpOk.click();
		
		Thread.sleep(4000);
		
	}

	public void DuplicateData() throws InterruptedException{
		
		BAdd.click();
		
		
		Thread.sleep(6000);
		
		BAddUnit.sendKeys("Unit");
		
		SaveBtn.click();
		
		WebElement w = driver.findElement(By.xpath("//div[text()='Business Unit Already Exists']"));
		
		String s = w.getText();
		
		System.out.println(s);
		
		Thread.sleep(8000);
		
		PopUpOk.click();
		
		Thread.sleep(4000);
		
		
		
	}

	public void Cancel() throws InterruptedException{
		BAdd.click();

	}

	public void Cancel(String arg1) throws InterruptedException{
		BAddUnit.sendKeys(arg1);
		
		CancelBtn.click();
		
		Thread.sleep(4000);
	}

	public void EditBtnClick() throws InterruptedException{
		
		EditBtn.click();
		
		
	}

	public void getErrormessage() throws InterruptedException{
		
		WebElement w = driver.findElement(By.xpath("//div[text()='Please Select the row(s)']"));
		
		Thread.sleep(2000);
		
		String s = w.getText();
		
		System.out.println(s);
		
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
		
		EditBtn.click();
		SecondUnit.clear();
		SecondUnit.sendKeys("Behave");
		SaveBtn.click();
		
		WebElement w = driver.findElement(By.xpath("//div[text()='Updated Successfully']"));
		
		String s = w.getText();
		
		System.out.println(s);
		
		Thread.sleep(8000);
		
		PopUpOk.click();
		
		Thread.sleep(4000);
		
		
	}

	public void Delete(){
		
		DeleteBtn.click();
		
	}

	public void getErrormessage1() throws InterruptedException{
		
	WebElement w = driver.findElement(By.xpath("//div[text()='Please select records to delete']"));
		
		Thread.sleep(2000);
		
		String s = w.getText();
		
		System.out.println(s);
		
		Thread.sleep(8000);
		
		PopUpOk.click();
		
		Thread.sleep(4000);
		
	}

	public void DeleteData() throws InterruptedException{
		
		CheckBox.click();
		
		DeleteBtn.click();

		WebElement w = driver.findElement(By.xpath("//div[text()='Are you sure to delete the selected item(s)?']"));
		System.out.println(w);
		
		Thread.sleep(8000);
		
		PopUpOk.click();
		
		Thread.sleep(8000);
		
		String s = DeletedSuccessfully.getText();
		
		System.out.println(s);
		
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
