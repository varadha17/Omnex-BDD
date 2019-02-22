package com.Pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Base.Base;
import com.Utilities.waitdriver;

public class EntityTypeWindow extends Base {

	public EntityTypeWindow() throws Exception {
		super();
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='btn_Grid_Businessunit_iladd']")
	WebElement EntityAdd;
	
	@FindBy(id="jqg1_EntityType")
	WebElement EAddName;
	
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
	
	@FindBy(id="jqg_Grid_Businessunit_1")
	WebElement CheckBox;
	
	@FindBy(id="cb_Grid_Businessunit")
	WebElement OverallCheckBox;
	
	@FindBy(xpath="//input[@class='editable']")
	WebElement SecondEntity;
	
	@FindBy(id="del_Grid_Businessunit_top")
	WebElement DeleteBtn;
	
	@FindBy(id="Grid_Businessunitsearchevent")
	WebElement SearchBtn;
	
	@FindBy(xpath="//select[@class='opsel']")
	WebElement AllSearchClick;
	
	@FindBy(id="fbox_Grid_Businessunit_search")
	WebElement FindBtn;
	
public void AddEntityOpt() throws InterruptedException{
	
	EntityAdd.click();

	
}

public void AddData(String arg1) throws InterruptedException{
	
	EAddName.sendKeys(arg1);
	
	SaveBtn.click();
	
	WebElement w = driver.findElement(By.xpath("//div[text()='Saved successfully']"));
	
	String s = w.getText();
	
	System.out.println(s);
	
	Thread.sleep(8000);
	
	PopUpOk.click();
	
	Thread.sleep(4000);
	
}

public void DuplicateData() throws InterruptedException{
	
	EntityAdd.click();
	
	EAddName.sendKeys("BDD");
	
	SaveBtn.click();
	
	WebElement w = driver.findElement(By.xpath("//div[text()='Entity Type Already Exists']"));
	
	String s = w.getText();
	
	System.out.println(s);
	
	Thread.sleep(8000);
	
	PopUpOk.click();
	
	Thread.sleep(4000);
	
	
	
}

public void Cancel() throws InterruptedException{
	EntityAdd.click();

}

public void Cancel(String arg1) throws InterruptedException{
	EAddName.sendKeys(arg1);
	
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
	SecondEntity.clear();
	SecondEntity.sendKeys("ADD");
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
	
	Thread.sleep(6000);
	WebElement w = driver.findElement(By.xpath("//div[text()='Are you sure to delete the selected item(s)?']"));
	
	Thread.sleep(2000);
	
	String st = w.getText();
	
	System.out.println(st);
	
	Thread.sleep(8000);
	
	PopUpOk.click();
	
	Thread.sleep(6000);
	
	WebElement w1 = driver.findElement(By.xpath("//div[text()='Deleted successfully']"));
	
	Thread.sleep(2000);
	
	String s = w1.getText();
	
	System.out.println(s);
	
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
