package com.stepDefinition;

import com.Base.Base;
import com.Pages.BusinessUnitWindow;
import com.Pages.EntityPage;
import com.Pages.HomePage;
import com.Pages.LoginPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class BusinessUnitTypeWindowVerify extends Base {

	public LoginPage login;
	public HomePage home;
	public EntityPage ent;
	public BusinessUnitWindow bu;
	
	
	public BusinessUnitTypeWindowVerify() throws Exception {
		super();
		
	}
	
	@Before("@Fifth")
	public void setUp() throws Exception{
		start();
		
		login = new LoginPage();
		
		home = login.Login();
		
		ent = home.EntityTest();
		
		bu = ent.BusinessUnitTest();
		
		
		
	}
	
	
	@Given("^Click on Add button$")
	public void Click_on_Add_button() throws Throwable {
	    
		bu.AddBusinessOpt();
		
	}

	@When("^Enter the Business unit data \"([^\"]*)\" and save$")
	public void Enter_the_Business_unit_data_and_save(String arg1) throws Throwable {
	    
		bu.AddData(arg1);
		
	}

	@Given("^Enter the duplicate data and get the error message$")
	public void Enter_the_duplicate_data_and_get_the_error_message() throws Throwable {
	    
		bu.DuplicateData();
		
	}

	@Given("^Click on add buttons$")
	public void Click_on_add_buttons() throws Throwable {
	   
		bu.Cancel();
		
	}

	@When("^Enter the data \"([^\"]*)\" and cancel$")
	public void Enter_the_data_and_cancel(String arg1) throws Throwable {
	  
		bu.Cancel(arg1);
		
	}

	@Given("^Click on Edit Button$")
	public void Click_on_Edit_Button() throws Throwable {
	   
		bu.EditBtnClick();
		
	}

	@When("^get the error message of Business Unit$")
	public void get_the_error_message_of_Business_Unit() throws Throwable {
	    
		bu.getErrormessage();
		
	}

	@Given("^Click Overall Check box$")
	public void Click_Overall_Check_box() throws Throwable {
	    
		bu.OverallCheckBoxTest();
		
	}

	@When("^Click Individual check box$")
	public void Click_Individual_check_box() throws Throwable {
	    
		bu.ClickCheckBox();
		
	}

	@When("^Click on edit Button and save the data$")
	public void Click_on_edit_Button_and_save_the_data() throws Throwable {
	    
		bu.EditData();
		
	}

	@Given("^Click delete button$")
	public void Click_delete_button() throws Throwable {
	    
		bu.Delete();
		
	}

	@When("^get the error message of delete button in BusinesUnit$")
	public void get_the_error_message_of_delete_button_in_BusinesUnit() throws Throwable {
	    
		bu.getErrormessage1();
		
	}

	@Given("^Delete the data in Business Unit$")
	public void Delete_the_data_in_Business_Unit() throws Throwable {
	    
		bu.DeleteData();
		
	}
	
	
	
	@After
	public void tesardown(){
		
		
		driver.quit();
	}

}
