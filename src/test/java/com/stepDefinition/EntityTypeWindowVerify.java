package com.stepDefinition;

import com.Base.Base;
import com.Pages.EntityPage;
import com.Pages.EntityTypeWindow;
import com.Pages.HomePage;
import com.Pages.LoginPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class EntityTypeWindowVerify extends Base {


	public LoginPage login;
	public HomePage home;
	public EntityPage ent;
	public EntityTypeWindow et;
	
	public EntityTypeWindowVerify() throws Exception {
		super();
		
	}
	
	@Before("@Fourth")
	public void setUp() throws Exception{
		start();
		
		login = new LoginPage();
		
		home = login.Login();
		
		ent = home.EntityTest();
		
		et = ent.EntityButton();
		
		
		
	}
	
	@Given("^Click on Add Button$")
	public void Click_on_Add_Button() throws Throwable {
	   
		et.AddEntityOpt();
		
	}

	@When("^Enter the data \"([^\"]*)\" and save$")
	public void Enter_the_data_and_save(String arg1) throws Throwable {
	   
		et.AddData(arg1);
	}
	
	@Given("^Click on Add Buttons$")
	public void Click_on_Add_Buttons() throws Throwable {
	    
		et.Cancel();
		
	}

	@When("^Enter the data \"([^\"]*)\" and Cancel$")
	public void Enter_the_data_and_Cancel(String arg1) throws Throwable {
	    et.Cancel(arg1);
	}
	
	@Given("^click on edit button$")
	public void click_on_edit_button() throws Throwable {
	    
		et.EditBtnClick();
		
	}

	@When("^get the error message$")
	public void get_the_error_message() throws Throwable {
	    
		et.getErrormessage();
		
	}


@Given("^click on Overall check box$")
public void click_on_Overall_check_box() throws Throwable {
   
	et.OverallCheckBoxTest();
	
}

@When("^click on check box$")
public void click_on_check_box() throws Throwable {
    
	et.ClickCheckBox();
}

@When("^click on edit button and Save$")
public void click_on_edit_button_and_Save() throws Throwable {
    
	et.EditData(); 
	
}


@Given("^Click on delete button$")
public void Click_on_delete_button() throws Throwable {
    
	et.Delete();
	
}

@When("^get the error message of delete button$")
public void get_the_error_message_of_delete_button() throws Throwable {
    
	et.getErrormessage1();
	
}

@Given("^Delete the data$")
public void Delete_the_data() throws InterruptedException{
	
	et.DeleteData();
	
}

@Given("^Click on Search Button and get the data based on search result$")
public void Click_on_Search_Button_and_get_the_data_based_on_search_result() throws InterruptedException{
	
	et.SearchButton();
	
}

@Given("^Enter duplicate data and get the error message$")
public void Enter_duplicate_data_and_get_the_error_message() throws InterruptedException{
	
	et.DuplicateData();
	
}


	@After("@Fourth")
	public void tearDown(){
		
		driver.quit();
	}

}
